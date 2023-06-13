import java.util.Random;

public class IPhone extends Apple {
   /* public IPhone(int Height, int Width, int RAM, int InternalMemo,int model){
        this.Height = Height;
        this.Width = Width;
        this.RAM = RAM;
        this.InternalMemo = InternalMemo;
        this.model = model;
    }*/
    /*public IPhone(){}*/
    int model;
    public IPhone(){}
    public IPhone(IPhone ip) {
        super(ip);
        if(ip !=null){
            this.model = ip.model;
        }
    }

    @Override
    public Apple clone() {
        return new IPhone(this);
    }
    @Override
    public String toString(){
        return "Hey, I'm IPhone, my params:" + String.valueOf(Height)+ " " + String.valueOf(Width) + " "+ String.valueOf(RAM) + " "+ String.valueOf(InternalMemo) + " " + String.valueOf(model);
    }

}
