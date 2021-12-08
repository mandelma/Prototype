package prototype;

public class Tunti implements Cloneable {
    private int aika;

    public Tunti(int aika) {
        this.aika = aika;
    }

    public int getAika() {
        return this.aika;
    }

    public void setAika(int aika) {
        this.aika = aika;
    }


    @Override
    public Tunti clone() {
        try {
            return (Tunti) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
