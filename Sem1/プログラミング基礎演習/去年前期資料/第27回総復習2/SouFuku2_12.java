
/*
	3行4列のクロス集計表を表示するプログラムを作成しなさい。
	
	＜実行結果＞
	*** 3行4列のクロス集計表 ***
	1       2       3       4        | 10
	5       6       7       8        | 26
	9       10      11      12       | 42
	-------------------------------------
	15      18      21      24       | 78

*/

class SouFuku2_12{
	public static void main(String[] args){
		/*******
		* 宣言 *
		********/
		
		int[][] table = {{1, 2, 3, 4},
						 {5, 6, 7, 8},
						 {9, 10, 11, 12}};
						 
		int[] rowSum = new int[3];	//行合計
		int[] colSum = new int[4];	//列合計
		int total = 0;				//総合計
		
	}
}
