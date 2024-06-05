package introduction;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120869?language=java
 외계어 사전
 - PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다. 알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다.
 - spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.

 return Arrays.stream(dic).map(s -> s.chars().sorted().mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining())).collect(Collectors.toList())
                          .contains(Arrays.stream(spell).sorted().collect(Collectors.joining())) ? 1 : 2;
 -> 스트림으로 하면 이렇게 길게 나오는...?
 */
public class AlienLanguageDictionary {
    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};

        int solution = solution(spell, dic);
        if (solution == 2) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int solution(String[] spell, String[] dic) {
        for (String word : dic) {
            if (canSpell(word, spell)) {
                return 1;
            }
        }
        return 2;
    }

    private static boolean canSpell(String word, String[] spell) {
        for (String spe : spell) {
            if (!word.contains(spe)) {
                return false;
            }
            word = word.replace(spe, "");
        }
        return word.isEmpty();
    }
}
