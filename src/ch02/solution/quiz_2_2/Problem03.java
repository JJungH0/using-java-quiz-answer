package ch02.solution.quiz_2_2;

public class Problem03 {
    /**
     * 문자열 처리
     */

    public static void main(String[] args) {
        String name = "Java Programming";
        System.out.println("문자열: " + name);
        System.out.println("문자열 길이: " + name.replaceAll("\\s","").length());
        // \\s ->정규 표현식에서 공백 문자를 의미 (= " ", \t, \n, \r, \f)
    }
}
