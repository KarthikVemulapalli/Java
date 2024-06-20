package CoreJava;

public class Constructors {

    private String Name;
    private String Gender;
    private int Age;

    //We need provide constructor access modifier as Public, in order to create object of class outside the package. if not the access is considered as Package-Private
    //Non-Parameterized Constructor
    public Constructors(){
        Name = "Karthik";
        Gender = "Male";
        Age = 25;
    }

    //Parametrized Constructor
    public Constructors(String Name, String Gender, int Age){
        this.Name = Name;
        this.Gender = Gender;
        this.Age = Age;
    }

    void getDisplayDetails() {
        System.out.println("Name-"+Name+"; Gender-"+Gender+"; Age-"+Age);
    }

    public static void main(String[] args) {
        Constructors JCConObj = new Constructors();
        JCConObj.getDisplayDetails();

        Constructors JCConObj1 = new Constructors("Nani", "Male", 20);
        JCConObj1.getDisplayDetails();
    }

}
