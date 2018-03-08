class Box {
    double width;
    double height;
    double depth;

    //Конструктор, используемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    //Конструктор используемый, когда ни один из размеров не указан
    Box() {
        width = -1; //Используется значение -1 для обозначения
        height = -1; //неинициальзированного
        depth = -1; //параллепипеда
    }

    //Конструктор, используемый, при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //Расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String args[]) {
        //Создать параллелепипеды, используя разные конструкторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        //Получуть объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        //Получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        //Получить объем куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
    }

}
