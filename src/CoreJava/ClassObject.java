package CoreJava;

public class ClassObject {

    private double balance = 500.00;   //State or Variable //Instance variable
    static int minimumBalance = 100;  //Static variable

    static {
        System.out.println("Static Block Executes First");
    }

    public double getBalance(int accountId) {   //Behavior or method
        int withdrawal = 200;   //Local variable
        return balance - withdrawal;
    }

    public static void main(String[] args) {   //main method

        ClassObject JavaConObj = new ClassObject();   //Object creation	//Reference Variable
        double value = JavaConObj.getBalance(4444);   //Method invocation

        System.out.println("Initial Balance is: " + JavaConObj.balance);
        System.out.println("The Balance After Withdrawal is: " + value);
        System.out.println("The Minimum Balance Required is: " + minimumBalance);
    }

}
