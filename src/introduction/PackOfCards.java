package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/159994
 카드 뭉치
 cards1, cards2에는 특정 단어들의 배열로 되어있을때 goal에는 원하는 문장이 단어들의 배열로 되어있음.
 이때 cards1, cards2를 index순서대로 추출해서 goal 배열을 만들수 있는지?

 goal의 단어를 하나씩 cards1, cards2에 제일 앞의 값과 비교하는 로직으로 작성
 */
public class PackOfCards {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cards1Index = 0;
        int cards2Index = 0;

        for(String word : goal){
            if(!word.equals(cards1[cards1Index]) && !word.equals(cards2[cards2Index])){
                answer = "No";
                break;
            }
            if(word.equals(cards1[cards1Index]) && cards1.length-1 > cards1Index) {
                cards1Index++;
                continue;
            }
            if(word.equals(cards2[cards2Index]) && cards2.length-1 > cards2Index) cards2Index++;
        }
        return answer;
    }
}
