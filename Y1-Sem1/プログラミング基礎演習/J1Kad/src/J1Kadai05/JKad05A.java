import java.util.Scanner;
class JKad05A{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("半径を入力してください");
		
		double r = in.nextDouble();
		double a = 4 * 3.14 * (r * r);
		double b = (4 * 3.14 * (r * r * r))/3;
		
		System.out.println("半径" + r + "の球の表面積は" + a + "、体積は" + b + " です！");
	}
}