// 025. Ű����� �Է¹޾� �ֿܼ� ����ϱ�
package kr.co.infopub.chapter.s025;

import java.util.Scanner;

// �Է�, ���
public class InOutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);  // Ű����
		
		System.out.println("������ �Է��ϼ���.");
		int choice = scan.nextInt();  // Ű����� ���� �Է�
		System.out.println(choice);
		
		System.out.println("�Ǽ��� �Է��ϼ���.");
		double rchoice = scan.nextDouble();  // Ű����� �Ǽ� �Է�
		System.out.println(rchoice);
		
		System.out.println("���ڿ��� �Է��ϼ���.");
		String schoice = scan.next();  // Ű����� ���ڿ� �Է�
		System.out.println(schoice);
	}
}
