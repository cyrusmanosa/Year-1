class JKad05S{
	public static void main(String[] args){
		double a = Math.random();
		System.out.println("取得した乱数" + a);
		
		double b = ((double)Math.round(a * 10))/10;
		System.out.println("小数第1 位で四捨五入" + b);
		
		double c = ((double)Math.round(a * 100))/100;
		System.out.println("小数第2 位で四捨五入" + c);
		

		double d = ((double)Math.round(a * 1000))/1000;
		System.out.println("小数第3 位で四捨五入" + d);
	}
}