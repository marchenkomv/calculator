public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(3, 7));
        System.out.println(intsCalc.mult(10, 3));
        System.out.println(intsCalc.pow(2, 4));
    }
}