import java.util.Scanner;

class JKad09D1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("ひとつめの整数を入力してください＞");
		int o = in.nextInt();
		System.out.print("ふたつめの整数を入力してください＞");
		int t = in.nextInt();
		if (o > t) {
			System.out.print("ふたつの数字で大きい方は" + o + "です！");
		}else{
			System.out.print("ふたつの数字で大きい方は" + t + "です！");
		}
	}
}