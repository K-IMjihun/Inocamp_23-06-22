public class Test_2 {
    public void Solution(int n){
        for(int i = 0; i < n; i++) {

            // 공백 삽입
            for (int j = 0; j < (n-i)-1; j++) {
                System.out.print(" ");
            }

            // 별 갯수
            // 0이면 1, 1이면 3, 2이면 5 ....
            for (int j = 0; j < (i*2)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Test_2 method = new Test_2();
        int n = 3;
        method.Solution(n);

    }
}
