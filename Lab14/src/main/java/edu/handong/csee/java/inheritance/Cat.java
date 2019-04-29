package edu.handong.csee.java.inheritance;

public class Cat extends Animal{
	
	String name = "Cat";
	
	public static void testClassMethod() {
		System.out.println("The static method in Cat");
	}
	public void testInstanceMethod() {
		System.out.println("The instance method in Cat");
	}
	
	public static void main(String[] args) {
		Cat myCat = new Cat(); //polymorphism
		myCat.testClassMethod(); // hiding
		myCat.testInstanceMethod(); // overriding
		System.out.println(myCat.name); // hiding
		
		Animal myAnimal = myCat; //polymorphism
		myAnimal.testClassMethod(); // hiding
		myAnimal.testInstanceMethod(); // overriding
		System.out.println(myAnimal.name); // hiding
		
		Animal myAnimal2 = new Dog(); //polymorphism
		myAnimal2.testClassMethod(); // hiding
		myAnimal2.testInstanceMethod(); // overriding
		
		/*
		 * testClassMethod는 static method이기 때문에 superclass를 hide한다
		 * >> superclass로 불렀는지 subclass로 불렀는지에 따라 달라진다
		 * testInstanceMethod는 instance method이기 때문에 superclass를 override한다
		 * >> 항상 subclass를 따른다
		 * instantiation에서 subclass는 subclass타입이면서 superclass타입이기도 하다 - polymorphism
		 */
	}

}
