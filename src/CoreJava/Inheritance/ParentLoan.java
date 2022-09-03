package CoreJava.Inheritance;

public class ParentLoan {

    int tenure;
    double principal;
    float interestRate;
    private String accountNo;   //Private Variables can't be accessed in ChildClass

    ParentLoan(){
        System.out.println("JavaSavings Bank - Loan");
    }
    ParentLoan(String LoanName){
        System.out.println("JavaSavings Bank - Loan and "+LoanName);
    }


    private String LoanDocuments() {   //Private Methods can't be accessed in ChildClass
        return "Confidential";
    }

    public final String LoanStatus() {   //Final keyword - Cannot create another Method of same name in ChildClass
        return "Loan Pending";
    }

    public String LoanMessage() {
        return "Thank You for Banking";
    }

    public double calculateEMI() {
        double simpleInterest = (principal * interestRate * tenure) / 100;
        return (simpleInterest + principal) / tenure;
    }

    public static void StaticMethod(){
        System.out.println("Parent Static Method");
    }

}
