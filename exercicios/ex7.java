public class ex7 {
    public static void main(String[] args) {
        int a = -2;
        int b = 5;
        int c;

        if (a <= b) {
            c = (a > b ? 2 - a : -5 * b);
        } else {
            c = a + b;
        }
        System.out.println("Fim = " + c);
    }
}
