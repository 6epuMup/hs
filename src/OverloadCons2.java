class Box {
    double width;
    double height;
    double depth;

    //Обратите внимание на этот конструктор. В качестве параметра в нем используется объект типа Box
    Box(Box ob) { //передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор, используемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор, используемый, если не один из размеров не указан
    Box() {
        width = -1; // использовать значение -1 для обозначения
        height = -1; //неинициализированного
        depth = -1; //параллепипеда
    }

    //конструктор используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String args[]) {
        //Создать пераллелепипеды, используя разные конструкторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);
        //создать копию объекта mybox1
        double vol;

        //получить объем первого пораллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен: " + vol);

        //получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен: " + vol);

        //получить объем куба
        vol = mycube.volume();
        System.out.println("Объем куба равен: " + vol);

        //получить объем клона
        vol = myclone.volume();
        System.out.println("Объем клона равен: " + vol);
    }
}
