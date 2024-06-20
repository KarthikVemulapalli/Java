package CoreJava;

import java.util.Scanner;

public class ScannerInput {

    /*
    Scanner Class used for taking inputs from the keyboard,
    Syntax: Scanner scan = new Scanner(System.in);
		    scan.nextInt();
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            System.out.println("Enter the Value and Click Enter: ");
            int valueInput = scan.nextInt();
            System.out.println("Value Provided is: "+valueInput);
        }
        scan.close();
    }

}
