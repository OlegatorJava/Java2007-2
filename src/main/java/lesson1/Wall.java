package lesson1;

import java.util.Objects;

public class Wall extends Lat {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
       boolean overcome(Motionable name){

            if (Objects.equals(name.jump(height), "не смог")) {
                System.out.println(name.getName() + " не смог перепрыгнуть");
                return false;
            } else {
                System.out.println(name.getName() + " прыгает через стену");
                return true;
            }
        }
    }

