package robert.translation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Time
{

  public static void main(String[] args)
  {
    Date dt = new Date();
// Festlegung des Formats:
    SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
    df.setTimeZone(TimeZone.getDefault());                  // nicht mehr unbedingt notwendig seit JDK 1.2
// Formatierung zu String:
    System.out.println("Date = " + df.format(dt));        // z.B. '2001-01-26 19:03:56.731'

  }
}
