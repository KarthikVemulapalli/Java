package CoreJava.Inheritance;

public class ChildCarLoan extends ParentLoan {

    //Same Variables of SuperClass are not present in SubClass, so below variables are used without super keyword
    ChildCarLoan() {		             //ChildClass Constructor
        super("Car Loan");     //If no Parameterized Constructor it will call Default Constructor

        System.out.println("JavaSavings Bank - Car Loan");
        tenure = 5;            //Reusing super class member variables
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

}
