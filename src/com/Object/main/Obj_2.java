package com.Object.main;

public class Obj_2 extends Obj_1{
    int c;
    public Obj_2(int a,int b,int c){
       super(a, b);
       this.c=c;
    }
    public void show_2(){
        super.show();
        System.out.println(c);
    }
}
