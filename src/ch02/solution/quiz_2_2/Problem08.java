package ch02.solution.quiz_2_2;

public class Problem08 {
    /**
     * char 타입 사용
     */
    public static void main(String[] args) {
        char[] chars = {0x41, 0xAC00, 0x263A};

        for (char ch : chars) {
            System.out.println("문자: " + ch + ", 유니코드 값: " + Integer.toHexString(ch));
        }
    }
}
