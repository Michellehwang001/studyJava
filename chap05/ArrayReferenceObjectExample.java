package chap05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println( strArray[0] == strArray[1]);
		System.out.println( strArray[0] == strArray[2]);
		System.out.println( strArray[0].equals(strArray[2]));
		
		String s1 = "abcdefg";
		String s2 = "abcdefg";
		if( s1 == s2) {
			System.out.printf("s1, s2는 같다.");
		}
		else {
			System.out.printf("s1, s2 다르다."); 
		}
		if( s1.equals(s2)) {
			System.out.printf("s1, s2는 같다.");
		}
		
		// ArrayList arr1 = new ArrayList();
		byte bytes[] = s1.getBytes();
		System.out.println("bytes[] " + bytes);
		
		LocalDateTime now = LocalDateTime.now();
        String s9 = String.format("%04d-%02d-%02d %02d:%02d:%02d", 2019, 10, 10, 18, 10, 15) ;
        //LocalDateTime now = LocalDateTime.parse(s9) ;
        LocalDateTime now2 = LocalDateTime.parse(s9, DateTimeFormatter.ofPattern("yyyy-mm-dd HH:MM:SS"));
		//System.out.println("now2 :  " + now2);
        
        
		//System.out.println("now :  " + now);
		int intValue = myValueOf("8900");
		System.out.println("integer :  " + intValue);

	}
	
	public void getFullYearMonth() throws Exception {
	    // 대상 날짜로 LocalDateTime 만들기
	    String dateString = "2018-08-04T10:11:30";
	    LocalDateTime parsedLocalDateTime = LocalDateTime.parse(dateString);

	    // LocalDateTime에서 필요한 내용 필요한 형식으로 뽑기
	    String yyyyMMdd = parsedLocalDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	    String yyyy = parsedLocalDateTime.format(DateTimeFormatter.ofPattern("yyyy"));
	    String MM = parsedLocalDateTime.format(DateTimeFormatter.ofPattern("MM"));

	    System.out.println(yyyyMMdd);
	    System.out.println(yyyy);
	    System.out.println(MM);
	}
	
	static int myValueOf(String input) {
		
		return Integer.parseInt(input);
	}

}
