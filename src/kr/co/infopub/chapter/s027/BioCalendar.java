// 027. 연산자를 이용하여 바이오리듬 값 구하기
package kr.co.infopub.chapter.s027;

// 연산 % * /
public class BioCalendar {
	public static final int PHYSICAL = 23;  // 상수(개발자 정의), 상수값은 변경 불가
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = PHYSICAL;  // 상수값을 변수에 대입
		int days = 1200;
		
		// Math.PI 3.14에서 정의되어 있는 상수
		double vals = (days % index) * 2 * Math.PI / index;
		System.out.println(Math.toDegrees(vals) + "도");
	}
}
