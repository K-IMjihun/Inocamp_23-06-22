import java.util.Arrays;

public class Test_3 {

    public static void main(String[] args) {
        Test_3 method = new Test_3();
        int[][] checkin = {{3, 4, 1, 4, 9}, {2, 9, 4, 5, 8}, {9, 0, 8, 2, 1},
                {7, 0, 2, 8, 4}, {2, 7, 2, 1, 4}};
        method.solution(checkin);
    }

    private static void solution(int[][] checkin) {
        //상 우 하 좌
        int[][] direction = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        String [][] answer = new String[5][5];

        // 좌, 우 확인을 위한 x for문
        for (int x = 0; x < 5; x++) {

            // 상, 하 확인을 위한 y for문
            for (int y = 0; y < 5; y++) {
                boolean isMaxValue = true;

                // 위치에 상하좌우를 확인
                for (int i = 0; i < 4; i++) {
                    int dx = x + direction[i][0], dy = y + direction[i][1];

                    // 상, 하, 좌, 우 배열을 초과하는 위치가 있는 경우 continue;
                    if (dx < 0 || dx >= 5 || dy < 0 || dy >= 5) {
                        continue;
                    }

                    // 상, 하, 좌, 우 크거나 같은 값이 있는 경우 isMaxValue를 false로 반환
                    if (checkin[x][y] <= checkin[dx][dy]) {
                        isMaxValue = false;
                        break;
                    }
                }

                // isMaxValue가 false라면 숫자, 아니라면 *을 삽입
                answer[x][y] = (isMaxValue)? "*" : String.valueOf(checkin[x][y]);
            }
        }
//            System.out.println(Arrays.deepToString(answer));
    }
}