package erased;

//Pait<T>�������Ͳ�����Ĵ���
public class Pair {
	
	private Object first;
	private Object second;

	public Pair(Object first, Object second) {
		this.first = first;
		this.second = second;
	}

	public Object getFirst() {
		return first;
	}

	public void setFirst(Object first) {
		this.first = first;
	}
}

