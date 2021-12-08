package prototype;

public class Minuutti implements Cloneable {
    private int aika;

    public Minuutti(int aika) {
        this.aika = aika;
    }

    public int getAika() {
        return this.aika;
    }

    public void setAika(int aika) {
        this.aika = aika;
    }

    @Override
    public Minuutti clone() {
        try {
            return (Minuutti) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
