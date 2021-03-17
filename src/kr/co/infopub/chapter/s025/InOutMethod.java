// 025. 키보드로 입력받아 콘솔에 출력하기
package kr.co.infopub.chapter.s025;

import java.util.Scanner;

// 입력, 출력
public class InOutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);  // 키보드
		
		System.out.println("정수를 입력하세요.");
		int choice = scan.nextInt();  // 키보드로 정수 입력
		System.out.println(choice);
		
		System.out.println("실수를 입력하세요.");
		double rchoice = scan.nextDouble();  // 키보드로 실수 입력
		System.out.println(rchoice);
		
		System.out.println("문자열을 입력하세요.");
		String schoice = scan.next();  // 키보드로 문자열 입력
		System.out.println(schoice);
	}
}
