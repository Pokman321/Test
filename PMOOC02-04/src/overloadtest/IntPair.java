package overloadtest;

public class IntPair extends Pair<Integer> {

	public IntPair(Integer first, Integer second) {
		super(first, second);
	}

	public void setFirst(Integer first) {
		super.setFirst(first);
	}

	public static void main(String[] args) {
		IntPair nums = new IntPair(1, 2);
		Pair<Integer> nums2 = nums; // תΪ�������
		nums2.setFirst(3); // ��̬���ñ����setFirst����
	}
}


