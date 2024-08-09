package codeLevel1;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/12901
 2016년
 - 016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수
 - a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환

 */
public class Year2016 {
    public String solution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
    }
}
