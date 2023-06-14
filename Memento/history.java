package Memento;

import java.util.ArrayList;

class history {
    private ArrayList<Snapshot> past_canvas = new ArrayList();

    history() {
    }

    public void makeBackup(Editor ed) throws NullPointerException {
        Snapshot backup = ed.createSnapshot();
        if (backup == null) {
            throw new NullPointerException("Snapchat variable is empty!");
        } else {
            this.past_canvas.add(backup);
        }
    }

    public void undo(Editor ed) throws ArrayIndexOutOfBoundsException {
        if (this.past_canvas.size() == 0) {
            throw new ArrayIndexOutOfBoundsException("No snapshots in history");
        } else {
            ed.restore((Snapshot)this.past_canvas.get(this.past_canvas.size() - 1));
            this.past_canvas.remove(this.past_canvas.size() - 1);
        }
    }
}
