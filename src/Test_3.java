public class Test_3 {
    public void Solution(int[][] checkin){
        String [][] answer = new String[checkin.length][checkin[0].length];

        // 1 꼭짓점 부분 구현
        // 1-1. [0, 0]
        answer[0][0] = (checkin[0][0] > Math.max(checkin[0][1], checkin[1][0])
                ? "*" : String.valueOf(checkin[0][0]));

        // 1-2. [checkin.length, 0]
        answer[checkin.length-1][0] = (checkin[checkin.length-1][0]
                > Math.max(checkin[checkin.length-2][0] ,checkin[checkin.length-1][1]))
                ? "*" : String.valueOf(checkin[checkin.length-1][0]);


        // 1-3. [0, checkin[0].length]
        answer[0][checkin[0].length-1] = (checkin[0][checkin[0].length-1]
                > Math.max(checkin[0][checkin[0].length-2], checkin[1][checkin[0].length-1]))
                ? "*" : String.valueOf(checkin[0][checkin[0].length-1]);

        // 1-4. [checkin.length-1][checkin[0].length-1]
        answer[checkin.length-1][checkin[0].length-1] = (checkin[checkin.length-1][checkin[0].length-1]
                > Math.max(checkin[checkin.length-1][checkin[0].length-2],
                checkin[checkin.length-2][checkin[0].length-1]))
                ? "*" : String.valueOf(checkin[checkin.length-1][checkin[0].length-1]);


        // 2. 세가지 값만 비교하면 되는 첫번째, 마지막 행과 열
        for(int i = 1; i < checkin.length-1; i++) {

            //첫번째 열
            answer[0][i] = (checkin[0][i]
                    > Math.max(checkin[1][i]
                        , Math.max(checkin[0][i - 1], checkin[0][i + 1])))
                    ? "*" : String.valueOf(checkin[0][i]);

            //마지막 열
            answer[checkin.length-1][i] =
                    (checkin[checkin.length-1][i] >
                            Math.max(checkin[checkin.length-2][i],
                                    Math.max(
                                            checkin[checkin.length-1][i - 1], checkin[checkin.length-1][i + 1])))
                            ? "*" : String.valueOf(checkin[checkin.length-1][i]);

            //첫번째 행
            answer[i][0] = (checkin[i][0] > Math.max(checkin[i][1],
                        Math.max(checkin[i - 1][0], checkin[i + 1][0])))
                    ? "*" : String.valueOf(checkin[i][0]);

            //마지막 행
            answer[i][checkin.length-1] =
                    (checkin[i][checkin.length-1] >
                            Math.max(checkin[i][checkin.length-2],
                                    Math.max(checkin[i - 1][checkin.length-1], checkin[i + 1][checkin.length-1])))
                            ? "*" : String.valueOf(checkin[i][checkin.length-1]);
        }

        // 3. 상하좌우를 모두 비교해야 하는 두번째 ~ 마지막 앞까지의 행과 열
        for(int i = 1; i < checkin.length-1; i++){
            for(int j = 1; j < checkin[i].length-1; j++){
                answer[i][j] = (checkin[i][j] >
                        Math.max(
                                Math.max(checkin[i][j-1], checkin[i][j+1]),
                                Math.max(checkin[i-1][j], checkin[i+1][j])))
                        ? "*" : String.valueOf(checkin[i][j]);
            }
        }

        for(int i = 0; i < checkin.length; i++){
            for(int j = 0; j < checkin[i].length; j++){
                if(j != 0){
                    System.out.print(" ");
                }
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Test_3 method = new Test_3();
        int [][] checkin = {{7,4,6,5,9}, {6,1,3,4,5}, {4,8,5,6,9}, {1,3,0,6,4}, {6,4,8,1,7}};
        method.Solution(checkin);
   }
}