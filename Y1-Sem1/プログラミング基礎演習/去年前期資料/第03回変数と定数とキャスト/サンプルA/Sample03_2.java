class Sample03_2{
	public static void main(String args[]){
		/* ΟΜιΎ */
		// €iAΜPΏ
		int priceA = 2000;
		// €iAΜΒ
		int numA = 11;
		// ΑοΕ
		double tax;
		// ¬v
		int subtotal;
		// v
		double total;
		
		// ¬vΜvZ(€iAΜPΏ x €iAΜΒ)
		subtotal = priceA * numA;
		// ΑοΕΜvZ(¬v x 0.1)
		tax = subtotal * 0.1;
		// vΰzΜvZ(¬v + ΑοΕ)
		total = subtotal +  tax;
		
		// ζΚΙ\¦
		System.out.println("€iA " + priceA + " * " + numA + " = " + priceA * numA);
		System.out.println("--------------------------");
		System.out.println("¬v             " + subtotal);
		System.out.println("ΑοΕ           " + (int)tax);
		System.out.println("v             " + (int)total);
	}
}
