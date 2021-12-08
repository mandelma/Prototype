package prototype;

public class Sekunti implements Cloneable {
    private int aika;

    public Sekunti(int aika) {
        this.aika = aika;
    }

    public int getAika() {
        return this.aika;
    }

    public void setAika(int aika) {
        this.aika = aika;
    }

    @Override
    public Sekunti clone() {
        try {
            return (Sekunti) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
