package CoreJava;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            System.out.println("Enter the Value: ");
            int valueInput = scan.nextInt();

            System.out.println("Value Provided is: "+valueInput);
        }
        scan.close();
    }

}
