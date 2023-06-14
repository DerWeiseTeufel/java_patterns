
import com.fasterxml.jackson.annotation.JsonFormat;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Calendar;
import java.util.GregorianCalendar;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
/*Необходимо создать класс Донор с возможностью хранить информацию о его ID,
номере карты, паспортных данных(Фамилия, Имя, Отчество, дата рождения, место рождения, номер паспорта, когда выдан, код подразделения),
резус фактор, группа крови,
 список сдач крови с указанием даты и обьема,
  список перенесенных и хронических заболеваний и противопоказаний.
  Конструкторы, сеттеры и геттеры всех полей наполняются по смыслу и внутренним предпочтениям.*/
public class Donor {
    private static int number_of_all = 0;
    public final int ID;
    public final String med_file;
    public final String name;
    public final String last_name;
    public final String middle_name;
    @JsonFormat (pattern = "dd/MM/yyyy")
    public final GregorianCalendar bday;
    public final String passport;
    @JsonFormat (pattern = "dd/MM/yyyy")
    public final GregorianCalendar passport_pub;
    public final String dep_code;
    public final Boolean Resus;
    public final Integer Blood_group;
    public final Integer Region;
    private ArrayList<Donation> my_donations = new ArrayList<Donation>();

    private ArrayList<Illness> past_illness;
    Donor(String name, String last_name, String middle_name,
          GregorianCalendar bday, String passport,GregorianCalendar passport_pub, String dep_code, Boolean Resus, int Blood_group, int Region){
        this.name=name;
        this.last_name=last_name;
        this.middle_name=middle_name;
        this.bday=bday;
        this.passport=passport;
        this.passport_pub=passport_pub;
        this.dep_code=dep_code;
        this.Resus=Resus;
        this.Blood_group=Blood_group;
        this.Region=Region;
        number_of_all++;
        ID = number_of_all;
        Random rand = new Random();
        med_file = (this.Resus ? "1":"0") +String.valueOf(bday.get(GregorianCalendar.YEAR)) + Integer.toString(Region)  + Integer.toString(rand.nextInt(10)) + Integer.toString(rand.nextInt(10))+Integer.toString(rand.nextInt(10))+Integer.toString(rand.nextInt(10));
    }
        Donor(int ID, String med_file, String name, String last_name, String middle_name, GregorianCalendar bday, String passport,
              GregorianCalendar passport_pub, String dep_code, Boolean resus, int Blood_group, int Region, ArrayList<Donation> my_donations,
              ArrayList<Illness> past_illness){
        this.ID =ID;
        this.med_file = med_file;
        this.name=name;
            this.last_name=last_name;
            this.middle_name=middle_name;
            this.bday=bday;
            this.passport=passport;
            this.passport_pub=passport_pub;
            this.dep_code=dep_code;
            this.Resus=resus;
            this.Blood_group=Blood_group;
            this.Region=Region;
            this.my_donations = my_donations;
            this.past_illness = past_illness;

        }
    Donor(String name, String last_name,
          GregorianCalendar bday, String passport, GregorianCalendar passport_pub, String dep_code, Boolean Resus, int Blood_group, int Region)
    {
        this(name, last_name, null, bday,passport,passport_pub, dep_code,Resus,Blood_group, Region);
    }
    void Donate(GregorianCalendar when, double amount){
        this.my_donations.add(new Donation(when, amount,this.Blood_group, this.Resus));
    }
    void getOverIllness(Illness illness){
        if(past_illness.isEmpty()){
            past_illness=new ArrayList<Illness>();
        }
        this.past_illness.add(illness);
    }
    void setPast_illness (ArrayList<Illness> past_illness){
        this.past_illness = past_illness;
    }
    ArrayList<Illness> getPast_illness(){
        return past_illness;
    }
    ArrayList<Donation> getMy_donations(){
        return my_donations;
    }
    void setMy_donations (ArrayList<Donation> my_donations){
        this.my_donations = my_donations;
    }

}
