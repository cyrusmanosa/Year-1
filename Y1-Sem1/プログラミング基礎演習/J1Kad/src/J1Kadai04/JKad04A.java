import java.util.Scanner;

class JKad04A{
	public static void main(String[] args){
		int Num;
		int A;
		int B;
		int C;
		int D;
		
		Scanner in = new Scanner(System.in);
		System.out.print("教室番号を入力してください＞");
		
		Num = in.nextInt();
		//千
		A = (Num / 1000);
		//百
		B = (Num % 1000)/100; 
		//十
		C = (Num % 1000)%100/10; 
		//単
		D = (Num % 1000)%100%10;
		System.out.println("一の位" + D);
		System.out.println("十の位" + C);
		System.out.println("百の位" + B);
		System.out.println("千の位" + A);
	}
}