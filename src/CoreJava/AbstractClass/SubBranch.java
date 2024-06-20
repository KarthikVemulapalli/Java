package CoreJava.AbstractClass;

public class SubBranch extends Bank{

    //Private methods of Parent Class cannot be accessed in ChildClass
    SubBranch(){
        System.out.println("JavaSubBank");
    }

    //Overrides Abstract method in Bank (Parent Class)
    public boolean PhotoIdentityProofMethod (String Photoproof) {
        if (Photoproof.equals("Aadhaar Card")) {
            System.out.println("SubBranch PhotoProof Validation Successful");
            return true;
        }
        return false;
    }

    //Overrides Abstract method in Bank (Parent Class)
    public boolean AddressIdentityProofMethod(String AddressProof) {
        if (AddressProof.equals("Electricity Bill")) {
            System.out.println("SubBranch AddressProof Validation Successful");
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        SubBranch SBCObj = new SubBranch();
        SBCObj.OpenAccount("Aadhaar Card", "Electricity Bill", 1200);
//
//        Bank SubBranchObj = new SubBranch();
//        Bank.StaticMethod();
    }

}
