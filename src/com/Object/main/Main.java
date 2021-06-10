package com.Object.main;

public class Main {
    public static void main(String[] args ){
        Obj_2 ob_2=new Obj_2(3,4,5);
        ob_2.show_2();
        Obj_3 obj_3=new Obj_3(5,6,7,8);
        obj_3.show3();
        Obj_1 obj_1=new Obj_2(2,4,5);
        obj_1.show();//не доступен show 2 потому что ссылка от объекта obj1
    }
}
