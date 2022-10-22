package CoreJava;

import java.util.Random;

public class RandomDemo {

    public static void main(String arguments[]){
        Random RandomObj = new Random();
        int RandomInt = RandomObj.nextInt(10);
        System.out.println(RandomInt);
    }

}
