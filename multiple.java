import java.util.*;

interface operatingSystem{
    void start();
    void shutdown();
    void restart();
}
interface keyboard{
    void type();
    void pressKey(String key);
}

class Computer implements operatingSystem, keyboard{
    @Override
    public void start(){
        System.out.println("Computer is starting.");
    }

    @Override
    public void shutdown(){
        System.out.println("Computer is shutting down.");
    }

    @Override
    public void restart(){
        System.out.println("Computer is restarting.");
    }

    @Override
    public void type(){
        System.out.println("Typing on the keyboard.");
    }

    @Override
    public void pressKey(String key){
        System.out.println("Pressed key: " + key);
    }
}
public class multiple {
    public static void main(String[] args){
        Computer myComputer = new Computer();
        myComputer.start();
        myComputer.type();
        myComputer.pressKey("A");
        myComputer.restart();
        myComputer.shutdown();
    }
}