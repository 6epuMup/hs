/*Программа, использующая класс Box
  Присвоить исходному файлу имя BoxDemo.java
 */
class Box {
    double width;
    double heiht;
    double depth;
}

// В этом классу объявляется объект типа Box
class BoxDemo {
    public static void main(String args[]) {
        Box mybox = new Box();

        double vol;
                //Присвоить значения переменным экземпляра mybox
        mybox.width = 10;
        mybox.heiht = 20;
        mybox.depth = 15;

        //рассчитать объем паралелепипеда
        vol = mybox.width * mybox.heiht * mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}
