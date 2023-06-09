/*
範囲外の数値を入力された場合は
その警告文を表示してください


Aクラス
出席番号0 足立
出席番号1 岩中
出席番号2 上田
出席番号3 江頭
出席番号4 奥村

Bクラス
出席番号0 神田
出席番号1 木下
出席番号2 黒沢
出席番号3 剱持
出席番号4 古賀


[実行結果]
表示したいクラスを入力   0:Aクラス / 1:Bクラス >0
表示したい出席番号を入力 >6
範囲内の数値を入力してください


*/

import java.util.Scanner;
class Sample09_1d{
	public static void main(String[] args){
		// 宣言 (多次元配列を作成したパターン)
		String names[][] = {{ "足立","岩中","上田","江頭","奥村"},	// Aクラスの名簿
						    { "神田","木下","黒沢","剱持","古賀"}};		// Bクラスの名簿
							
		Scanner sc = new Scanner(System.in);//Scanner
		int inClass;// クラス入力用
		int inNo;	// 出席番号入力用
		
		System.out.print("表示したいクラスを入力   0:Aクラス / 1:Bクラス >");
		inClass = sc.nextInt();
		
		System.out.print("表示したい出席番号を入力 >");
		inNo = sc.nextInt();
		
		if(inClass < 0 || 1 < inClass || inNo < 0 || 4 < inNo){
			System.out.println("範囲内の数値を入力してください");
		}else{
			System.out.println("選択した生徒は"+ names[inClass][inNo]);
		}
		
	}
}