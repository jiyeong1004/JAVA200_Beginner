//  026. ��� ����ϱ�
package kr.co.infopub.chapter.s026;

// ���
public class BioCalendar {
	// ���, ������� ������ �� ����.
	public static final int PHYSICAL = 23;  // ���(������ ����)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PHYSICAL);
		int index = PHYSICAL;  // ������� ������ ����
		
		//Math.PI 3.14���� ���ǵǾ� �ִ� ���
		double vals = 2 * Math.PI / index;
		System.out.println(vals + "����");
	}
}
