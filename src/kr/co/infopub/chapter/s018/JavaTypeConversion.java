// 018. 문자열을 실수로 변환하기
package kr.co.infopub.chapter.s018;

// 타입 변환의 필요성
public class JavaTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String slat = "37.52127220511242      ";
		System.out.println(slat + "공백 제거 전");
		
		// String slat = "Hello";
		// 공백 제거 후 double로 타입 변환
		double latitude = Double.parseDouble(slat.trim());
		System.out.println(latitude);
		System.out.println(latitude + "공백 제거됨");
	}
}
