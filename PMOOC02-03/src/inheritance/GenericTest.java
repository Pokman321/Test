package inheritance;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		
//		Pair<Apple> apples = new Pair<>(new Apple(3), new Apple(4));
//		Pair<Fruit> fruits = apples;
//		fruits.setFirst(new Orange(5));
//		
//		List<Orange> oranges = new ArrayList<Orange>();
		
		
//		Manager ceo = new Manager("ceo");
//		Manager cfo = new Manager("cfo");
//		
//		Pair<Manager> managers = new Pair<>(ceo, cfo);
//		Pair<Employee> employees = managers;
//		employees.setFirst(new Employee("zhangsan"));
		

		setFruits();
	}
	
	//Pair<Apple>  and Pair<Orange> �Կ� 
	//Fruit�����࣬����getSize()����
	public void printFruits(Pair<? extends Fruit> fruits)
	{		
		Fruit first=fruits.getFirst();
		Fruit second=fruits.getSecond();
		
		System.out.println("The sizes of fruits are " 
		  + first.getSize() + "," + second.getSize());
	}
	
	public static void errorSetFruit()
	{
		Pair<Apple> apples = new Pair<>(new Apple(3), new Apple(4));
		Pair<? extends Fruit> fruits = apples;
		
		//fruits ���汣�����Fruit�����࣬���ǲ�֪���������ĸ����࣬���Բ��ܱ���
//		fruits.setFirst(new Orange(5)); //�������
	}
	
	public static void setFruits()
	{
		Pair<? super Apple> fruits = new Pair<Fruit>();
		
		fruits.setFirst(new Apple(5)); //Apple�������ת��
		fruits.setSecond(new GreenApple(5)); //GreenApple�������ת��
		
		//Fruit obj = fruits.getFirst(); //Ҳδ֪�䳬�����ķ������ʱ���			
		//fruits.getFirst()).hello(); //Ҳδ֪�䳬�����ķ������ʱ���		
	}

}
