// 022. �Ǽ� Ÿ���� ���� ����ϱ�
package kr.co.infopub.chapter.s022;

// �Ǽ� ����, ����
public class HighHill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double S = 6;		// 6 ���� �Ź� ������ -> 255mm
		double P = 0.75;	// 75% ��Ʈ�� Ȯ��
		double L = 200;		// 200�Ŀ�� -> 1,787�� / 1�Ŀ��
		double T = 0;		// 0��(���� ����) 1�� �� ����
		double A = 1;		// ���ַ� 0�� -> 8.83cm 1�� -> 4.42cm
		double Y = 2;		// ����⵵
		double ups1 = P * L * (Y + 9);
		double downs = (T + 1) * (A + 1) * (Y + 10) * (L + 20);
		double ups2 = 12 + 3 * S / 8.0;
		double high = ups1 / downs * ups2;  // ������ ��
		System.out.printf("������ ������ ���̴� %1$.2fcm�Դϴ�.", high);
	}
}
