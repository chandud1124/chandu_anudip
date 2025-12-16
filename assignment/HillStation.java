// Superclass
class HillStations {
    void location() {
        System.out.println("Hill Station location");
    }

    void famousFor() {
        System.out.println("Hill Station is famous for its beauty");
    }
}

class Manali extends HillStations {
    void location() {
        System.out.println("Manali is located in Himachal Pradesh");
    }

    void famousFor() {
        System.out.println("Manali is famous for snow and adventure sports");
    }
}

class Mussoorie extends HillStations {
    void location() {
        System.out.println("Mussoorie is located in Uttarakhand");
    }

    void famousFor() {
        System.out.println("Mussoorie is famous for scenic views");
    }
}

class Gulmarg extends HillStations {
    void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir");
    }

    void famousFor() {
        System.out.println("Gulmarg is famous for skiing");
    }
}

public class HillStation {
    public static void main(String[] args) {
        HillStations h;

        h = new Manali();
        h.location();
        h.famousFor();

        h = new Mussoorie();
        h.location();
        h.famousFor();

        h = new Gulmarg();
        h.location();
        h.famousFor();

        System.out.println("\n--- Using Subclass Objects ---");
        Manali m = new Manali();
        m.location();
        m.famousFor();

        Mussoorie ms = new Mussoorie();
        ms.location();
        ms.famousFor();

        Gulmarg g = new Gulmarg();
        g.location();
        g.famousFor();
    }
}