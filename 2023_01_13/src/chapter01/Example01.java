package chapter01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Example01 {
	public static void main(String[] args) {
		// ** java.util package 
		// 언어를 인코딩 해주는 기능이 있음
		// 배열 대신 활용할 수 있음
		// 날짜를 관리할 수 있음
		// List 인터페이스를 구현할 수 있음

		// ** java.util package [시간처리]
		// * 시스템 시간을 보는 걸 볼거임
		// System.currentTimeMillis();
		// 현재 운영 체제의 시간을 long타입으로 반환
		// 0.001초(1) 단위까지 환산해서 보여줌
		long currentTimeMillis = System.currentTimeMillis(); // 1960년 1월 1일 0시 0분 0초 기준으로 매김
		System.out.println(currentTimeMillis); 
		
		// ** java.util.Calendar //java.util 패키지의 날짜를 다루기 위한 클래스
		// Calendar 클래스
		// 날짜 관련된 java.util package
		Calendar calendar; // public abstract 클래스(추상클래스)임 // 그래서 Calendar calendar = new Calendar();로 못 만듬
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = new GregorianCalendar(); 
		
		System.out.println(calendar1.toString()); // 실행하면 엄청길게 나옴 // 뒤편에 날짜있음
		
		// 연도
		System.out.println(calendar1.get(Calendar.YEAR)); // 2023년이 나옴 
		
		//월(Calendar 클래스는 1월이 0으로 표시됨)
		System.out.println(calendar1.get(Calendar.MONTH)); // 0월인데 첫번째 월이라다라는 뜻임
		
		//일
		System.out.println(calendar1.get(Calendar.DATE));
		
		// 요일(일요일 :1, 월요일: 2, ...... 토요일:7)
		System.out.println(calendar1.get(Calendar.DAY_OF_WEEK));
		
		
		
		calendar2.set(2022, 11, 25); // 월을 12월은 11로 적어야 12월로 표기됨
		System.out.println(calendar2); // offset보면 밀리언세컨드단위로 나와야있는데 
		
		
		// * 밀리초 단위를 시간, 분, 초로 
		// int millToHours = 32400000 / (1000); // 이렇게 나누면 초로 나눠진다고 함
		// int millToHours = 32400000 / (60 * 1000); // 1분은 60초니까 // 이렇게 하면 분을 구하고
		int millToHours = 32400000 / (60 * 60 * 1000); // 맨 앞에 60은 시간을 말하는거고 분으로 나눳을 떄의 60을 말함 // 이거는 시간을 구하는 식 
		System.out.println(currentTimeMillis);
		
		
		// * java.util package의 Date 클래스 
		//Date date = new Date(); // java.util에 있으므로 java.util로 임폴트해줌
								  // 	
		
		
		// * java.text 패키지에 있는 SimpleDateFormat 클래스
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 어디에 sdf라고 적혀져있으면 얘의 줄임말이라고 생각하면 됨 // 그리고 얘를 생성해줘야됨 // 임폴트도 해줘야함
													// 소문자 y : 연 / 대문자 M : 월 / 소문자 d : 일
		
		
	}
	
	
		

}
