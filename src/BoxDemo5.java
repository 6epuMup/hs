class Box {
    double width;
    double height;
    double depth;

    //Расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

    //Установить размеры паралелепипеда
    void setDim (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}


class BoxDemo5 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //Инициализиравать каждый экземпляр класса Box
        mybox1.setDim (10, 20, 15);
        mybox2.setDim (3, 6, 9);

        //Получить объем первого паралелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        //Получить объем второго паралелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
