
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
			System.out.println("잘못된 계산값이네요");
		} catch(Exception e) { // 상속
			System.out.println("뭔가 이상합니다. 오류가 발생했습니다.");
		}
//		} catch(ArithmeticException e) {
//			System.out.println("잘못된 계산값이네요");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("없는 값을 입력하셨어요");
//		} // try-catch 사용 시 exception 발생하는 부분에서 catch구문 실행, 그 뒤로 계속 진행됨.
////		System.out.println(2/0); // exception 발생 -> 실행 중단
		System.out.println(5);

	}

}
