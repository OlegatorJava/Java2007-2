package lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) {
        Socket socket = null;
        DataInputStream in;
        DataOutputStream out;

        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {

                    try {

                        while (true) {
                            out.writeUTF((scanner.nextLine()));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.setDaemon(true);
            thread.start();


            while (true) {
                String str = in.readUTF();
                if (str.equals("/end")) {
                    out.writeUTF(str);
                    break;
                }
                System.out.println("Клиент написал " + str);
                out.writeUTF("Эхо: " + str);


            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
