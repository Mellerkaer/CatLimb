import java.util.ArrayList;

public class RegisteredCats {
    private static ArrayList<Cats> registeredCats = new ArrayList<>();

    public static ArrayList<Cats> getRegisteredCats() {
        return registeredCats;
    }

    public static void addCat(Cats cat){
        registeredCats.add(cat);
    }

}
