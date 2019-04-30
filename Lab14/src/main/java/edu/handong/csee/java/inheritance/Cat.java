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
		System.out.println(myCat.name); // Class Cat's field 'name'
		
		Animal myAnimal = myCat; //polymorphism
		myAnimal.testClassMethod(); // hiding
		myAnimal.testInstanceMethod(); // overriding
		System.out.println(myAnimal.name); //  Class Animal's field 'name'
		
		Animal myAnimal2 = new Dog(); //polymorphism
		myAnimal2.testClassMethod(); // hiding
		myAnimal2.testInstanceMethod(); // overriding
		
		/*
		 * testClassMethod�� static method�̱� ������ superclass�� hide�Ѵ�
		 * >> superclass�� �ҷ����� subclass�� �ҷ������� ���� �޶�����
		 * testInstanceMethod�� instance method�̱� ������ superclass�� override�Ѵ�
		 * >> �׻� subclass�� ������
		 * instantiation���� subclass�� subclassŸ���̸鼭 superclassŸ���̱⵵ �ϴ� - polymorphism
		 * 
		 * superclass�� ���� field name�� ���� subclass�� field�� ����ȴٸ�, �׳� ���ο� �ʵ尡 �����ȴ�
		 * hiding/overriding/polymorphism �� �� �ƴϰ� �׳� ���� Ŭ������ �ʵ��̴�
		 */
	}

}
