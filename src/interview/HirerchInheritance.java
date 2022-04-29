package interview;


class Cat extends Animal{
	void meow() {System.out.println("meowing...");
}}

public class HirerchInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Cat c=new Cat();
       c.meow();
       c.eat();
       Dog d=new Dog();
       d.bark();
	}

}
