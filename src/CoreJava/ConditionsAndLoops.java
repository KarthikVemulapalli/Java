package CoreJava;

public class ConditionsAndLoops {

    public void IfMethod(String Condition){ //If Statement
        if(Condition.equalsIgnoreCase("If")){
            System.out.println("Inside If Statement");
        } else if(Condition.equalsIgnoreCase("ElseIf")){
            System.out.println("Inside ElseIf Statement");
        } else {
            System.out.println("Inside Else Statement");
        }
    }

    public void WhileMethod(int Number){ //While loop
        while(Number<2){
            Number++;
            if(Number>=1){
                System.out.println("Inside While Loop");
            }
        }
    }

    public void DoWhileMethod(boolean DoWhileVar){ //DoWhile loop
        do{ //One loops will get executed without any condition check
            System.out.println("Inside Do-While Loop");
        } while (DoWhileVar);
    }

    public void ForMethod(int Number){ //For loop
        for(int i=0; i<Number; i++){
            if(i>=1){
                System.out.println("Inside For Loop");
            }
        }
    }

    public void ForEachMethod(String[] StringArray){ //For-Each loop
        for(String Word: StringArray){
            System.out.print(Word+" ");
        }
    }

    public  static void main(String args[]){
        ConditionsAndLoops ConditionsAndLoopsObj = new ConditionsAndLoops();
        ConditionsAndLoopsObj.IfMethod("if");
        ConditionsAndLoopsObj.WhileMethod(1);
        ConditionsAndLoopsObj.DoWhileMethod(false);
        ConditionsAndLoopsObj.ForMethod(2);
        ConditionsAndLoopsObj.ForEachMethod(new String[]{"Inside", "ForEach", "Loop"});
    }

}
