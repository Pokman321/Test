package genericmethod;
public class ArrayUtilTest {

	public static void main(String[] args) {
		String s1 = ArrayUtil.<String>getMiddle("abc", "def", "ghi");
		Integer i1 = ArrayUtil.getMiddle(1,2,3);
		
		//null is ok
		String s2 = ArrayUtil.<String>getMiddle("abc", "def", null);
		
		//error Ѱ�ҹ�ͬ���࣬��ת��
//		Integer i2 = ArrayUtil.getMiddle(1,2.5f,3L);

	}

}
