public class Layman extends EvolvingHuman{
    Layman(Human pastMe){ this.pastMe = pastMe;}
    @Override
    public String SeekFulfillment() {
        return pastMe.SeekFulfillment() + ", but I don't want anything anymore";
    }
    public String GetEmployed(){
        return pastMe.SeekFulfillment();
    }
}
