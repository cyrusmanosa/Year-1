package J1Kadai22;

public class JKad22A2 {
    public static void main(String[] args) {
        for ( int i = 1; i <= 9; i++){
            for (int j = 9; j >= i; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
