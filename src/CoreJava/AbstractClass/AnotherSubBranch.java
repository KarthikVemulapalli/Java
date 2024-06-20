package CoreJava.AbstractClass;

public abstract class AnotherSubBranch extends Bank {

    //Overrides Abstract method in Bank (Parent Class)
    public boolean AddressIdentityProofMethod(String AddressProof) {
        if (AddressProof.equals("Electricity Bill")) {
            System.out.println("SubBranch AddressProof Validation Successful");
            return true;
        }
        return false;
    }

}
