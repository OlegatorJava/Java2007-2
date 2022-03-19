package lesson1;

public interface Runable extends Motionable {

    @Override
    String getName();


    @Override
    String run(int length);
}
