public class ArrayGet {
    public static void main(String[] args) {
        String[] days = {"월","화","수","목","금","토","일"};
        System.out.println(days[0]);
        System.out.println(days[6]);
        int lengthOfDays = days.length;
        System.out.println(lengthOfDays);

        // 값을 변경하려면
//        days[0] = "일";

        // 각 요일을 간단히 출력할 수 있다.
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + "요일");
        }
        // for 문을 돌리는 다를 형식
        for (String day : days) {
            System.out.println(day + "요일");
        }
    }
}
