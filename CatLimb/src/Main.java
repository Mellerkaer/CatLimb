public class Main {

    public static void main(String[] args) {

        Cats cat1 = new Cats("Lil Chase");
        Cats cat5 = new Cats("Herluf");
        Cats cat6 = new Cats("Trump");

        RegisteredCats.addCat(cat1);
        RegisteredCats.addCat(cat5);

        Modes.onlyOut(cat1);
        Modes.onlyIn(cat1);
        Modes.inOut(cat1);

        Modes.onlyIn(cat5);
        Modes.onlyOut(cat5);
        Modes.inOut(cat5);

        Modes.onlyOut(cat6);

       /* System.out.println("cat1: \ninOut: " + cat1.isInOut()+ "\n" +
                "onlyIn: " + cat1.isOnlyIn() + "\n" +
                "onlyOut: " + cat1.isOnlyOut() + "\n" +
                "closed: " + cat1.isClosed());*/

        System.out.println("Mode IN/OUT:\n" + "c1: " + cat1.isInOut() + "\n" +
                "c5: " + cat5.isInOut() + "\n" +
                "c6: " + cat6.isOnlyIn());

        System.out.println();

        System.out.println("Mode ONLY IN: \n" +  "C1: " + cat1.isOnlyIn() + "\nC5: " + cat5.isOnlyIn() + "\nC6: " + cat6.isOnlyIn());

        System.out.println();

        System.out.println("Mode ONLY OUT:\n" + "c1: " + cat1.isOnlyOut() + "\n" +
                "c5: " + cat5.isOnlyOut() + "\n" +
                "c6: " + cat6.isOnlyOut());

        System.out.println();

        System.out.println("Mode CLOSED:\n" + "c1: " + cat1.isClosed()+"\n" +
                "c5: " + cat5.isClosed() +"\n" +
                "c6: " + cat6.isClosed());

    }

}
