package CoreJava.MultiThreading;

public class MultiThreadUsingThread_2 extends Thread {

    //How multiThread execution works compared to single thread execution
    public static void main(String[] arguments){

        MultiThreadUsingThread_2 mtobj = new MultiThreadUsingThread_2();
        //Instead of executing overridden run() method we need to call start() method.
        mtobj.start();
        //we need to call start() method from Thread class, as it will create a new thread and executed the run() method.

        for (int j=0; j<=20; j++){
            System.out.print("j - "+j+"\t");
        }
    }

    public void run(){
        for (int i=0; i<=20; i++){
            System.out.print("i - "+i+"\t");
        }
    }

}