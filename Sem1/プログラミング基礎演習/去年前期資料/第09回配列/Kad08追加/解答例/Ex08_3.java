/*
【激ムズ問題】
すべての桁の数字が異なる整数を生成する処理を作成せよ。
なお最上位桁が0になってもいいものとする。

�@桁数を入力する（1〜9、0：終了）。
�A0が入力されたら終了する。
�B1〜9以外の値が入力されたら�@へ戻る。
�C各桁の数値を格納する配列を宣言する。

	int[] values = new int[入力された桁数];

�D配列の各要素に乱数で0〜9の値を設定する。ただし他の要素と数字が重ならないようにすること。
�E配列の各要素を続けて表示する（すべての桁の数字が異なる整数が表示される）。
�F�@へ戻る。

（実行結果）
すべての桁の数字が異なる数値を作成します！
桁数を入力してください（1〜9、0：終了）＞10
桁数を入力してください（1〜9、0：終了）＞-1
桁数を入力してください（1〜9、0：終了）＞4
6085
桁数を入力してください（1〜9、0：終了）＞6
813026
桁数を入力してください（1〜9、0：終了）＞3
048
桁数を入力してください（1〜9、0：終了）＞0
終了します！



*/


import java.util.Scanner;
import java.util.Random;

public class Ex08_3 {
	public static void main(String[] args) {
		/**  宣言  **/
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		
		/**  実行処理  **/
		System.out.println("すべての桁の数字が異なる数値を作成します！");

		
		while(true) {
			System.out.print("桁数を入力してください（1〜9、0：終了）＞");
			// �@桁数を入力

		}
		
		System.out.println("終了します！");
	}
}
