class test {
	public static void main(String[] args){
		for (int i = 2;i<= 100;i++){		//1ωs₯ΏΙηs₯aΙCΘn2Jn
		boolean k = true; //»Π
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					k = false;  //ρΏΙBfalse
					break;
				}
			}
				if(k){
				System.out.println(i + " ");
				}
		}
	}
}