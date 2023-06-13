public abstract class Apple {
    public int Height;
    public int Width;
    public int RAM ;
    public int InternalMemo ;
    public abstract Apple clone();
    public Apple(){}
    public Apple(Apple other ){
        if(other!=null){
            this.Height = other.Height;
            this.Width = other.Width;
            this.RAM = other.RAM;
            this.InternalMemo = other.InternalMemo;
        }
    }

}
