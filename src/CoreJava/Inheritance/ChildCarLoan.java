package CoreJava.Inheritance;

public class ChildCarLoan extends ParentLoan {

    String CommonVariable = "ChildClass Var";

    //Same Variables of ParentClass are not present in ChildClass, so below variables are used without super keyword
    public ChildCarLoan() {		             //ChildClass Constructor
        super("Car Loan");

        //Calling ParentClass Constructor should be the first line inside child class constructor
        //Default Constructor will be called automatically inside ChildClass Constructor
        //If Parameterized Constructor not called above it will call Default Constructor

        System.out.println("JavaSavings Bank - Car Loan");
        tenure = 5;            //Reusing parent class member variables
        principal = 20000;
        interestRate = 8.5f;
    }

    public double calculateEMI() {
        System.out.println("Loan EMI/Year is: " + super.calculateEMI());   //super keyword is used because ChildClass is also having same method name as of ParentClass
        return super.calculateEMI() + 300;
    }

    public static void StaticMethod(){
        System.out.println("Child Static Method");
    }

    public void ChildMethod(){
        System.out.println("Child Method");
    }


    public static void main(String args[]){

    }

    public void CommonMethod(){
        System.out.println("ChildClass Method");
    }

}
