import java.util.Scanner;
class Sample07_1{
	public static void main(String[] args){
		// 宣言
		Scanner sc = new Scanner(System.in);
		int inNum;
		System.out.print("繰り返したい回数を入力：");
		inNum = sc.nextInt();	// 繰り返し回数を入力
		
		// 繰り返し処理
		for(int count=1; count<=inNum; count++){
			System.out.println("攻撃" + count + "回目!");
		}
		System.out.println("攻撃終了");
	}
}
