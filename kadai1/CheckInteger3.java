import java.util.Scanner;

public class CheckInteger3{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("年齢を入力して下さい：");
		int x = scan.nextInt();

        if(x >= 0 && x <= 130){
            System.out.print("正しい年齢です");
        }else{
            System.out.print("0～130で入力してください");
        }
        

		scan.close();
    }
}