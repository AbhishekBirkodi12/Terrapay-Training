import java.util.Calendar;

public class Cal {
    public static void main(String[] args) {
        Calendar c1=Calendar.getInstance();
        //Retrieve Date and Time
        int dd=c1.get(Calendar.DATE);
        int mm=c1.get(Calendar.MONTH);
        ++mm;
        int yy=c1.get(Calendar.YEAR);
        System.out.println("Current Date is : "+dd+"-"+mm+"-"+yy);
        //Retrieve Time
        int hh=c1.get(Calendar.HOUR);
        int mi=c1.get(Calendar.MINUTE);
        int ss=c1.get(Calendar.SECOND);
        System.out.println("Current Time is: "+hh+":"+mi+":"+ss);

    }
}
