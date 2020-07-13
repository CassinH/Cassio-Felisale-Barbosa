
package calendar.date;



import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;



public class CalendarDate {

   
    public static void main (String[] args) {
       
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2019-11-25T22:52:07Z"));
        System.out.println(sdf.format(d));
        
        Calendar cal = Calendar.getInstance();
       cal.setTime(d);
       int Hora = cal.get(Calendar.HOUR);
       int Segundos = cal.get(Calendar.SECOND);
       int Minutos = cal.get(Calendar.MINUTE);
       int Mes = 1 + cal.get(Calendar.MONTH);
       System.out.println("Hora: " + Hora);
       System.out.println("Minutos: " + Minutos);
       System.out.println("Mes: " + Mes);
       System.out.println("segundos: " + Segundos);
       
    }
    
    
}
