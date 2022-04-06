import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list =  new ArrayList<>();
        //List<Integer> list =  new ArrayList<Integer>(); // 동일한 방법이다.
        //ArrayList<Integer> list =  new ArrayList<>();
        list.add("치킨");
        list.add("피자");
        System.out.println(list);
        list.set(1, "우동");
        //list.remove("치킨");
        System.out.println(list);
        System.out.println(list.get(0));

        boolean containsChicken = list.contains("치킨");
        System.out.println(containsChicken);
    }
}
