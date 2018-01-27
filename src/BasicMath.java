public class BasicMath {
    public static void main(String args[]) {
        //Арифметические операции над целочисленными значениями
        System.out.println("Целочисленная арифметика");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a равно " + a);
        System.out.println("b равно " + b);
        System.out.println("c равно " + c);
        System.out.println("d равно " + d);
        System.out.println("e равно " + e);
        //Арифметические операции над значением типа double
        System.out.println("\nАрифметика с плавающей точкой");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da равно " + da);
        System.out.println("db равно " + db);
        System.out.println("dc равно " + dc);
        System.out.println("dd равно " + dd);
        System.out.println("de равно " + de);
    }
}
