public class SimpleClass {

    public SimpleClass() {
    }

    /**
     * Additionne a et b
     * @param a - premier paramètre
     * @param b - second paramètre
     * @return
     */
    public int add(int a, int b) {
        return a + b ;
    }

    public static void main(String[] args) {
        new SimpleClass().add(1,2);

        System.out.println("Hello world");
    }
}


