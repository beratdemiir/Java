package day23inheritancepolymorphism;

public class Animal {

    public void eat(){
        System.out.println("Animals eats");
    }

    public int add(int a, int b){
        return a+b;
    }

    public Integer multiply(int a, int b){
        return a*b;
    }

    public Animal create(){
        return new Animal();
    }
}
