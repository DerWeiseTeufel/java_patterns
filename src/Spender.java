
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
public class Spender {
    private static int number_of_all = 0;
    int ID;
    String med_file;
    String name;
     String last_name;
    String middle_name;
    @JsonFormat (pattern = "dd/MM/yyyy")
    GregorianCalendar bday;
    String passport;
    @JsonFormat (pattern = "dd/MM/yyyy")
    GregorianCalendar passport_pub;
    String dep_code;
    Boolean Resus;
    Integer Blood_group;
    Integer Region;
    private ArrayList<Donation> my_donations = new ArrayList<Donation>();

    private ArrayList<Krankheit> past_illness;
    Spender(String name, String last_name, String middle_name,
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
    Spender(int ID, String med_file, String name, String last_name, String middle_name, GregorianCalendar bday, String passport,
          GregorianCalendar passport_pub, String dep_code, Boolean resus, int Blood_group, int Region, ArrayList<Donation> my_donations,
          ArrayList<Krankheit> past_illness){
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
    Spender(){}
    Spender(String name, String last_name,
          GregorianCalendar bday, String passport, GregorianCalendar passport_pub, String dep_code, Boolean Resus, int Blood_group, int Region)
    {
        this(name, last_name, null, bday,passport,passport_pub, dep_code,Resus,Blood_group, Region);
    }
    void Donate(GregorianCalendar when, double amount){
        this.my_donations.add(new Donation(when, amount,this.Blood_group, this.Resus));
    }
    void getOverIllness(Krankheit illness){
        if(past_illness.isEmpty()){
            past_illness=new ArrayList<Krankheit>();
        }
        this.past_illness.add(illness);
    }
    void setPast_illness (ArrayList<Krankheit> past_illness){
        if(past_illness == null){
            return;
        }
        if(this.past_illness == null) {
            this.past_illness = new ArrayList<>();
        }
        this.past_illness.addAll(past_illness);
    }
    ArrayList<Krankheit> getPast_illness(){
        return past_illness;
    }
    ArrayList<Donation> getMy_donations(){
        return my_donations;
    }
    void setMy_donations (ArrayList<Donation> my_donations){
        this.my_donations = my_donations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMed_file() {
        return med_file;
    }

    public void setMed_file(String med_file) {
        this.med_file = med_file;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Integer getRegion() {
        return Region;
    }

    public void setRegion(Integer region) {
        Region = region;
    }

    public Integer getBlood_group() {
        return Blood_group;
    }

    public void setBlood_group(Integer blood_group) {
        Blood_group = blood_group;
    }

    public Boolean getResus() {
        return Resus;
    }

    public void setResus(Boolean resus) {
        Resus = resus;
    }

    public String getDep_code() {
        return dep_code;
    }

    public void setDep_code(String dep_code) {
        this.dep_code = dep_code;
    }

    public GregorianCalendar getPassport_pub() {
        return passport_pub;
    }

    public void setPassport_pub(GregorianCalendar passport_pub) {
        this.passport_pub = passport_pub;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public GregorianCalendar getBday() {
        return bday;
    }

    public void setBday(GregorianCalendar bday) {
        this.bday = bday;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
