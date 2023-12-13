import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		short x = sc.nextShort();
		short y = sc.nextShort();
		
		if(x > 0 && y > 0) {
			System.out.println("1");
		}else if(x < 0 && y > 0) {
			System.out.println("2");
		}else if(x < 0 && y < 0) {
			System.out.println("3");
		}else if(x > 0 && y < 0) {
			System.out.println("4");
		}else {
			System.out.println("잘못된 입력형식입니다.");
		}
		sc.close();
	}
}