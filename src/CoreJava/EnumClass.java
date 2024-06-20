package CoreJava;

//We can get values of constants created in Enum
enum Designation{
    CEO(2), GeneralManager(4), RegionalManager(20), BranchManager(30);   //These values are passed to the constructor when the constant is created.

    private int noofEmployees;

    Designation(int noofEmployees) {
        this.noofEmployees = noofEmployees;
    }

    public int getNoofEmployees() {
        return noofEmployees;
    }
}

class SampleClass {

    public void reportees(Designation designation) {
        System.out.println(designation.getNoofEmployees());
    }

    public static void main(String[] args) {
        SampleClass JCEObj = new SampleClass();
        JCEObj.reportees(Designation.CEO);
        System.out.println(Designation.CEO);
    }
}
