package Memento;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Integer n = 10;
        Editor ed = new Editor(n);
        ed.SetColor(1, 1, 100, 100, 100);
        Snapshot screen_shot = ed.createSnapshot();
        ed.SetColor(1, 1, 0, 0, 0);
        System.out.println(screen_shot.getColors(1, 1));
        ed.restore(screen_shot);
        System.out.println(ed.getColors(1, 1));
        history hist = new history();
        hist.makeBackup(ed);
        ed.SetColor(0, 0, 5, 5, 5);
        System.out.println(ed.getColors(0, 0));
        hist.undo(ed);
        System.out.println(ed.getColors(0, 0));

        try {
            ed.SetColor(-1, 1, 100, 100, 100);
        } catch (IllegalArgumentException var9) {
            System.out.println(var9.getMessage());
            System.out.println("Exception was processed, Program continues ");
        }

        Editor ed_failed = null;

        try {
            hist.makeBackup((Editor)ed_failed);
        } catch (Exception var8) {
            System.out.println(var8.getMessage());
            System.out.println("Exception was processed, Program continues ");
        }

        try {
            hist.undo(ed);
        } catch (Exception var7) {
            System.out.println(var7.getMessage());
            System.out.println("Exception was processed, Program continues ");
        }

    }
}

