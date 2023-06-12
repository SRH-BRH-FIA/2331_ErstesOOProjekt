public class Main {
    public static void main(String[] args) {

        Fahrrad rad1 = new Fahrrad("grün", 3, true, 50.0);
        Fahrrad rad2 = new Fahrrad("blau", 24, false, 0.0);
        Fahrrad rad3 = new Fahrrad(24, "lila", "MTB", 21, 1, false, 0.0);

        rad1.fahren();
        rad2.schalten(true);
        rad1.aufladen(3);

        System.out.println("Rad1: Akkustand: "
                + rad1.akkuStand);
        System.out.println("Rad2: Aktueller Gang: "
                + rad2.aktuellerGang);
        System.out.println("Rad3: Radgröße: " + rad3.radgröße);
    }
}
