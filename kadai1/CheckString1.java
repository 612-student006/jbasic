import java.util.Scanner;

public class CheckString1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("パスワード：");
		String x = scan.next();
        if(x.equals("himitu")){
            System.out.print("一致しました");
        }else{
            System.out.print("一致しませんでした");
        }
		

		scan.close();
	}
}