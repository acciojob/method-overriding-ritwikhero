package com.driver;

public class Main {
    public static void main(String[] args) {
        B obj = new B();

//        String res = obj.meth();
//        System.out.println(res);


        System.out.println(obj.meth());
    }

}
//public class A{
//    public String meth(){
//        return "Invoking method from class A";
//    }
//}
//
//public class B extends A{
//    @Override
//    public String meth() {
//        return "Method is overridden in Extendend class B";
//    }
//}