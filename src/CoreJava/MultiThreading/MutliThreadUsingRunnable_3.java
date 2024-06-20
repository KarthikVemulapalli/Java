package CoreJava.MultiThreading;

/*
Implementing Runnable class is preferred and considered best practice than extends Thread class.
Because after extending Thread the class cannot extend any other class. Because Java doesn't support multiple inheritance.
 */

public class MutliThreadUsingRunnable_3 implements Runnable {

    public static void main(String[] args) {
        MutliThreadUsingRunnable_3 mtrobj = new MutliThreadUsingRunnable_3();
        //As Runnable class don't have start() method, we need to create instance of Thread class and pass class object
        Thread tdobj = new Thread(mtrobj);
        tdobj.start();

        for (int i=0; i<=20; i++){
            System.out.print("i - "+i+"\t");
        }
    }

    public void run(){
        for (int j=0; j<=20; j++){
            System.out.print("j - "+j+"\t");
        }
    }
}