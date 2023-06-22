public class Test_1 {
    public void Solution(int n){
        int answer = 0;
        String number1 = Integer.toString(n);
        String number2 = "";
        for(int i = number1.length()-1; i >= 0; i--){
            number2 += number1.charAt(i);
        }
        for(int i = 0; i < number2.length(); i++){
            answer += number2.charAt(i) - 48;
            if(i == 0){
                System.out.print("\"");
            }
            if(i != 0){
                System.out.print("+");
            }
            System.out.print(number2.charAt(i)-48);
        }
        System.out.print("=" + answer + "\"");

    }
    public static void main(String[] args) {
        Test_1 method = new Test_1();
        int n = 1532576;
        method.Solution(n);

    }
}
