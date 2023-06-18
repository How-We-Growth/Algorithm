class Solution {

    static int[] dx = {1, 0, 0, -1};  //차례대로 남쪽으로 이동(S), 동쪽으로(E), 서쪽으로(W), 북쪽으로(N)
    static int[] dy = {0, 1, -1, 0};
    static int nx = 0;
    static int ny = 0;

    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int sx = 0; //시작 위치 x좌표
        int sy = 0; //시작 위치 y좌표

        for (int i = 0; i < park.length; i++) { //시작 위치 좌표 찾기
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    sx = i;
                    sy = j;
                }
            }
        }

        nx = sx;  //현재 위치에 시작 위치 저장
        ny = sy;


        for (String route : routes) {
            char dir = route.charAt(0); //명령어의 방향
            int cnt = route.charAt(2) - '0'; //명령어의 횟수

            if (dir == 'S') {
                check(0, cnt, park);
            } else if (dir == 'E') {
                check(1, cnt, park);
            } else if (dir == 'W') {
                check(2, cnt, park);
            } else {
                check(3, cnt, park);
            }
        }

        answer[0] = nx;
        answer[1] = ny;

        return answer;
    }

    static void check(int dir, int cnt, String[] park) {
        int nowX = nx; //명령어가 취소될 수 있으므로 임시 변수에 넣어준다.
        int nowY = ny;
        boolean isCompleted = false;

        for (int i = 0; i < cnt; i++) {
            int nextX = nowX + dx[dir];
            int nextY = nowY + dy[dir];

            //범위를 벗어날 경우 false, break
            if (nextX < 0 || nextX >= park.length || nextY < 0 || nextY >= park[0].length()) {
                isCompleted = false;
                break;
            }

            //장애물이 있을 경우 false, break
            if (park[nextX].charAt(nextY) == 'X') {
                isCompleted = false;
                break;
            }

            nowX = nextX;
            nowY = nextY;
            isCompleted = true;
        }

        if (isCompleted) {
            nx = nowX;
            ny = nowY;
        }

    }

}//class
