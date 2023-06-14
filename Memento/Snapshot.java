//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package Memento;

import java.util.ArrayList;
import java.util.HashMap;

class Snapshot {
    private ArrayList<ArrayList<HashMap<Character, Integer>>> canvas;
    private int height;

    Snapshot(ArrayList<ArrayList<HashMap<Character, Integer>>> canvas, int height) {
        this.canvas = new ArrayList(height);
        int n = height;

        for(int i = 0; i < n; ++i) {
            ArrayList<HashMap<Character, Integer>> temp = new ArrayList(n);

            for(int j = 0; j < n; ++j) {
                HashMap<Character, Integer> temp2 = new HashMap();
                temp2.put('R', (Integer)((HashMap)((ArrayList)canvas.get(i)).get(j)).get('R'));
                temp2.put('B', (Integer)((HashMap)((ArrayList)canvas.get(i)).get(j)).get('B'));
                temp2.put('G', (Integer)((HashMap)((ArrayList)canvas.get(i)).get(j)).get('G'));
                temp.add(temp2);
            }

            this.canvas.add(temp);
        }

        this.height = height;
    }

    public ArrayList<ArrayList<HashMap<Character, Integer>>> getCanvas() {
        return this.canvas;
    }

    public int getHeight() {
        return this.height;
    }

    public HashMap<Character, Integer> getColors(int x, int y) {
        return (HashMap)((ArrayList)this.canvas.get(x)).get(y);
    }
}
