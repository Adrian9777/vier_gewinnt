public class Main {
    public static void main(String[] args) {
        Spielfeld spielfeld = new Spielfeld();
        spielfeld.fieldstatusEmpty();
        boolean wiederholen;
        int spalte;
        int zeile;
        do {
            System.out.println("Kreuz am zug");
            spalte = Spieler.setztSteinSpalte();
            zeile = Spieler.setzeSteinZeile();
            wiederholen = spielfeld.gueltigerZug(spalte, zeile);
        } while (wiederholen);
        spielfeld.zugSetzenKreuz(spalte, zeile);
    }
}
