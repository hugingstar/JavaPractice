public class ThreadSleep {
    public static void main(String[] args) {
        System.out.println("지금 무슨 생각을 하고 있는지 맞춰볼께요.");

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("치킨!");
    }
}
