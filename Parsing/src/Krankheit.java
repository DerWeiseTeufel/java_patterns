package Parsing.src;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Krankheit
{
    int ID;
    private static int number_of_all = 0;
    String name ;
    private ArrayList<String> Contradictions;
    int Severity;

    public ArrayList<String> getContradictions() {
        return Contradictions;
    }

    public void setContradictions(ArrayList<String> contradictions) {
        if(contradictions == null)
            return;
        if(this.Contradictions == null){
            this.Contradictions = new ArrayList<>();
        }
        this.Contradictions.addAll(contradictions);
    }

    public int getSeverity() {
        return Severity;
    }

    public void setSeverity(int severity) {
        Severity = severity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    double Rarity;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Krankheit krankheit = (Krankheit) o;
        return Severity == krankheit.Severity && Double.compare(krankheit.Rarity, Rarity) == 0 && Objects.equals(name, krankheit.name) && Objects.equals(Contradictions, krankheit.Contradictions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Contradictions, Severity, Rarity);
    }

    @JsonCreator
    Krankheit(@JsonProperty("Name") String name,
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
        if(contradictions == null)
            return;
        if(this.Contradictions ==null){
            this.Contradictions = new ArrayList<>();
        }
        this.Contradictions.addAll(contradictions);
    }
    Krankheit(){}
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


}
