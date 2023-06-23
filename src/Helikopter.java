public class Helikopter {

    // Attribute
    public double gewicht;
    public double maximaleFlughöhe;
    public double aktuelleFlughöhe;
    public String farbe;
    public double geschwindigkeit;
    public double nutzlast;

    // Konstruktor

    public Helikopter(double gewicht,
                      double maximaleFlughöhe,
                      double aktuelleFlughöhe,
                      String farbe,
                      double geschwindigkeit,
                      double nutzlast) {
        this.gewicht = gewicht;
        this.maximaleFlughöhe = maximaleFlughöhe;
        this.aktuelleFlughöhe = aktuelleFlughöhe;
        this.farbe = farbe;
        this.geschwindigkeit = geschwindigkeit;
        this.nutzlast = nutzlast;
    }

    public Helikopter(double gewicht,
                      double maximaleFlughöhe,
                      String farbe,
                      double nutzlast) {
        this(gewicht, maximaleFlughöhe, 0.0, farbe, 0.0, nutzlast);
    }

    // Methoden
    public void abheben() {
        aktuelleFlughöhe++;
        if (aktuelleFlughöhe > maximaleFlughöhe) {
            aktuelleFlughöhe = maximaleFlughöhe;
        }
    }

    public void flughöheReduzieren() {
        aktuelleFlughöhe--;
        if (aktuelleFlughöhe < 0.0) {
            aktuelleFlughöhe = 0.0;
        }
    }

    public void landen() {
        while (aktuelleFlughöhe > 0.0) {
            flughöheReduzieren();
        }
    }

}
