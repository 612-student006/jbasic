import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("国語の点数を入力してください：");
		int x = scan.nextInt();
        System.out.print("数学の点数を入力してください：");
		int y = scan.nextInt();
        System.out.print("英語の点数を入力してください：");
		int z = scan.nextInt();

        if(x >= 80){
            if(y >= 75){
                if(z >= 70){
                    System.out.print("合格です");
                }
            }

        }else{
            System.out.print("不合格です");
        }
		scan.close();
	}
}