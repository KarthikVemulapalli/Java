package CoreJava.AbstractClass;

public class SubBranch extends Bank{

    public boolean PhotoIdentityProofMethod (String Photoproof) {
        if (Photoproof.equals("Aadhaar Card")) {
            return true;
        }
        return false;
    }

    public boolean AddressIdentityProofMethod(String AddressProof) {
        if (AddressProof.equals("Electricity Bill")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SubBranch SBCObj = new SubBranch();
        SBCObj.OpenAccount("Aadhaar Card", "Electricity Bill", 1200);

//        Bank BanknObj = new SubBranch();
//        BanknObj.OpenAccount("Aadhaar Card", "Electricity Bill", 1200);
    }

}
