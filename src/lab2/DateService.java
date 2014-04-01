/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author gcorcoran
 */
public class DateService {
    /*
    Create a class “DateService” and one method that converts a String
    representation of a date to a Date object. The method should accept a date
    String in the format “3/15/2014”. Next, create another method in the class that
    accepts a date String in the format “March 15, 2014 2:30 PM” and converts it
    to a Calendar object. Test both methods by creating a Startup class and
    outputting the results
    */
    public final Date convertStringToDate(String dateString){
      Date date = new Date();
      
      return date;
    }
    
    public final Calendar convertStringToCalendar(String dateString){
        
        Calendar cal = new GregorianCalendar();
      
      try{
      SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy hh:mm aa");
      cal.setTime(sdf.parse(dateString));
      }catch(ParseException pe){
          JOptionPane.showMessageDialog(null, pe.getMessage());
      }
        return cal;
        
    }
}
