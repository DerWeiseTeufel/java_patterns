//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
package Memento;


import java.util.ArrayList;
import java.util.HashMap;

class Editor {
    private ArrayList<ArrayList<HashMap<Character, Integer>>> canvas;
    private int height;

    Editor(int n) {
        this.canvas = new ArrayList(n);

        for(int i = 0; i < n; ++i) {
            ArrayList<HashMap<Character, Integer>> temp = new ArrayList(n);

            for(int j = 0; j < n; ++j) {
                HashMap<Character, Integer> temp2 = new HashMap();
                temp2.put('R', 0);
                temp2.put('G', 0);
                temp2.put('B', 0);
                temp.add(temp2);
            }

            this.canvas.add(temp);
            this.height = n;
        }

    }

    public void SetColor(int x, int y, int R, int G, int B) throws IllegalArgumentException {
        if (x >= 0 && y >= 0) {
            ((HashMap)((ArrayList)this.canvas.get(x)).get(y)).put('R', R);
            ((HashMap)((ArrayList)this.canvas.get(x)).get(y)).put('G', G);
            ((HashMap)((ArrayList)this.canvas.get(x)).get(y)).put('B', B);
        } else {
            throw new IllegalArgumentException("x and y must be greater than zero");
        }
    }

    public void SetCanvas(ArrayList<ArrayList<HashMap<Character, Integer>>> canvas) {
        this.canvas = canvas;
    }

    public void SetHeight(int height) {
        this.height = height;
    }

    public HashMap<Character, Integer> getColors(int x, int y) {
        return (HashMap)((ArrayList)this.canvas.get(x)).get(y);
    }

    public ArrayList<ArrayList<HashMap<Character, Integer>>> getCanvas() {
        return this.canvas;
    }

    public int getHeight() {
        return this.height;
    }

    public Snapshot createSnapshot() {
        return new Snapshot(new ArrayList(this.canvas), this.height);
    }

    public void restore(Snapshot screen) {
        this.canvas = new ArrayList(screen.getCanvas());
        this.height = screen.getHeight();
    }
}
