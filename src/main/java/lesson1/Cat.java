package lesson1;

public class Cat implements Runable, Jumpable{
    private final String name;
    private final int maxLength; // 45 м
    private final int maxJump; //100 см


    /** Конструктор**/

    public Cat(String name, int maxJump, int maxLength) {
        this.maxLength = maxLength;
        this.maxJump = maxJump;
        this.name = name;
    }

    /** геттеры и сеттеры **/

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public String getName() {
        return name;
    }


    /** МЕТОДЫ **/

    @Override
    public String run(int length) {
        if(length>maxLength){
            return "не смог";  //очень странное решение, но лучше пока не пришло...
        }
        return getName();

    }

    public String jump (int height){
        if (height > maxJump) {
            return "не смог";
        }
        return getName();
    }

}
