import java.util.Random;

public class Kad10_Ex01 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] numbers = new int[10];
		
		// 値の設定
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}
		
		// 表示
		for (int val : numbers) {
			System.out.print(" " + val);
		}
		System.out.println();
		
		// 一番大きい数字を探す
		int max = numbers[0];
		for (int val : numbers) {
			if (max < val ) {
				max = val;
			}
		}
		System.out.println("一番大きい数字は" + max + "です！");
	}
}
