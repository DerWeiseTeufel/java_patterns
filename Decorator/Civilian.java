public class Civilian extends EvolvingHuman {
    Civilian(){this.pastMe = new Student();}
    Civilian(Human pastMe){this.pastMe = pastMe;}

    @Override
    public String SeekFulfillment() {
        return pastMe.SeekFulfillment() + " and I want to create!";
    }

}
