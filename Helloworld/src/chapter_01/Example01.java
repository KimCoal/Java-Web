package chapter_01;

public class Example01 {
	
	public static void main(String[] args) {
//		static 클래스가 로드되면 바로 실행
//		void 반환타입 존재하지 않는다
		
//		   한줄 주석
		/* 부분 주석 */
		
//		변수
//		데이터를 저장하는 메모리 공간 (변경가능)
//		데이터타입 변수명; (변수 선언)
		int number; 
		number = 10;
		System.out.println(number);
		
		char character = 'a';
		System.out.println(character);
//		char void;
		
//		상수
//		데이터를 저장하는 메모리 공간 (변경 불가능)
//		final 데이터타입 상수명; (상수 선언)
		final double PI = 3.14;
		System.out.println(PI);
//		PI = 11;
		final int NUMBER;
		NUMBER = 14;
//		NUMBER = 12;
		
		
	}

}
