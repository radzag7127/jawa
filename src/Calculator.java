public class Calculator {


    public int add(int a, int b) {
        return a + b;
    }


    public int subtract(int a, int b) {
        return a - b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }
    public double dividebaru(int a, int b) {
        return (double) a / b;
    }



    public static void main(String[] args) {
        Calculator tor = new Calculator();

        System.out.println("Penjumlahan 5 + 3 = " + tor.add(5, 3));
        System.out.println("Pengurangan 5 - 3 = " + tor.subtract(5, 3));
        System.out.println("Perkalian 5 * 3 = " + tor.multiply(5, 3));
        System.out.println("Pembagian 5 / 3 = " + tor.dividebaru(5, 3));
    }
}
