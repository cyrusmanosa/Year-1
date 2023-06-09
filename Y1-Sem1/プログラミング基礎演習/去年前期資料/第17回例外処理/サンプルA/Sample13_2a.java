// Scannerのimport文
import java.util.Scanner;
// InputMismatchExceptionのimport文
import java.util.InputMismatchException;

class Sample13_2a{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inNum1;	// 整数1入力用
		int inNum2;	// 整数2入力用
		
		try{
		// エラー検知範囲 ここから
			System.out.println("割り算をします、数値を入力してください");
			System.out.print("num1:");
			inNum1 = sc.nextInt();
			
			System.out.print("num2:");
			inNum2 = sc.nextInt();
			
			System.out.println("結果:" +(inNum1/inNum2) );
			
		// エラー検知範囲 ここまで
		}catch(InputMismatchException e){
			// 入力エラーを検知した際の処理
			System.out.println("エラー内容:" + e);
			System.out.println("数値を入力してください");
		}catch(ArithmeticException e){
			// 演算エラーを検知した際の処理
			System.out.println("エラー内容:" + e);
			System.out.println("0で割ることは出来ません");
		}
	}
}
