import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        String[] days = {"월","화","수","목","금","토","일"};
        System.out.println(days);
        //배열의 내용물을 확인하는 방법
        System.out.println(Arrays.toString(days));
    }
}
