class Fuku14d{
	public static void main(String[] args){
		int nums[] = {10,20,30};
		try{
			System.out.println(nums[3]);
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
		System.out.println("参照エラーです！");
	}
}
