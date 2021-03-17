// 024. 메서드 선언하고 호출하기
package kr.co.infopub.chapter.s024;

// 메서드
public class Hello {
	// 메서드 선언
	public static void showHello() {
	/*
	 * 책에는 public static void showHelp() { 라고 적혀있는데
	 * 아마 public static void showHello() { 를 오타낸듯
	 */
		System.out.println("********************************");
		System.out.println("* 이 프로그래밍은 Java200이 만들었습니다. *");
		System.out.println("********************************");
	}
	
	// 메서드 호출
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showHello();  // '메서드 이름()'
	}
}
