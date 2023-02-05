package CoreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateCalenderConcept {

    public void ReqDateFormat(){
        Date DateObj = new Date();
        System.out.println("Today's Date Is - "+DateObj.toString());

        SimpleDateFormat SDF1obj = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat SDF2obj = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        SimpleDateFormat SDF3obj = new SimpleDateFormat("MMM dd yyyy hh:mm:ss");

        System.out.println("Format MM/DD/YYYY - "+SDF1obj.format(DateObj));
        System.out.println("Format MM/DD/YYYY - "+SDF2obj.format(DateObj));
        System.out.println("Format MM/DD/YYYY - "+SDF3obj.format(DateObj));
    }

    public void ReqCalFormat(){
        Calendar CalObj = Calendar.getInstance();
        System.out.println("Week in Month - "+CalObj.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Current Minute in Hour - "+CalObj.get(Calendar.MINUTE));
    }

    public void ReqETTime() {
        SimpleDateFormat ETDF = new SimpleDateFormat("MM/dd/yyyy");
        TimeZone ETTZ = TimeZone.getTimeZone("America/New_York");
        ETDF.setTimeZone(ETTZ);

        Date currentDate = new Date();
        System.out.println(ETDF.format(currentDate.getTime()).toString());
    }

    public static void main(String args[] ){
        DateCalenderConcept DateConceptObj = new DateCalenderConcept();
        DateConceptObj.ReqDateFormat();
        DateConceptObj.ReqCalFormat();
        DateConceptObj.ReqETTime();
    }

}
