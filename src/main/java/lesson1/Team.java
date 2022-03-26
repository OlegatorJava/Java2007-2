package lesson1;

import java.util.Arrays;

public class Team {
    private Motionable[] arrayMotions;


    public Team(Human human, Cat cat, Robot robot) {
        this.arrayMotions= new Motionable[]{human, cat, robot};
    }


    public Motionable[] getArrayMotions() {
        return arrayMotions;
    }

    public void info(){
        for (int i = 0; i < getArrayMotions().length; i++) {
            System.out.print("Имя - " +(getArrayMotions()[i].getName()) + "," +
                    " Максимум прыжка(см) - " + (getArrayMotions()[i].getMaxJump()) + "," +
                    " Максимальная дистанция(м) - " + (getArrayMotions()[i].getMaxLength()));
            System.out.println();
        }

    }
}
