import java.util.Scanner;

public class StringToDouble {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("달러 환율을 입력하세요.");
        String exchangeString = scanner.nextLine();
        System.out.println("순대국 가격을 입력해주세요.");
        String priceOfSoupString = scanner.nextLine();
        try{
            double exchange = Double.parseDouble(exchangeString);
            double priceOfSoup = Double.parseDouble(priceOfSoupString);
            System.out.println("순대국은" + priceOfSoup/exchange + "달러입니다.");
            } catch (Exception e) {
            System.out.println("숫자를 입력해야 합니다.");
        }
    }
}
