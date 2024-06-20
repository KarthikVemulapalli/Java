package CoreJava.MultiThreading;

public class SingleThread_1 {

    //How SingleThread execution works
    public static void main(String[] arguments){

        SingleThread_1 stobj = new SingleThread_1();
        //Instead of executing overridden run() method we need to call start() method.
        stobj.logicCode();
        //we need to call start() method from Thread class, as it will create a new thread and executed the run() method.

        for (int j=0; j<=20; j++){
            System.out.print("j - "+j+"\t");
        }
    }

    public void logicCode(){
        for (int i=0; i<=20; i++){
            System.out.print("i - "+i+"\t");
        }
    }

}