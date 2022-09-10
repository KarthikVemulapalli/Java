package CoreJava;

public class SwitchCase {

    public static void main(String[] args) {
        int choice = 0;
        choice = 3;

        //Case value should be equal to switch expression type only
        //The case values must be unique. In case of duplicate value, it renders compile-time error.

        switch (choice) { //choice passed to switch statement
            //choice has to match the case value to execute the statements in that case
            case 1:
                System.out.println("Entry deposition");
                break;
            case 2:
                System.out.println("Display operation");
                break; //break keyword is used to exit from the switch block.
            case 3:
                System.out.println("Deposit operation");
                break;
            default: //If no case matches, default will be executed.
                System.out.println("Invalid choice");
        }
    }

}
