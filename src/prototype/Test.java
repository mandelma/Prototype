package prototype;

public class Test {
    public static void main(String[] args) {
        Kello kello = new Kello(8, 20, 10);

        Kello kello2 = (Kello)kello.clone();

        kello2.getTunti().setAika(9);
        kello2.getMinuutti().setAika(25);
        kello2.getSekunti().setAika(13);
        System.out.println("Original clock: " + kello);
        System.out.println("Cloned clock: " + kello2);

        kello.getSekunti().setAika(15);
        kello2.getSekunti().setAika(17);
        System.out.println("Original clock after change: " + kello);
        System.out.println("Cloned clock after change: " + kello2);
    }
}
