package ru.pavlenty;

public class Main {
    public static void main(String[] args) {

        Operationable op = (x, y) -> x+y;
        int xx = op.calculate(10,20);

        Operationable op2 = (x,y) -> x*y+100;
        op2.calculate(30,30);

        Operationable op3 = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x*y+100;
            }
        };

    }
}


interface Operationable{
    int calculate(int x, int y);
}
