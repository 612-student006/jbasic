
import java.util.Scanner;
public class CheckString3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("名前：");
		String x = scan.next();
        int length = x.length();
        if(length > 20){
            System.out.print("エラー：20文字以内で入力してください");
        }else{
            System.out.print("ようこそ" + x +"さん");
        }
		

		scan.close();
	}
}