class Test06_3{
	public static void main(String[] args){
		// 宣言部
		int enmHp = 10;	//敵のHP
		int ap = 3;		//自分の攻撃力
		
		// 無限ループ
		while(true){
			System.out.println("攻撃:" + ap + "ダメージ");
			System.out.println("スライム：いたい！");
			
			// 敵のHPを攻撃力分減らす
			enmHp -= ap;	
			
			// もし敵を倒した状態なら
			if(enmHp <= 0){
				break;	// ブロックから抜ける
			}
		}
	}
}
