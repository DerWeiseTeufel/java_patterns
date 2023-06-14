import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Donation {
    @JsonFormat (pattern="dd/mm/yyyy")
    GregorianCalendar date;
    Double amount;
   int blood_type;
  boolean resus;
    Donation(GregorianCalendar date, Double amount, int blood_type, boolean resus){
        this.date = date;
        this.amount = amount;
        this.blood_type = blood_type;
        this.resus = resus;
    }
Donation(){}
    public boolean getResus() {
        return resus;
    }

    public void setResus(boolean resus) {
        this.resus = resus;
    }

    public int getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(int blood_type) {
        this.blood_type = blood_type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }
}
