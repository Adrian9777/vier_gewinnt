import java.util.Scanner;

public class Spieler {
    public static int setztSteinSpalte(){
        Scanner input = new Scanner(System.in);
        System.out.println("In welche Spalte möchtest du dein Stein setzen?");
        int spalte = input.nextInt();
        return spalte;

    }

    public static int setzeSteinZeile(){
        Scanner input = new Scanner(System.in);
        System.out.println("In welche Zeile möchtest möchtest du dein Stein setzen?");
        int zeile = input.nextInt();
        return zeile;
    }
}
