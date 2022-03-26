package lesson1;

public class Robot implements Runable, Jumpable{
    private final String name;
    private final int maxLength; // 500 м
    private final int maxJump; //200 см


    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public Robot(String name, int maxJump, int maxLength) {
        this.maxLength = maxLength;
        this.maxJump = maxJump;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String run (int length){
        if(length>maxLength){
            return (getName() + "не смог ");
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
