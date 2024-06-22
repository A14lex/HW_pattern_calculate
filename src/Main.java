public class Main {

    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.mult(10, 22));
        System.out.println();
        System.out.println(intsCalc.pow(10, 10));
        System.out.println(intsCalc.pow(3, 0));
        System.out.println(intsCalc.pow(-1, -1));
        System.out.println(intsCalc.pow(-1, -2));
        System.out.println(intsCalc.pow(0, 0));
        System.out.println(intsCalc.pow(1, 10000000));
        System.out.println(intsCalc.pow(2, 1 / 2));


    }
}
