package com.example.springdemo.com.springcore.RefTypeUsingref;

public class A {
    private int y;
    private B objb;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public B getObjb() {
        return objb;
    }

    public void setObjb(B objb) {
        this.objb = objb;
    }

    @Override
    public String toString() {
        return "A{" +
                "y=" + y +
                ", objb=" + objb +
                '}';
    }
}
