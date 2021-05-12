package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		// 로컬변수 v1
		int v1 = 15;
		if (v1 > 10) {
			// if블록에서 선언
			int v2;
			v2 = v1 - 10;
		}
		
		byte b_byte = 0b1011;
		short s_short = 0206;
		char c_char;
		int i_int = 100;
		long l_long = 200;
		
		// if블록이던 v2변수는사용할 수 없다.
		// int v3 = v1 + v2 + 5; // error
		int v3 = v1 + 5;
		
		System.out.println(v3);
	}

}
