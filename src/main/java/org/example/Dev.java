package org.example;

public class Dev {
    private Laptop laptop;
    private int age;
//    public int getAge(){
//        return age;
//    }
//    public void setAge(int age){
//        this.age=age;
//    }

    public Laptop getLaptop() {
        return laptop;
    }
    public void setLaptop(Laptop laptop){
        this.laptop=laptop;
    }


    public Dev(){
        System.out.println("Dev Constructor");
    }
    public Dev(int age){
        this.age=age;
        System.out.println("Dev 1 Constructor and the constructor is parameterised");
    }

    public Dev(Laptop laptop){
        this.laptop=laptop;
        System.out.println("Dev 1 Constructor and the constructor is parameterised Laptop Constructor");
    }
    public void build(){
        System.out.println("Working on this Awesome Project");
        laptop.compile();
    }
}
