package lesson1;

public class Human implements Runable, Jumpable {
    private final String name;
    private final int maxLength = 100; // 100 м
    private final int maxJump = 20; //20 см


    public Human(String name) {
        this.name = name;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public String getName() {
        return name;
    }


    @Override
    public String run(int length) {
        if (length > maxLength) {
            return "не смог";
        }
        return getName();


    }

    public String jump(int height) {
        if (height > maxJump) {
            return "не смог";
        }
        return getName();
    }


}
