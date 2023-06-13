import java.util.NoSuchElementException;

public class NewYorkPark extends Zoo {
    Bird NYbird;
    NewYorkPark(){}
    NewYorkPark(Bird b ){
        this.NYbird = b;
    }
    @Override
    String feed() {
        if(this.NYbird == null){
            throw new NoSuchElementException("no bird!");
        }
       return  NYbird.eat() + " but I'm not hungry anymore!";
    }

    @Override
    String watch() {
        return (NYbird.commmunicate() + ". omg");
    }
}
