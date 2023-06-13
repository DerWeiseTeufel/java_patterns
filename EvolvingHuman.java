class EvolvingHuman implements Human{
    protected Human pastMe;
    EvolvingHuman(Human past){
        this.pastMe = past;
    }
    EvolvingHuman(){}
    @Override
    public String SeekFulfillment() {
        return pastMe.SeekFulfillment()  + " and I want to learn!";
    }
}
