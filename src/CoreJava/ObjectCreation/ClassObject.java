package CoreJava.ObjectCreation;

public class ClassObject {

    private double balance = 500.00;  //Instance variable - NonStatic Variables defined inside class and outside method
    static int minimumBalance = 100;  //Static variable

    //Static Block executed before Main Method
    static {
        System.out.println("Static Block Executes First");
    }

    public void getBalance(int WithdrawalAmount) {   //Behavior or method
        String AccountID = "BANKID000001";   //Local variable
        balance = balance - WithdrawalAmount;
    }

    public static void BankName(){
        System.out.println("The Bank Name is: JavaBank");
    }

    public static void main(String[] args) {   //main method

        ClassObject JavaConObj = new ClassObject();   //Object creation //JavaConObj is Reference Variable
        System.out.println("Reference Variable Value is: "+JavaConObj);   //Value is random address of the class object

        BankName();  //Static Methods or Variables can be directly used in another Static method in same class
        System.out.println("The Minimum Balance Required in Account is: " + minimumBalance);  //Static Methods or Variables can be directly used
        System.out.println("Initial Balance is: " + JavaConObj.balance);

        JavaConObj.getBalance(100);   //Method invocation
        System.out.println("The Balance After Withdrawal is: " + JavaConObj.balance);
    }

}
