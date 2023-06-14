package Parsing.src;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;
public class Illness
{
    public final int ID;
    private static int number_of_all = 0;
    public final String name ;
    private ArrayList<String> Contradictions = new ArrayList<String>();
    public final int Severity;
    private double Rarity;


    @JsonCreator
    Illness(@JsonProperty("Name") String name,
            @JsonProperty("Severity") int Severity,
            @JsonProperty("Rarity") double rarity,
            @JsonProperty ("Syptoms") ArrayList<String> contradictions


            //String name, int Severity, double rarity, String... symptoms
            ){

        number_of_all++;
        ID = number_of_all;
        this.name = name;
        this.Severity = Severity;
        this.Rarity = rarity;
        this.Contradictions.addAll(contradictions);
    }
    public double getRarity(){
        return Rarity;
    }
    public boolean setRarity(double rarity){
        if(rarity<0){
            return false;
        }
        this.Rarity =rarity;
        return true;
    }

    public ArrayList<String> getContras(){
        return Contradictions;

    }
    public void setContrast (ArrayList<String> Contras){
        this.Contradictions = Contras;
    }
}
