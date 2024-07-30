package codeLevel1;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/133502
 햄버거 만들기

 ingredient 에는 1,2,3 ( 1: 빵, 2: 야채, 3: 고기 ) 가 랜덤으로 나열이 됨. 이때 1,2,3,1 ( 빵,야채,고기,빵 ) 순서가 있다면 햄버거를 1개 만들수 있음. 햄버거를 몇개 만들 수 있는지 반환.

 1. ingredient 전체에서 1,2,3,1이 있는지 확인하고 있으면 ingredient 배열에서 1,2,3,1이 시작한 index전의 배열 + index+4 의 배열을 합쳐서 다시 1,2,3,1이 있는지 확인 하는 로직으로 작성 -> 실패 ( 이유 : 문자열 비교가 너무 오래 걸려서 시간 초과 )
 2. indexOf 사용해서 1231이 포함하는지 확인 -> 실패 ( 이유 : indexOf는 전체 문자열을 스캔하기 때문에 코딩 테스트 제출시 시간 초과가 나버림 )
 3. subSequence 사용해서 부분 문자열만 검색후에 equals 사용.
 */
public class MakingHamburgers {
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder orderStr = new StringBuilder();
        for (int order : ingredient) {
            orderStr.append(order);
            //if(orderStr.indexOf("1231") != -1){
            if (orderStr.length() > 3 && orderStr.subSequence(orderStr.length() - 4, orderStr.length()).equals("1231")) {
                answer++;
                orderStr.delete(orderStr.length() - 4, orderStr.length());
            }
        }
        return answer;
    }
}
