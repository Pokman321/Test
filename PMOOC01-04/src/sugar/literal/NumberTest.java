package sugar.literal;

public class NumberTest {
	public static void main(String[] args) {
		
		long a1 = 9999999999L;
		long a2 = 9_999_999_999L;
		
		int a3 = 0b0111_1011_0001; //������, 0b��ͷ
		int a4 = 0_214;           //�˽���, 0��ͷ
		int a5 = 123___45;         //���Զ���»���
		int a6 = 0x7_B_1;          //ʮ������
		float a7 = 3.56_78f;       //float
		double a8 = 1.3_45__67;    //double
		
		int b1 = 0b_123_4;  //_����������֮��
		int b2 = 0123_4_;   //_������ĩβ
		int b3 = _123;      //_�����ڿ�ͷ
		int b4 = 0_x_123;   //���ܲ�0x
		int b5 = 0x_51;     //_����������֮��
		long b6 = 1000_L;   //_����������֮��
		float b7 = 1.34f_;  //_������ĩβ
		
		
	}
}
