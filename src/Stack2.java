//В этом классе определяется целочисленный стек, который может определять 10 значений
public class Stack2 {

    /*Теперь переменный stck и ros являются закрытыми.
    Это означает, что они не могул быть случайно или намеренно изменены таким образом, чтобы нарушить стек
         */
    private int stck[] = new int[10];
    private int tos;

    //инициализировать вершину стека
    Stack2() {
        tos = -1;
    }

    //разместить эллемент в стеке
    void push(int item) {
        if (tos == 9)
            System.out.println("Стек заполнен");
        else
            stck[++tos] = item;
    }

    //Извлечь эллементы из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
