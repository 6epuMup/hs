class Box {
    double width;
    double height;
    double depth;

    //Это конструктор класса Box
    Box() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    //Расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
public class BoxDemo6 {
    public static void main(String args[]) {
        //Объявить, выделить память и инициализировать объекты типа Box
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        //Получить объем первого паралелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        //Получить объем второго паралелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
