import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("国語の点数を入力してください：");
		int x = scan.nextInt();
        System.out.print("数学の点数を入力してください：");
		int y = scan.nextInt();
        System.out.print("英語の点数を入力してください：");
		int z = scan.nextInt();
        double h = ((double)x + (double)y + (double)z)/3;
        System.out.print("平均は" + h + "点です");
		scan.close();
	}
}