// Scannerのimport文
import java.util.Scanner;
// InputMismatchExceptionのimport文


class Sample13_1b{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num;
		
		// エラー検知範囲 ここから
			System.out.print("数値を入力してください:");
			num = sc.nextInt();
			System.out.println("入力値は" + num);
		
		// エラー検知範囲 ここまで
		
			
		// エラーを検知した際の処理
			System.out.println("エラー内容:" + );
			System.out.println("入力値が不正です");
		
	}
}
