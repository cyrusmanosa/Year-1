class JKad08S2{
	public static void main(String[] args){
		int[] a;
		a = new int[9];
		a[0] = 1;
		a[1] = 1;
		//«·for
		for(int i= 2; i<9; i++){
			// @ΚIW2σ,A1{A0
			// @ΚIW4σ,A3{A2
			a[i] = a[i -1] + a[i - 2];
		}
			
		for(int i=0; i<9; i++){
			//θϋ¦μp
			System.out.println("ζ" + (i+1) +" F" + a[i]);
		}
	}
}