public class Fahrrad {
    // Attribute
    public int radgröße;     // Angabe in Zoll
    public String farbe;
    public String art;
    public int gangzahl;
    public int aktuellerGang;
    public boolean elektroAntrieb;
    public double akkuStand;

    /*
     * ACHTUNG: JAVA MAGIE (Automatismus)
     *
     * Wenn eine Klasse keinen definierten Konstruktor
     * hat, wird ein parameterloser Standardkonstruktor
     * gestellt.
     * Sobald die Klasse irgend einen Konstruktor definiert,
     * verschwindet der parameterlose Standardkonstruktor.
     */

    // Spezialmethode: Konstruktor
    public /* kein Rückgabewert! */ Fahrrad(String farbe,
                                            int gangzahl,
                                            boolean elektroAntrieb,
                                            double akkuStand) {
        // Attribut = Parameter
//        this.farbe = farbe;
//        // self, me
//        this.gangzahl = gangzahl;
//        this.elektroAntrieb = elektroAntrieb;
//        this.akkuStand = akkuStand;
//        this.aktuellerGang = 1;
        this(28, farbe, "Citibike", gangzahl, 1, elektroAntrieb, akkuStand);
    }

    // Prinzip der Überladung: Andere Methodensignatur, d.h.
    // gleicher Methodenname, aber unterschiedliche Anzahl der Parameter bzw.
    // unterschiedliche Datentypen der Parameter
    public Fahrrad(int radgröße, String farbe, String art, int gangzahl,
                   int aktuellerGang, boolean elektroAntrieb, double akkuStand) {
        this.radgröße = radgröße;
        this.farbe = farbe;
        this.art = art;
        this.gangzahl = gangzahl;
        this.aktuellerGang = aktuellerGang;
        this.elektroAntrieb = elektroAntrieb;
        this.akkuStand = akkuStand;
    }

    public Fahrrad(int radgröße, String farbe, String art, int gangzahl,
                   int aktuellerGang) {
        this(radgröße, farbe, art, gangzahl, aktuellerGang, false, 0.0);
    }

    // Methoden (aka Operationen, Aktionen, Tätigkeiten)
    public void fahren() {
        System.out.println("Ich fahre mit dem " + farbe + " Fahrrad");
    }

    public void bremsen() {
        System.out.println("Ich bremse");
    }

    public void schalten(boolean hochschalten) {
        if (hochschalten) {
            if (aktuellerGang < gangzahl) {
                aktuellerGang++;
            }
        }
        else {
            if (aktuellerGang > 1) {
                aktuellerGang--;
            }
        }
    }

    public void aufladen(double kWh) {
        if (elektroAntrieb) {
            while (akkuStand < 100.0) {
                akkuStand += kWh / 1000;
                // ein paar Minuten vergehen hier
            }
        }
    }
}
