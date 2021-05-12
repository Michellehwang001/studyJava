package chap05;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); //일(1) ~ 토(7)까지의 숫자를 리턴
		
		switch(week) {
			case 1:
				today = Week.Sunday;
				break;
			case 2:
				today = Week.Monday;
				break;
			case 3:
				today = Week.Tuesday;
				break;
			case 4:
				today = Week.Wednesday;
				break;
			case 5:
				today = Week.Thursday;
				break;
			case 6:
				today = Week.Friday;
				break;
			case 7:
				today = Week.Sunday;
				break;
		}
		
		System.out.println("오늘 요일은 " + today);
	}

}
