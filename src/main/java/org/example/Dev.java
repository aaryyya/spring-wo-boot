package org.example;

public class Dev {
//    private Laptop laptop;
//    private int age;
//    public int getAge(){
//        return age;
//    }
//    public void setAge(int age){
//        this.age=age;
//    }
    private Computer comp;
//    public Laptop getLaptop() {
//        return laptop;
//    }
//    public void setLaptop(Laptop laptop){
//        this.laptop=laptop;
//    }
    public Dev(){
    System.out.println("Dev Constructor");
    }
//    public Dev(int age){
//        this.age=age;
//        System.out.println("Dev 1 Constructor and the constructor is parameterised");
//    }
    public Computer getComp(){
        return comp;
    }
    public void setComp(Computer comp){
        this.comp=comp;
    }


//    public Dev(Laptop laptop){
//        this.laptop=laptop;
//        System.out.println("Dev 1 Constructor and the constructor is parameterised Laptop Constructor");
//    }

    public void build(){
        System.out.println("Working on this Awesome Project");
        comp.compile();
    }
}
