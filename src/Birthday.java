public class Birthday {
    public static void main(String[] args) {
        String birthday = "1970/01/01";
        String year = birthday.substring(0, 4);
        String day = birthday.substring(8);

        System.out.println(year);
        System.out.println(day);
    }
}
