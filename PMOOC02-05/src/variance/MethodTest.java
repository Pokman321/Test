package variance;


class Father
{
	public B f1(B obj)
	{
		System.out.println("Father.f1()");
		return new B();
	}
}

class Son extends Father
{
	public B f1(B obj)
	//public C f1(B obj)   //����ֵ��C��Ҳ�ǶԵ� 
	{
		System.out.println("Son.f1()");
		return new C();
	}
}

public class MethodTest {

	public static void main(String[] args) {
		Father foo = new Son();
		foo.f1(new B());

	}

}
