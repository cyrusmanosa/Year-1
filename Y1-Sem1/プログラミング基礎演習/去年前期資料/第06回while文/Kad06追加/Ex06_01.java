/*
新聞を折りたたむ処理を作成せよ。

�@パワーを入力する。
�Aパワーが新聞の厚さ（初期値：1）以上のとき、新聞を折りたたむ（厚さが倍になる）。
�Bパワーが新聞の厚さより小さいとき、折りたたんだ回数を表示して終了する。

（実行画面）
新聞を何回折りたためるか挑戦します！
あなたのパワーを入力してください＞100
新聞を折りたたんだ！厚さは2
新聞を折りたたんだ！厚さは4
新聞を折りたたんだ！厚さは8
新聞を折りたたんだ！厚さは16
新聞を折りたたんだ！厚さは32
新聞を折りたたんだ！厚さは64
新聞を折りたたんだ！厚さは128
7回折りたためた！
*/



public class Ex06_01 {
	public static void main(String[] args) {
		int power;						// パワー
		int thickness = 1;				// 新聞の「厚み」
		int count = 0;					// 折りたたんだ回数
		
		
		System.out.println("新聞を何回折りたためるか挑戦します！");
		System.out.print("あなたのパワーを入力してください＞");


		System.out.println("新聞を折りたたんだ！厚さは");
		System.out.println("回折りたためた！");
	}
}
