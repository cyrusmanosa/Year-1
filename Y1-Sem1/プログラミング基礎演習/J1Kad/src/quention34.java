import java.util.Scanner;
class quention3.4{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("斜辺の長さを入力してください＞");
		int m = in.nextInt();
		double x = (double)(m*m)/4;
		System.out.print("面積は" + x + "です！");
	}
}