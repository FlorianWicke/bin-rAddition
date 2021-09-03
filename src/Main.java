public class Main {

    public static void main(String[] args) {
        // 2 Zahlen als Parameter
        // DAs Ergebnis als binäre Zahl zurück geben...
        // Beispiel: 1+1 = 2 , binär: 10

        int zahl1 = 2;
        int zahl2 = 320;
        System.out.println(binaerAdition(zahl1, zahl2));
    }

    public static String binaerAdition(int zahl1, int zahl2) {
        int ergebnis = 0;
        StringBuilder binaereZahl = new StringBuilder();
        ergebnis = zahl1 + zahl2;
        while (ergebnis != 0) {
            binaereZahl.append(ergebnis % 2);
            ergebnis = ergebnis / 2;
        }
        String umgekehrt = new String();
        for ( int j = binaereZahl.length()-1; j >= 0; j-- )
            umgekehrt += binaereZahl.charAt(j);
        return umgekehrt;
    }
}

