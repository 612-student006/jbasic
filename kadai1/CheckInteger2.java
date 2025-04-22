import java.util.Scanner;

public class CheckInteger2{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("xの値を入力して下さい：");
		int x = scan.nextInt();
        System.out.print("yの値を入力して下さい：");
		int y = scan.nextInt();

        if(x < y){
            System.out.print("xはyより小さいです");
        }else if(x > y){
            System.out.print("xはyより大きいです");
        }else{
            System.out.print("xとyは等しいです");
        }
        

		scan.close();
    }
}