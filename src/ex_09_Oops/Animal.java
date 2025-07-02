package ex_09_Oops;

public class Animal {

    void makesound(){
        System.out.println("Animal makes a sound");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("cat says:meow meow");
    }
}
