package CoreJava.Interface;

public interface BankInterface {

    int CAUTION_MONEY = 2000;                 //variables are by default public final and static

    String createAccount(CustomerClass customer);

    double issueVehicleLoan(String vehicleType, CustomerClass customer);

    double issueHouseLoan(CustomerClass customer);

    double issueGoldLoan(CustomerClass customer);        //Methods are by default public and abstract till Java 1.7 version

}
