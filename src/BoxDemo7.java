class Box {
    double width;
    double height;
    double depth;

    //Это конструктор класса Box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    //Расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}


public class BoxDemo7 {
    public static void main(String args[]) {
        //Объявить, выделить память и инициализировать объекты типа Box

        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        double vol;

        //Получить объем первого пералелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        //Получить объем второго паралелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
