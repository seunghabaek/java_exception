
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10, 20, 30};
		
		try {
			System.out.println(2);
			System.out.println(scores[3]);
			System.out.println(3);
			System.out.println(2/0);
			System.out.println(4);
		} catch(ArithmeticException e) {
			System.out.println("�߸��� ��갪�̳׿�");
		} catch(Exception e) { // ���
			System.out.println("���� �̻��մϴ�. ������ �߻��߽��ϴ�.");
		}
//		} catch(ArithmeticException e) {
//			System.out.println("�߸��� ��갪�̳׿�");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("���� ���� �Է��ϼ̾��");
//		} // try-catch ��� �� exception �߻��ϴ� �κп��� catch���� ����, �� �ڷ� ��� �����.
////		System.out.println(2/0); // exception �߻� -> ���� �ߴ�
		System.out.println(5);

	}

}
