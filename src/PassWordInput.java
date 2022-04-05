import java.util.Scanner;

public class PassWordInput {
    public static void main(String[] args) {
        String password = "abc123";
        Scanner scanner = new Scanner(System.in);
        System.out.println("비밀번호를 입력해주세요.");
        String input = scanner.nextLine();
        while (input.equals(password) != true) {
            System.out.println("비밀번호를 입력해주세요");
            input =scanner.nextLine();
        }
        System.out.println("로그인 되었습니다.");
    }
}
