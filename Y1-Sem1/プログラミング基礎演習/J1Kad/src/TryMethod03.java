import java.util.Scanner;

class TryMethod03{
	public static void show(int count){
		int i = 0;
		while (i < count){
			System.out.println("Hello");
			i++;
		}
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int inNum;
		System.out.print("表示したい回数を入力：");
		inNum = in.nextInt();
		show(inNum);
	}
}