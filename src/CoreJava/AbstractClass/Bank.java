package CoreJava.AbstractClass;

public abstract class Bank {

    private String BankName;

    Bank(){			//Constructor
        this.BankName="JavaBank";
    }

    public abstract boolean PhotoIdentityProofMethod(String PhotoProof);  //No Implementation

    private String BankDetails() {     //Implementation
        return "Cofidential";
    }

    public abstract boolean AddressIdentityProofMethod(String AddressProof);   //No Implementation

    public void OpenAccount(String PhotoProof, String AddressProof, int MinAmount) {    //Implementation
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
