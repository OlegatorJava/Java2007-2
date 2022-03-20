package lesson1;

public class HomeWork1 {

    public static void main(String[] args) {
        Course c = new Course(new Treadmill(56),new Wall(67)); // Создаем полосу препятствий
        Team team = new Team(new Human("Валера", 25,100),
                new Cat("Барсик", 150,20),
                new Robot("R-208b", 200,2000)); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.info(); // Имена членов команды
        Team team2 = new Team(new Human("Игорь",50,10),
                new Cat("Бантик",10,2),
                new Robot("C-3PO",0,20)); // Создаем команду
        c.doIt(team2); // Просим команду пройти полосу
        team2.info(); // Имена членов команды
    }
}
