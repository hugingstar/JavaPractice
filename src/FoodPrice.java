import java.util.Scanner;

public class FoodPrice {
    public static void main(String[] args) {
        System.out.println("[메뉴판]\n " +
                "1. 치킨, 2. 순대국, 3. 스테이크 \n " +
                "드실 음식은 무엇인가요?");
        Scanner scanner = new Scanner(System.in);
        int menuNumber;
//        String name = scanner.nextLine();
        try{
            menuNumber = scanner.nextInt();
        } catch (Exception e) {
            menuNumber = -1;
        }


        switch (menuNumber){
            case 1:
                System.out.println("치킨은 500 원 입니다.");
                break;
            case 2:
                System.out.println("순대국은 8,000 원 입니다.");
                break;
            case 3:
                System.out.println("스테이크는 5,000 원 입니다.");
                break;
            default:
                System.out.println("없는 메뉴입니다. 올바른 번호를 입력해주세요.");
        }
    }
}
