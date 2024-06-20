package CoreJava.AbstractClass;

public abstract class Bank {

    //Abstract class cannot be instantiated (cannot create object of an abstract class)
    //Abstract class can have constructors & Static methods
    //There can be an empty abstract class with no abstract/implemented methods
    //'abstract' keyword needs to be mentioned for an abstract method (Non Implemented method)
    //Abstract method should be compulsory present inside an Abstract Class/Interface

    private String BankName;

    Bank(){			//Constructor
        this.BankName="JavaBank";
        System.out.println("JavaBank HeadQuarters");
    }
    Bank(String Location){			//Constructor
        System.out.println("JavaBank in "+Location+" Location");
    }

    public static void StaticMethod(){
        System.out.println("Bank Class - StaticMethod");
    }

    public abstract boolean PhotoIdentityProofMethod(String PhotoProof);  //No Implementation

    private String BankDetails() {     //Implementation Method
        return "Confidential";
    }

    public abstract boolean AddressIdentityProofMethod(String AddressProof);   //No Implementation


    //SubBranch cannot override the below method, because this is made final
    public final void OpenAccount(String PhotoProof, String AddressProof, int MinAmount) {    //Implementation
        if (MinAmount>1000) {
            if (PhotoIdentityProofMethod(PhotoProof)  && AddressIdentityProofMethod(AddressProof)) {
                System.out.println("PASSED: Account Opened");
            }
            else {
                System.out.println("Submit PhotoIdentity && AddressIdentity Proofs");
            }
        }
        else {
            System.out.println("FAILED: Account Not Opened");
        }
    }

}
