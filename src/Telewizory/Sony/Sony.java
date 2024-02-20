package Telewizory.Sony;

import Telewizory.Tv;

public abstract class Sony implements Tv {

    private boolean status = false;

    private int program = 1;

    private final int cale;


    Sony(int cale) {
        this.cale = cale;
    }

    @Override
    public void wlacz() {
        status = true;
        System.out.println("Sony");
        wyswietlajObraz();
    }

    @Override
    public void wylacz() {
        status = false;
        System.out.println("NARA");
    }

    @Override
    public void zasilanie() {
        if(status) {
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
                while(status) {
                    try {
                        System.out.println("Wyswiealm obraz z tv sony: " + program);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    @Override
    public void zmianaKanalu(int numer) {
        if (status = true) {
            program = numer;
        }
    }
}
