package codeLevel2;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/87946
 피로도
 ( https://shs00925.tistory.com/209 참고 )
 */
public class Fatigue {
    static int result = 0;

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(dungeons, visited, 0, k);
        return result;
    }

    public static void dfs(int[][] dungeons, boolean[] visited, int count, int k) {
        result = Math.max(result, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                dfs(dungeons, visited, count + 1, k - dungeons[i][1]);
                visited[i] = false;
            }
        }
    }
}
