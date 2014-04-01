/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author gcorcoran
 */
public class Invoice {
    
    private Calendar invoiceDate;
    private int gracePeriod = 15;
    private Calendar dueDate;

    public Invoice() {
        this.invoiceDate = Calendar.getInstance();
    }

    public final Calendar getInvoiceDate() {
        return invoiceDate;
    }

    public final void setInvoiceDate(Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public final int getGracePeriod() {
        return gracePeriod;
    }

    public final void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }
    
    public final Calendar getDueDate(){
        if(dueDate==null){
            dueDate = invoiceDate;
            dueDate.add(Calendar.DATE, gracePeriod);
        }
        return dueDate;
    }
    
    public final String getDueDateAsString(){
        String format = "MM/dd/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date temp = new Date();
        if(dueDate==null){
            dueDate = invoiceDate;
            dueDate.add(Calendar.DATE, gracePeriod);
        }
        temp = dueDate.getTime();
        String formattedDate = sdf.format(temp);
        return formattedDate; 
    }
    
    
    
}
