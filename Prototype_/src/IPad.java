public class IPad extends Apple {

    boolean canBeComputer = true;

    public IPad(){}
    public IPad(IPad iPad) {
        super(iPad);
        if(iPad !=null){
            this.canBeComputer = iPad.canBeComputer;
        }
    }

    @Override
    public Apple clone() {
        return new IPad(this);
    }
}
