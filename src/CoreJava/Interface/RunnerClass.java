package CoreJava.Interface;

public class RunnerClass {

    public static void main(String[] args) {
        //The below can be written only when SubBranchClass implements BankInterface
        BankInterface BankInterfaceObj = new SubBranchClass();

        CustomerClass customer = new CustomerClass();
        customer.setCustomerId("cust1001");
        customer.setName("Ajay");

        String accountNumber = BankInterfaceObj.createAccount(customer);
        System.out.println("Account number is..." + accountNumber);

        double gloan = BankInterfaceObj.issueGoldLoan(customer);
        System.out.println("Gold loan amount is..." + gloan);

        double hloan = BankInterfaceObj.issueHouseLoan(customer);
        System.out.println("House loan amount is..." + hloan);

        double vloan = BankInterfaceObj.issueVehicleLoan("bike", customer);
        System.out.println("Vehicle loan amount is..." + vloan);
        System.out.println("Caution money is..." + BankInterface.CAUTION_MONEY);

    }

}
