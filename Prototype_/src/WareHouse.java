import java.util.ArrayList;
import java.util.List;
public class WareHouse {
     List<PrototypeX> instock = new ArrayList<>();

    public void Add(PrototypeX... devices){
        for (PrototypeX d: devices){
            instock.add(d.clone());
        }
    }



}
