import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class NoClassCast {

	public static void main(String[] args) {
		
		//ArrayList֧�ַ���
		
		//<String> �޶���listֻ�ܴ���ַ���		
		ArrayList<String> list = new ArrayList<String>();
		list.add("123");
		list.add("456");
		list.add("789");
		String a1 = list.get(1);
		
		for(String o:list)
		{
			System.out.println(o);
		}
		
		
		
		//Java 7 �����﷨ 
		//�޶��洢Integer
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(123);
		list2.add(456);
		list2.add(456);
		list2.add(456);
		list2.add(456);
		list2.add(456);
		list2.add(456);
		list2.add(789);
		int a2 = list2.get(1);
		
		
		//Collections.binarySearch����֧�ַ���
		int pos1 = Collections.binarySearch(list, "456");
		int pos2 = Collections.binarySearch(list2, 456);

		System.out.println(pos2);
		
		HashSet<Double> set1 = new HashSet<>();
		set1.add(1.23);
		set1.add(4.56);
		set1.add(7.89);

		for(Double i:set1){
			System.out.println(i);

		}

		//Iterator�ӿ�֧�ַ���
		Iterator<String> iter = list.iterator();  
	    while(iter.hasNext()){  
	        System.out.println(iter.next());  
	    }
	    
	    Iterator<Double> iter2 = set1.iterator();  
	    while(iter.hasNext()){  
	        System.out.println(iter.next());  
	    }
	}

}
