import java.util.Scanner;

class JKad06S2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("半径を入力してください＞");
		final double PI = 3.14159265;
		double r = in.nextDouble();
		double a = 4*PI*r*r;
		double b = (4*PI*r*r*r)/3;
		System.out.print("半径" + r + "の球の表面積は" + a + "、体積は" + b + "です！");
	}
}