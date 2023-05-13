package com.oop.statc;

public class StaticExample {

    public static final int EXTRA_KEY = 12;
    public static int count = 0;

    private int instanceVariable = 32;

    private void instanceMethod(){
        System.out.println("Count is " + count);
    }

    static {

    }



    static class Student{

        private int rollNo;

        public int getRollNo() {
            return rollNo;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            count++;
            System.out.println("Count is : " + count);
        }
    }
}
