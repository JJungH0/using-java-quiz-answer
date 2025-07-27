package ch02.solution.quiz_2_2;

public class Problem01 {
    /**
     * 변수 선언 및 초기화
     */

    public static void main(String[] args) {
        double principal = 15000;
        double rate = 0.05;
        double interest = principal * rate;

//        System.out.println("이자는: " + (int)interest);
        System.out.printf("이자는: %.0f\n",interest);
    }
}
