package CoreJava;

public class Constructors {

    private String Name;
    private String Gender;
    private int Age;
    static int piipos=90;

    Constructors(){
        Name = "Karthik";
        Gender = "Male";
        Age = 25;
    }
    Constructors(String Name, String Gender, int Age){
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
