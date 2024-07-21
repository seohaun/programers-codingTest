package introduction;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/142086
 가장 가까운 글자
 - 문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶습니다.
 - 예를 들어, s="banana"라고 할 때,  각 글자들을 왼쪽부터 오른쪽으로 읽어 나가면서 다음과 같이 진행할 수 있습니다.
 - 따라서 최종 결과물은 [-1, -1, -1, 2, 2, 2]가 됩니다.
 입출력 예
 s	        result
 "banana"	[-1, -1, -1, 2, 2, 2]
 "foobar"	[-1, -1, 1, -1, -1, -1]

 S의 단어를 반복문 2번 사용하여 해결하는 로직 사용 ( s단어만큼 반복, 첫번째 반복문의 index를 시작으로 -1씩 반복 해서 가장 가까운 글자를 찾는 로직으로 작성 )
 -> 아래 주석으로 하면 시간 복잡도를 O(n)으로 줄일수 있다고 함. 지금 내가 한건 0(n제곱)..
 */
public class NearestLetter {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int index = 0;
        char[] chaArray = s.toCharArray();
        for (char chr : chaArray) {
            int value = -1;
            for (int i = index - 1; i >= 0; i--) {
                if (chr == chaArray[i]) {
                    value = index - i;
                    break;
                }
            }
            answer[index] = value;
            index++;
        }
//        Map<Character, Integer> lastIndexMap = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            answer[i] = -1;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            char currentChar = s.charAt(i);
//            if (lastIndexMap.containsKey(currentChar)) {
//                int lastIndex = lastIndexMap.get(currentChar);
//                answer[i] = i - lastIndex;
//            }
//            lastIndexMap.put(currentChar, i);
//        }
        return answer;
    }
}
