import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("chicken","닭");
        dictionary.put("hippo","하마");

        dictionary.remove("chicken");
//        dictionary.remove("hippo");

        if (dictionary.isEmpty()) {
            System.out.println("단어가 하나도 없습니다.");
        } else {
            System.out.println(dictionary.size() + " 개의 단어가 있습니다.");
        }

        Scanner scanner = new Scanner(System.in);

        String english = scanner.nextLine();
        String korean = dictionary.get(english);

        if (korean == null) {
            System.out.println("사전에 존재하지 않는 단어입니다.");
        } else {
            System.out.println(english + "는" + korean + "입니다.");
        }
    }
}
