import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int bul = sc.nextInt();
        if(bul <= 1000 || bul >= 3000) {
            System.out.println("잘못 입력 하셨습니다.");
        }else{
            System.out.println(bul - 543);
        }
        
        sc.close();
    }
}