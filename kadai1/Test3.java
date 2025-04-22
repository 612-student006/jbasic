import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("国語の点数を入力してください：");
		int x = scan.nextInt();
        System.out.print("数学の点数を入力してください：");
		int y = scan.nextInt();
        System.out.print("英語の点数を入力してください：");
		int z = scan.nextInt();

        if(x > y){
            if(x > z){
                System.out.print("最高点は国語で" + x + "点です");
            }else{
                System.out.print("最高点は英語で" + z + "点です");
            }
        }else{
            if(y > z){
                System.out.print("最高点は数学で" + y + "点です");
            }else{
                System.out.print("最高点は英語で" + z + "点です");
            }
        }
		scan.close();
	}
}