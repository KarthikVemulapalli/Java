package CoreJava.Inheritance;

public class RunnerClass {

    public static void main(String[] args) {
        ChildCarLoan CarLoanObj = new ChildCarLoan();
        double CarLoanAmount = CarLoanObj.calculateEMI();     //Sub class object invoking super class method
        System.out.println("Car Loan EMI/Year is: " + CarLoanAmount);

        ChildCarLoan.StaticMethod();
        ParentLoan.StaticMethod();

        System.out.println(CarLoanObj.LoanMessage());     //Using Super Class method

    }

}
