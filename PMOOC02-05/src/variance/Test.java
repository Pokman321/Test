package variance;

import java.util.ArrayList;
import java.util.List;

public class Test {

	//��һ�������Ƿ��ܱ��ڶ�����������
	public void f1(Cat foo) {
		// code
	}

	public void f1(Animal foo) {
		// code
	}
	
	//��һ������Ƿ񱻵ڶ�������滻
	List<Cat> foos = new ArrayList<Cat>();
	List<Animal> foos = new ArrayList<Cat>();
	
	
	//��һ�������Ƿ��ܱ��ڶ�����������
	public Cat f2() {
		return new Cat();
	}
	
	public Animal f2() {
		return new Cat();
	}
}

class Animal {
}

class Cat extends Animal {
}
