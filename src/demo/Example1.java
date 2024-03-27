package demo;

abstract class ArithmeticOperation{
    abstract void printInfor();
}

class Add extends ArithmeticOperation{

    @Override
    void printInfor() {
        System.out.println(4+5);
    }
}

class Subtract extends ArithmeticOperation{

    @Override
    void printInfor() {
        System.out.println(7-2);
    }
}
public class Example1 {

    public static void main(String[] args) {
        ArithmeticOperation obj1 = new Add();
        obj1.printInfor();
        ArithmeticOperation obj2 = new Subtract();
        obj2.printInfor();
    }
}
