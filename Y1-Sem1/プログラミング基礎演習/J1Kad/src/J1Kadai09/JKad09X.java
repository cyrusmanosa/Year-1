import java.util.Scanner;
class JKad09X{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("こんにちは！");
		System.out.println("わたしはスーパーティーチャー、ECC エクセレントよ！");
		System.out.println("");
		System.out.println("あなたのクラスを教えてね！");
		System.out.print("（1：IE、2：SK、3：SE、それ以外：わからない＞");
		int c = in.nextInt();
		
		if (c == 1){
			System.out.println(" 4 年制コースなのね！");
		}else if (c == 2){
			System.out.println(" 3 年制コースなのね！");
		}else if (c == 3){
			System.out.println(" 2 年制コースなのね！");
		}else{
			System.out.println("わからないのね!");
		}
	}
}