import java.util.Scanner;

public class ScannerThree {

	public static void main(String[] args) {
		
		//변수 두개를 선언한다.
		int numberOne;
		int numberTwo;
		
		//int형 변수 두 개에 Scanner를 이용해서 값을 저장한다.
		Scanner input = new Scanner(System.in);
		System.out.println("첫 번째 숫자가 두 번째 숫자보다 큰 지 알아보는 프로그램입니다.");
		System.out.println("첫 번째 숫자를 입력하세요.");
		numberOne = input.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요.");
		numberTwo = input.nextInt();
		
		//첫 번째 입력한 숫자가 두 번째 입력한 숫자보다 큰 지 알아본다.
		boolean compareResult = numberOne > numberTwo;
		
		System.out.println(numberOne + " 은 " + numberTwo + " 보다 큰가요? \n" + compareResult);

	}

}
