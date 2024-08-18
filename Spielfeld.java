public class Spielfeld {
    public FeldStatus[][] feld;


//Array leeren
//steinsetzen
//gewinner ermitteln


    public Spielfeld() {
        feld = new FeldStatus[3][3];
    }

    public void fieldstatusEmpty() {
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                feld[i][j] = FeldStatus.LEER;
            }
        }
    }

    public boolean gueltigerZug(int zeile, int spalte){
        if (zeile > 2 || zeile < 0 || spalte > 2 || spalte < 0){
            System.out.println("Auserhalb von Spielfeld");
            return true;
        }
        else if (feld[zeile][spalte] != FeldStatus.LEER) {
            System.out.println("Feld bestzt");
            return true;
        }
        return false;
    }

    public void zugSetzenKreuz(int zeile, int spalte){
        feld[zeile][spalte] = FeldStatus.KREUZ;
    }

    public void zugSetzenKreis(int zeile, int spalte){
        feld[zeile][spalte] = FeldStatus.KREIS;
    }
}