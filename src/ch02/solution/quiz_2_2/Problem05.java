package ch02.solution.quiz_2_2;

/**
 * 연산과 변수 업데이트
 */
public class Problem05 {
    public static void main(String[] args) {
        // TODO: 초기 잔액
        double balance = 100;
        // TODO: 월 이율
        double monthlyRate = 0.05;

        for (int month = 1; month <= 12; month++) {
            // TODO: 매달 이자 추가
            balance += balance * monthlyRate;
        }
        // TODO: 최종 balance를 "최종 잔액: " 뒤에 출력
        System.out.println("최종 잔액: " + balance);
    }
}
