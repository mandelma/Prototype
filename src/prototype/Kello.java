package prototype;

public class Kello implements Cloneable {
    private Tunti tunti;
    private Minuutti minuutti;
    private Sekunti sekunti;

    public Kello(int tunti, int minuutti, int sekunti) {
        this.tunti = new Tunti(tunti);
        this.minuutti = new Minuutti(minuutti);
        this.sekunti = new Sekunti(sekunti);
    }

    public Tunti getTunti() {
        return this.tunti;
    }

    public Minuutti getMinuutti() {
        return this.minuutti;
    }

    public Sekunti getSekunti() {
        return this.sekunti;
    }

    public String toString() {
        return "Kello on: " + getTunti().getAika() + ":" + getMinuutti().getAika() + ":" + getSekunti().getAika();
    }


    @Override
    public Object clone() {
        Kello kello = null;
        try {
            kello = (Kello) super.clone();
            kello.tunti = (Tunti) tunti.clone();
            kello.minuutti = (Minuutti) minuutti.clone();
            kello.sekunti = (Sekunti) sekunti.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
        return kello;
    }
}
