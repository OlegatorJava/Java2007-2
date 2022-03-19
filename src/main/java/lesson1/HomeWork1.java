package lesson1;

public class HomeWork1 {

    public static void main(String[] args) {
        Human man = new Human("Валера");
        Cat cat = new Cat("Барсик");
        Robot robot = new Robot("R-208b");
        Treadmill treadmill = new Treadmill(70);
        Wall wall = new Wall(90);
        Wall wall2 = new Wall(150);


        Motionable[] motions = new Motionable[]{man,cat,robot};
        Lat[] lats = new Lat[]{treadmill,wall,wall2};

        for (int i = 0; i < motions.length; i++) {
            for (int j = 0; j < lats.length; j++) {
                if(lats[j].overcome(motions[i]) == false){
                    i++;
                    j = -1;    // самому смешно на решение, но работает и даже универсально(если препятствий 85)
                }
            }
        }

    }
}
