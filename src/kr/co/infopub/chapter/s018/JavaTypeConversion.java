// 018. ���ڿ��� �Ǽ��� ��ȯ�ϱ�
package kr.co.infopub.chapter.s018;

// Ÿ�� ��ȯ�� �ʿ伺
public class JavaTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String slat = "37.52127220511242      ";
		System.out.println(slat + "���� ���� ��");
		
		// String slat = "Hello";
		// ���� ���� �� double�� Ÿ�� ��ȯ
		double latitude = Double.parseDouble(slat.trim());
		System.out.println(latitude);
		System.out.println(latitude + "���� ���ŵ�");
	}
}
