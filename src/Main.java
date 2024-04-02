public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNum();
    }
    public static void printThreeWords() {
        System.out.println("apple");
        System.out.println("orange");
        System.out.println("banana");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 7;
        if (a + b >= 0) {
            System.out.println("сумма положительная");

        }
        else {
            System.out.println("сумма отрицательная");
        }
    }

    public static void printColor() {
        int v = 180;
        if (v <= 0) {
            System.out.println("red");

        }
        if (v > 0 && v <= 100) {
            System.out.println("yellow");

        }
        if (v > 100) {
            System.out.println("green");
        }
    }
    public static void compareNum(){
        int a = 8;
        int b =10;
        if (a >= b){
            System.out.println("a >= b");

        }
        else{
            System.out.println("a < b");
        }
    }
}
