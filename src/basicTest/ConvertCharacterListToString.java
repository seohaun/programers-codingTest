package basicTest;
/*
 문자 리스트를 문자열로 변환하기
 - 문자들이 담겨있는 배열 arr가 주어집니다.
 - arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 */
public class ConvertCharacterListToString {

    public static void main(String[] args) {
        String [] arr = {"a", "b", "c"};
        String test = solution(arr);
        if("abc".equals(test)){
            System.out.println("일치");
        }else{
            System.out.println("일치하지않음");
        }
    }

    public static String solution(String[] arr) {
        String answer = "";
        for(String temp : arr){
            answer += temp;
        }
        return answer;
    }

}
