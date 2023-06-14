package Parsing.src;

import java.time.LocalDate;
import java.util.ArrayList;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

/*2. Необходимо создать класс Донор с возможностью хранить информацию о его ID,
номере карты, паспортных данных(Фамилия, Имя, Отчество, дата рождения, место рождения, номер паспорта, когда выдан, код подразделения),
резус фактор, группа крови,
 список сдач крови с указанием даты и обьема,
  список перенесенных и хронических заболеваний и противопоказаний.
  Конструкторы, сеттеры и геттеры всех полей наполняются по смыслу и внутренним предпочтениям.

Создать дополнительные классы: Заболевание.

Заполнить информацию о 12 донорах. Произвести выгрузку в JSON файл и обратное считывание. Результат считывания с JSON файла вывести на экран.*/
public class Main {
    public static void main(String[] args) throws IOException {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        var date = new GregorianCalendar(2000, 01, 10);
        var date2 = new GregorianCalendar(2020, 05, 20);

        /*var john = new Donor("John", "Ronson", "Andrew", date, "123556",date2, "685-432", Boolean.TRUE, 3, 65 );
        var symps = new ArrayList<String>();
        symps.add("Headache");
        symps.add( "Fatigue");
        symps.add( "dizziness");
        var chickenpox = new Illness("chickenpox",2, 1./1000, symps);
        var il = new ArrayList<Illness>();
        il.add(chickenpox);
        john.setPast_illness(il);
        var donors = new ArrayList<Donor>();
        john.Donate(new GregorianCalendar(2022,01,11), 1.);
        var symps2 = new ArrayList<String>();
        symps2.add("Headache");//"Headache", "Vomit", "High temperature"
        symps2.add( "Vomit");
        symps2.add( "High temperature");
        var flu = new Illness("Flu", 1, 0.01, symps2);
        john.getOverIllness(flu);
        donors.add(john);
        ObjectMapper objectMapper = new ObjectMapper();
        // для обнаружения всех полей, независимо от их видимости
        objectMapper.setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.ANY);
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File("donors1.json"), donors);*/
        var donors = new ArrayList<Spender>();

        //der erste Spender
        {
            var john = new Spender("John", "Ronson", "Andrew", date, "123556", date2, "685-432", Boolean.TRUE, 3, 65);
        var symps = new ArrayList<String>();
        symps.add("Headache");
        symps.add("Fatigue");
        symps.add("dizziness");
        var chickenpox = new Krankheit("chickenpox", 2, 1. / 1000, symps);
        var il = new ArrayList<Krankheit>();
        il.add(chickenpox);
        john.setPast_illness(il);
        john.Donate(new GregorianCalendar(2022, 01, 11), 1.);
        var symps2 = new ArrayList<String>();
        symps2.add("Headache");//"Headache", "Vomit", "High temperature"
        symps2.add("Vomit");
        symps2.add("High temperature");
        var flu = new Krankheit("Flu", 1, 0.01, symps2);
        john.getOverIllness(flu);
        donors.add(john);
    }
        // der zweite Spender
        {
            var methew = new Spender("Methew", "Anderson", "Killian", new GregorianCalendar(1998, 5, 10), "472138", new GregorianCalendar(2023, 9, 9), "940-423", false, 4, 17);
            var symps = new ArrayList<String>();
            symps.add("Awakeness");
            var met_chickenpox = new Krankheit("abra", 1, 1. / 100, symps);
            var met_il = new ArrayList<Krankheit>();
            met_il.add(met_chickenpox);
            methew.setPast_illness(met_il);
            methew.Donate(new GregorianCalendar(2022, 01, 11), 1.);
            var symps2 = new ArrayList<String>();
            symps2.add("Blood");//"Headache", "Vomit", "High temperature"
            symps2.add("Vomit");
            symps2.add("Aches");
            var flu = new Krankheit("karkodopus", 5, 0.00001, symps2);
            methew.getOverIllness(flu);
            var symps3 = new ArrayList<String>();
            symps3.add("Headache");
            symps3.add("Fatigue");
            symps3.add("dizziness");
            var chickenpox = new Krankheit("chickenpox", 2, 1. / 1000, symps3);
            methew.getOverIllness(chickenpox);

            donors.add(methew);
        }
        // der dritte Spender
        {
            var methew = new Spender("Carl", "Willson", "Murphy", new GregorianCalendar(1958, 4, 20), "423895", new GregorianCalendar(2000, 4, 28), "976-192", false, 1, 89);
            var symps = new ArrayList<String>();
            symps.add("Fatigue");
            symps.add("Alertness");
            var met_chickenpox = new Krankheit("systemopodus", 2, 1. / 10439, symps);
            var met_il = new ArrayList<Krankheit>();
            met_il.add(met_chickenpox);
            methew.setPast_illness(met_il);
            methew.Donate(new GregorianCalendar(2009, 9, 01), 2.);
            var symps2 = new ArrayList<String>();
            symps2.add("Blood");//"Headache", "Vomit", "High temperature"
            symps2.add("Aches");
            var flu = new Krankheit("hermanika", 5, 0.00001, symps2);
            methew.getOverIllness(flu);
            donors.add(methew);
        }
        //der vierte Spender
        {
            var methew = new Spender("Alex", "Amers", "Bimbo", new GregorianCalendar(1932, 12, 10), "429563", new GregorianCalendar(1967, 5, 17), "923-123", true, 1, 33);
            var symps = new ArrayList<String>();
            symps.add("Heartburn");
            var met_chickenpox = new Krankheit("systradom", 1, 1. / 243985, symps);
            var met_il = new ArrayList<Krankheit>();
            met_il.add(met_chickenpox);
            methew.setPast_illness(met_il);
            methew.Donate(new GregorianCalendar(1990, 01, 11), 1.);
            var symps2 = new ArrayList<String>();
            symps2.add("High temperature");//"Headache", "Vomit", "High temperature"
            symps2.add("Aches");
            var flu = new Krankheit("failemitudus", 2, 0.00001, symps2);
            methew.getOverIllness(flu);
            donors.add(methew);
        }
        //der funfte Spender
        {
            var methew = new Spender("Sammers", "Konnors", "Octavia", new GregorianCalendar(1997, 03, 8), "498546", new GregorianCalendar(2000, 5, 17), "974-109", true, 1, 33);
            var symps = new ArrayList<String>();
            symps.add("Poisoning");
            var met_chickenpox = new Krankheit("puriandus", 1, 1. / 243985, symps);
            var met_il = new ArrayList<Krankheit>();
            met_il.add(met_chickenpox);
            methew.setPast_illness(met_il);
            methew.Donate(new GregorianCalendar(1990, 01, 11), 1.);
            var symps2 = new ArrayList<String>();
            symps2.add("bronhislava");//"Headache", "Vomit", "High temperature"
            symps2.add("kirmaniga");
            var flu = new Krankheit("pooertobinito", 5, 0.00001, symps2);
            methew.getOverIllness(flu);
            donors.add(methew);
        }
        //der sechste Spender
        {
            var methew = new Spender("Anna", "Johnas", "Komo", new GregorianCalendar(1932, 12, 10), "429563", new GregorianCalendar(1967, 5, 17), "923-123", true, 1, 33);
            var symps = new ArrayList<String>();
            symps.add("Trosta");
            var met_chickenpox = new Krankheit("krumko-hotko", 1, 1. / 17824, symps);
            var met_il = new ArrayList<Krankheit>();
            met_il.add(met_chickenpox);
            methew.setPast_illness(met_il);
            methew.Donate(new GregorianCalendar(2001, 12, 11), 1.);
            var symps2 = new ArrayList<String>();
            symps2.add("bearanka");//"Headache", "Vomit", "High temperature"
            symps2.add("pustanka");
            var flu = new Krankheit("kromchanka", 2, 0.00001, symps2);
            methew.getOverIllness(flu);
            donors.add(methew);
        }
        //der siebte Spender
        {
            var methew = new Spender("Rollandona", "Prima", "Kima", new GregorianCalendar(1932, 12, 10), "429563", new GregorianCalendar(1967, 5, 17), "923-123", true, 1, 33);
            var symps = new ArrayList<String>();
            symps.add("Surramba");
            symps.add("Pyrania");
            var met_chickenpox = new Krankheit("Toura", 1, 1. / 243985, symps);
            var met_il = new ArrayList<Krankheit>();
            met_il.add(met_chickenpox);
            methew.setPast_illness(met_il);
            methew.Donate(new GregorianCalendar(1990, 01, 11), 1.);
            var symps2 = new ArrayList<String>();
            symps2.add("Low sugar");//"Headache", "Vomit", "High temperature"
            symps2.add("Ximania");
            var flu = new Krankheit("hermanakania", 2, 0.00001, symps2);
            methew.getOverIllness(flu);
            donors.add(methew);
        }
        //der achte Spender
        {
            var methew = new Spender("Vesna", "Bla-bla", "Kromo", new GregorianCalendar(1932, 12, 10), "429563", new GregorianCalendar(1967, 5, 17), "923-123", true, 1, 33);
            var symps = new ArrayList<String>();
            symps.add("Letokia");
            var met_chickenpox = new Krankheit("Miranda", 1, 1. / 243985, symps);
            var met_il = new ArrayList<Krankheit>();
            met_il.add(met_chickenpox);
            methew.setPast_illness(met_il);
            methew.Donate(new GregorianCalendar(1990, 01, 11), 1.);
            var symps2 = new ArrayList<String>();
            symps2.add("Hronokonia");//"Headache", "Vomit", "High temperature"
            symps2.add("Dambus dorum");
            var flu = new Krankheit("Mamur", 2, 0.00001, symps2);
            methew.getOverIllness(flu);
            donors.add(methew);
        }
        //der neunte Spedner
        {
            var methew = new Spender("Simka", "Prostakova", "Bimbo", new GregorianCalendar(1932, 12, 10), "429563", new GregorianCalendar(1967, 5, 17), "923-123", true, 1, 33);
            var symps = new ArrayList<String>();
            symps.add("Ssssshchanka");
            var met_chickenpox = new Krankheit("Vesnushkina-radost", 1, 1. / 243985, symps);
            var met_il = new ArrayList<Krankheit>();
            met_il.add(met_chickenpox);
            methew.setPast_illness(met_il);
            methew.Donate(new GregorianCalendar(1990, 01, 11), 1.);
            var symps2 = new ArrayList<String>();
            symps2.add("Goremyka");//"Headache", "Vomit", "High temperature"
            symps2.add("mytosa");
            var flu = new Krankheit("arbarbaarbus", 2, 0.00001, symps2);
            methew.getOverIllness(flu);
            donors.add(methew);
        }
        //der zehnte Spedner
        {
            var methew = new Spender("Misha", "Nenashev", "Alexeevish", new GregorianCalendar(1932, 12, 10), "429563", new GregorianCalendar(1967, 5, 17), "923-123", true, 1, 33);
            var symps = new ArrayList<String>();
            symps.add("Kapitalism");
            var met_chickenpox = new Krankheit("Syndrom Kapitalisma", 1, 1. / 243985, symps);
            var met_il = new ArrayList<Krankheit>();
            met_il.add(met_chickenpox);
            methew.setPast_illness(met_il);
            methew.Donate(new GregorianCalendar(1990, 01, 11), 1.);
            var symps2 = new ArrayList<String>();
            symps2.add("Vragestvoa");//"Headache", "Vomit", "High temperature"
            symps2.add("Agression");
            var flu = new Krankheit("Kram", 2, 0.00001, symps2);
            methew.getOverIllness(flu);
            donors.add(methew);
        }
        //der elfte Spender
        {
            var methew = new Spender("", "Amers", "Bimbo", new GregorianCalendar(1950, 11, 11), "429563", new GregorianCalendar(1967, 5, 17), "923-123", true, 1, 33);
            var symps = new ArrayList<String>();
            symps.add("limbonina");
            var met_chickenpox = new Krankheit("mimonia", 1, 1. / 243985, symps);
            var met_il = new ArrayList<Krankheit>();
            met_il.add(met_chickenpox);
            methew.setPast_illness(met_il);
            methew.Donate(new GregorianCalendar(1977, 8, 05), 1.);
            var symps2 = new ArrayList<String>();
            symps2.add("Peasdck");//"Headache", "Vomit", "High temperature"
            symps2.add("ANSkdel");
            var flu = new Krankheit("meroniasdmk", 2, 0.001, symps2);
            methew.getOverIllness(flu);
            donors.add(methew);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        // для обнаружения getters
        objectMapper.setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.ANY);
        //objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File("spender.json"), donors);
        ObjectMapper mapperBack = new ObjectMapper();
       // mapperBack.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
       // mapperBack.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
        //mapperBack.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

            String data = "";
            String fileName = "spender.json";
            Spender[] results = new Spender[12];
            data = new String(
                    Files.readAllBytes(Paths.get(fileName)));
            try {
                results = mapperBack.readValue(data, Spender[].class);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(results[0].med_file);


            ObjectMapper objectMapper_2 = new ObjectMapper();
            // для обнаружения getters
            objectMapper.setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.ANY);
            //objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            objectMapper.writeValue(new File("spender_2.json"), results);
            ObjectMapper mapperBack_2 = new ObjectMapper();
            // mapperBack.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            // mapperBack.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
            //mapperBack.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        /*
    На основе списка доноров, считанных из json файла, составить списки:
    заболеваний, которые перенесли эти доноры (без повторений)
    отсортированный список заболеваний, по количеству перенесших доноров
    список доноров по конкретному месту проживания
    список доноров по группе крови
    */
        /*
        (Donor[] sp) -> {

            for (:
                 ) {

            }
        }*/
       /* var illnesses = new HashSet();
        Krankheit ex1 = new Krankheit();
        Krankheit ex2 = new Krankheit();
        ex1.setID(3);
        ex2.setID(3);
        ex1.setRarity(1);
        ex2.setRarity(1);
        ex1.setSeverity(1);
        ex2.setSeverity(1);
        ex1.setName("wow");
        ex2.setName("wow");
        var symps2 = new ArrayList<String>();
        symps2.add("Peasdck");//"Headache", "Vomit", "High temperature"
        symps2.add("ANSkdel");
        ex1.setContradictions(symps2);
        ex2.setContradictions(symps2);

        illnesses.add(ex1);
        illnesses.add(ex2);
        */

        Donor[] aba;
        List<Krankheit> ay;
        //System.out.println(illnesses.size());
        //var dons = new ArrayList<Spender>();
        //dons.addAll(results);
        //   список заболеваний, которые перенесли эти доноры (без повторений)
        var ils = List.of(results).stream()
                .map(donor -> donor.getPast_illness())
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
        for(var il: ils){
            System.out.println(il.getName());
        }
        //    отсортированный список заболеваний, по количеству перенесших доноров
        var ils_2 = 1;List.of(results).stream()
                .map(donor->donor.getPast_illness())
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Krankheit::getName,
                        Collectors.summingInt(e -> 1)))
                .entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println); // or any other terminal method;
//    список доноров по конкретному месту проживания
        var ils_3 =  List.of(results).stream()
                .collect(Collectors.groupingBy(Spender::getRegion
                ));//.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
      /*  for(var il : ils_2.keySet()){
            System.out.println(il + " " + ils_2.getOrDefault(il, 1));
        }*/
        for(var region : ils_3.keySet()){
            System.out.println(region);
            for(var sp: ils_3.get(region)){
                System.out.println(sp);
            }
        }
        //    список доноров по группе крови
        var ils_4 =  List.of(results).stream()
                .collect(Collectors.groupingBy(Spender::getBlood_group
                ));
        for(var blt : ils_4.keySet()){
            System.out.println(blt);
            for(var sp: ils_4.get(blt)){
                System.out.println(sp.med_file);
            }
        }




    }
}