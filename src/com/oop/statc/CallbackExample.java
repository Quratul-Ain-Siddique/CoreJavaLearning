package com.oop.statc;

public class CallbackExample {

    public static void main(String[] args) {
        System.out.println("Calling load data");
        loadDataFromServer(new SuccessListener() {
            @Override
            public void onSuccess() {
                System.out.println("onSuccess: ");
            }
        });
        System.out.println("Continuing normal execution");

        getDataFromServer(new SuccessListener() {
            @Override
            public void onSuccess() {
                System.out.println("data from server: ");
            }
        });
        int data = getData();
    }

    static int getData(){
        return 132;
    }

    static void getDataFromServer(SuccessListener successListener){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                successListener.onSuccess();
            }
        });
        t.start();
    }

    static void loadDataFromServer(SuccessListener successListener) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                successListener.onSuccess();
            }
        });
        t.start();
    }

    interface SuccessListener {
        void onSuccess();
    }
}
