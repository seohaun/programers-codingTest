package introduction;

import java.util.Map;
import java.util.TreeMap;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120896
 한 번만 등장한 문자
 - 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

 TreeMap은 키가 정렬되어서 저장되기 때문에 TreeMap에 Key(영어단어), value(갯수) 이렇게 저장하고 한번만 나온 값만 result에 추가.
 */
public class CharacterOnlyOnce {
    public String solution(String s) {
        TreeMap<Character, Integer> charMap = new TreeMap<>();
        for (char chr : s.toCharArray()) {
            charMap.put(chr, charMap.getOrDefault(chr, 0) + 1);
        }
        StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() == 1) {
                result.append(entry.getKey());
            }
        }
        return result.toString();
    }
}
