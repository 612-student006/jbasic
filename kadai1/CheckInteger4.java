import java.util.Scanner;

public class CheckInteger4{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("数字を入力して下さい：");
		int x = scan.nextInt();

        if(x >= 0){
            if(x % 2 ==0){
                System.out.print(x + "は正の偶数です");
            }else{
                System.out.print(x + "は正の奇数です");

            }
            
        }else{
            if(x % 2 ==0){
                System.out.print(x + "は負の偶数です");
            }else{
                System.out.print(x + "は負の奇数です");
            }
        }
        

		scan.close();
    }
}