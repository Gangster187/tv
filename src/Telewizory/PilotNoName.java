package Telewizory;

public class PilotNoName implements Pilot{

    private Tv tv;

    @Override
    public void on_off() {
        tv.zasilanie();
    }

    @Override
    public void nacisnij1() {
        tv.zmianaKanalu(1);
    }

    @Override
    public void nacisnij2() {
        tv.zmianaKanalu(2);
    }

    @Override
    public void nacisnij3() {
        tv.zmianaKanalu(3);
    }

    @Override
    public void sparuj(Tv tv) {
        this.tv = tv;
    }
}
