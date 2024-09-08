package codeLevel1;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/86491
 최소직사각형

 다른 사람의 힌트 : 길이가 긴 것을 가로로 짧은 것을 세로로 정하고 둘다 최대값을 구하면 최소 지갑으로 가능..
 */
public class MinimumRectangle {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for(int[] size : sizes) {
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);
            maxWidth = Math.max(maxWidth, w);
            maxHeight = Math.max(maxHeight, h);
        }

        return maxWidth*maxHeight;
    }
}
