package CoreJava.Inheritance;

public class RunnerClass {

    public static void main(String[] args) {
        ChildCarLoan CarLoanObj = new ChildCarLoan();
        double CarLoanAmount = CarLoanObj.calculateEMI();
        System.out.println("Car Loan EMI/Year is: " + CarLoanAmount);

        ChildCarLoan.StaticMethod();  //ChildClass Static Method
        ParentLoan.StaticMethod();   //ParentClass Static Method

        System.out.println(CarLoanObj.LoanMessage());     //Using ParentClass method

    }

}
