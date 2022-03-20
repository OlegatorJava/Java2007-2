package lesson1;

public class HomeWork1 {

    public static void main(String[] args) {
        Course c = new Course(new Treadmill(56),new Wall(67)); // Создаем полосу препятствий
        Team team = new Team(new Human("Валера"), new Cat("Барсик"), new Robot("R-208b")); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.info(); // Имена членов команды
    }
}
