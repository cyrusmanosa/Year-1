import java.util.Scanner;
class quention35{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("教室番号を入力してください＞");
		int num = in.nextInt();
		int a = num/1000;
		int b = (num%1000)/100;
		System.out.print(num + "教室は" + a + "号館の" + b + "階にあります");
	}
}