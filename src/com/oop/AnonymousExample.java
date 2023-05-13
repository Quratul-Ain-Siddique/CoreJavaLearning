package com.oop;

interface OnClickListener {
    void onClick();
}

public class AnonymousExample {

    public static void main(String[] args) {
        OnClickListener onClickListener=(new OnClickListener() { // Anonymous class of Interface
            @Override
            public void onClick() {

            }
        });

        handleClick(new OnSaveClickListenerImpl(){

        }); // Anonymous class of class using methodName handleClick
        handleClick(new OnDeleteClickListener(123){
            @Override
            public void onClick() {
                super.onClick();
            }
        });
        OnClickListener anonymous = new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Anonymous");
            }
        };
        handleClick( new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Anonymous");
            }
        });

    }

    public static void handleClick(OnClickListener onClickListener) {
        onClickListener.onClick();
    }
}

class OnDeleteClickListener implements OnClickListener {

    private int something;

    public OnDeleteClickListener(int something) {
        this.something = something;
    }

    @Override
    public void onClick() {
        System.out.println("Deleting data "+ something);
    }

    public void clickOnSave() {

    }
}

class OnIdleClickListener implements OnClickListener {

    @Override
    public void onClick() {
        System.out.println("Deleting data");
    }
    public void clickOnSave() {

    }
}


class OnSaveClickListenerImpl implements OnClickListener {

    @Override
    public void onClick() {
        System.out.println("Saving data");
    }

    public void clickOnSave() {

    }
}
