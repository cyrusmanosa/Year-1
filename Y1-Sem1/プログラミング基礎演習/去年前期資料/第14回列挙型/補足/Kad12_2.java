public class Kad12_2{
	
	// enum 血液型を定義
	enum BloodType{A, B, O, AB}
	
	public static void main(String[] args){
		
		System.out.println("*** 血液型別の特徴 ***");
		
		// 定義した血液型の列挙型を全て表示するためのループ(拡張for文)
		for(BloodType bt : BloodType.values()){
			// 定義した血液型と"型"という文字列を表示
			System.out.print(bt + "型：");
			
			// 血液型を元に条件分岐(switct文)
			switch(){
			// A型なら
			case A:
				System.out.println("几帳面");
				// switch文から抜ける
				break;
			// B型なら
			case B:
				System.out.println("個性的");
				// switch文から抜ける
				break;
			// O型なら
			case O:
				System.out.println("大らか");
				// switch文から抜ける
				break;
			// AB型なら
			case AB:
				System.out.println("天才肌");
				// switch文から抜ける
				break;
			}
		}
	}
}
