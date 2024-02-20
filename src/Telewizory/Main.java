package Telewizory;
import Telewizory.Samsung.UE43dfgwgw;
import Telewizory.Sony.RR55adfgd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        obsluga();
        //obslugaPilota();

    }
    private static void obsluga() {
        Scanner scanner = new Scanner(System.in);
        Tv tv = new RR55adfgd("dfgsdfgsdgvvv");
        int opcje = 0;

        System.out.println("1. włacz 2. wyłacz 3. zmien kanał 4. koniec");
        while (opcje != 4) {
            opcje = scanner.nextInt();
            switch (opcje) {
                case 1:
                    tv.wlacz();
                    break;
                case 2:
                    tv.wylacz();
                    break;
                case 3:
                    System.out.println("Zmien kanał");
                    int numer = scanner.nextInt();
                    tv.zmianaKanalu(numer);
                    break;
            }
        }
        scanner.close();
    }

    private static void obslugaPilota() {
        Scanner scanner = new Scanner(System.in);
        Pilot pilot = new PilotNoName();
        Tv tv = new UE43dfgwgw("asdfa");
        System.out.println("0. on off");
        pilot.sparuj(tv);
        int opcja = 0;

        while(opcja != 9) {
            opcja = scanner.nextInt();
           switch (opcja) {
               case 0:
                   pilot.on_off();
                   break;
               case 1:
                   pilot.nacisnij1();
                   break;
               case 2:
                   pilot.nacisnij2();
                   break;
               case 3:
                   pilot.nacisnij3();
                   break;
           }
        }
        scanner.close();
    }
}
