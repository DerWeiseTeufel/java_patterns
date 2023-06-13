// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        var iphone1 = new IPhone();
        iphone1.Height = 100;
        iphone1.Width = 100;
        iphone1.RAM = 4;
        iphone1.InternalMemo = 64;
        iphone1.model = 10;
        var iphone2 = new IPhone();
        iphone2.Height = 200;
        iphone2.Width = 200;
        iphone2.RAM = 8;
        iphone2.InternalMemo = 128;
        iphone2.model = 11;
        var ipad1 = new IPad();
        ipad1.Height = 99;
        ipad1.Width = 99;
        ipad1.RAM = 6;
        ipad1.InternalMemo = 256;
        ipad1.canBeComputer = true;
        var copy = iphone2.clone();
        System.out.println(copy.toString());
        System.out.println(iphone2.toString());
        System.out.println(copy.equals(iphone2));
        var iphone2_ref = iphone2;
        System.out.println(iphone2_ref.equals(iphone2));




    }
}