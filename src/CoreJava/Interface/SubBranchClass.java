package CoreJava.Interface;

public class SubBranchClass implements BankInterface {

    public String createAccount(CustomerClass customer) {
        return "Acc12345";
    }

    public double issueVehicleLoan(String vehicleType, CustomerClass customer) {
        if(vehicleType.equals("bike")) {
            return 100000;
        }
        else { return 500000; }
    }

    public double issueHouseLoan(CustomerClass customer) {
        return 200000;
    }

    public double issueGoldLoan(CustomerClass customer) {
        return 500000;
    }

}
