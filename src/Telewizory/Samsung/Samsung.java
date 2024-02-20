package Telewizory.Samsung;

import Telewizory.Pilot;
import Telewizory.Tv;

public abstract class Samsung implements Tv {

    private boolean stan = false;

    private int program = 1;

    private int cale;

    protected Samsung(int cale) {
        this.cale = cale;
    }

    @Override
    public void wlacz() {
        stan = true;
        System.out.println("SAMSUNG");
        wyswietlajObraz();
    }

    @Override
    public void wylacz() {
        System.out.println("BYE BYE");
        stan = false;
    }

    @Override
    public void zmianaKanalu(int numer) {
        if(stan = true) {
            program = numer;
        }
    }

    @Override
    public void zasilanie() {
        if(stan) {
            wylacz();
        } else {
            wlacz();
        }
    }

    @Override
    public void wyswietlajObraz() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(stan) {
                    try {
                        System.out.println("Wyswietlaj obraz " + program);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
