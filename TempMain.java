import java.util.Scanner;

public class TempMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요 (종료하려면 'exit나 calcel'를 입력하세요):");

        while (true) {
            if (scanner.hasNext("(exit){2}|cancel")) { // 종료 조건
                break;  // 'exit' 입력 시 반복 종료
            }

            // 정수 패턴 확인
            if (scanner.hasNext("\\d+")) { // 하나 이상의 숫자 패턴
                int number = scanner.nextInt(); // 정수 읽기
                System.out.println("입력한 정수: " + number);
            } else {
                String input = scanner.next(); // 문자열로 읽기
                System.out.println("정수가 아닙니다. 다시 입력하세요: " + input);
            }
        }

        scanner.close();
        System.out.println("프로그램이 종료되었습니다.");
    }
}