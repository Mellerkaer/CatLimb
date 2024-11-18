import java.util.ArrayList;

public class Modes {
    public static void onlyOut(Cats cat){
        if (!cat.isOnlyIn()){
            cat.setOnlyOut(true);
        } else {
            cat.setOnlyOut(false);
        }
    }

    public static void inOut(Cats cat){
        if (!cat.isClosed() && RegisteredCats.getRegisteredCats().contains(cat)) {
            cat.setInOut(true);
        } else {
            cat.setInOut(false);
        }
    }

    public static void onlyIn(Cats cat) {
        if (!cat.isClosed() && RegisteredCats.getRegisteredCats().contains(cat)) {
            cat.setOnlyIn(true);
        } else {
            cat.setOnlyIn(false);
        }
    }
    
    public static void closed(Cats cat) {
        if (!cat.isOnlyIn() && !cat.isOnlyOut() && !cat.isInOut()) {
            cat.setClosed(true);
        } else {
            cat.setClosed(false);
        }
    }
}


