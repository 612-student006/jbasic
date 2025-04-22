import java.util.Scanner;

public class Input{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("お名前は？：");
		String num1 = scan.next();
        System.out.print("ようこそ、" + num1 + "さん");

		scan.close();
    }
}