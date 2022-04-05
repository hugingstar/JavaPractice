public class LENEXAMPLE {
    public static void main(String[] args) {
        String me = "살은 내가 쪄요.";
        System.out.println(me);
        int chlen = me.length();
        System.out.println("길이 : " + chlen);

        String replaced = me.replaceAll("내가","치킨이");
        System.out.println(replaced);

    }
}
