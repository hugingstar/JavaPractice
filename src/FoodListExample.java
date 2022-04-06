import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FoodListExample {
    public static void main(String[] args) {
        System.out.println("저장할 음식 이름 입력.(종료:0)");
        List<String> foods = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            String food = scanner.nextLine();
            if (food.equals("0")) {
                break;
            }
            if (foods.contains(food)) {
                System.out.println("이미 목록에 있습니다.");
            } else {
                foods.add(food);
            }
        }

        Collections.sort(foods); // 가나다순 오름차순
        Collections.reverse(foods); // 내림차순
        Collections.shuffle(foods); //랜덤하게 섞이는 것
        System.out.println("추천 메뉴 : " + foods.get(0));
    }
}
