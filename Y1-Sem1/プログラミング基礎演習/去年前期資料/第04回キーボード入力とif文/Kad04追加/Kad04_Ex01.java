import java.util.Scanner;

public class Kad04_Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ひとつめの整数を入力してください＞");	int num1 = sc.nextInt();
		System.out.print("ふたつめの整数を入力してください＞");	int num2 = sc.nextInt();
		System.out.print("みっつめの整数を入力してください＞");	int num3 = sc.nextInt();
		System.out.print("よっつめの整数を入力してください＞");	int num4 = sc.nextInt();
		
		int max = num1;
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		if (max < num4) {
			max = num4;
		}
		System.out.println("いちばん大きい値は" + max + "です！");
	}
}
