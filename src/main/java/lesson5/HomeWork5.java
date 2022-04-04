package lesson5;

public class HomeWork5 {
    public static void main(String[] args) {
        firstMethod();
        secondMethod();
        System.out.println("END");
    }


    public static void firstMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i
                    / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() -
                startTime) + " ms.");
    }

    public static void secondMethod(){
        final int size = 10_000_000;
        final int h = size / 2;
        float[] arr = new float[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        float[] leftHalf = new float[(int) h];
        float[] rightHalf = new float[(int) h];
        System.arraycopy(arr, 0, leftHalf, 0, h);
        System.arraycopy(arr, h, rightHalf, 0, h);    // Создаем два массива для левой и правой части исходного
        //Thread thread1 = new MyThread(leftHalf);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < leftHalf.length; i++) {
                leftHalf[i] = (float) (leftHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i
                        / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < rightHalf.length; i++) {
                rightHalf[i] = (float) (rightHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i
                        / 5) * Math.cos(0.4f + i / 2));
            }
        });// Запускает два потока и параллельно просчитываем каждый малый массив


        float[] mergedArray = new float[size];
        System.arraycopy(leftHalf, 0, mergedArray, 0, h);// Склеиваем малые массивы обратно в один большой
        System.arraycopy(rightHalf, 0, mergedArray, h, h);


        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Two thread time: " + (System.currentTimeMillis() -
                startTime) + " ms.");

    }
}
