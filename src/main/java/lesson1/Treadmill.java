package lesson1;

import java.util.Objects;

public class Treadmill extends Lat{
    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    boolean overcome(Motionable name) {

    if (Objects.equals(name.run(length), "не смог")){
        System.out.println(name.getName() + " не осилил дистанцию");
        return false;
        }else {
        System.out.println(name.getName() + " бежит по дорожке");
        return true;
    }
    }



}
