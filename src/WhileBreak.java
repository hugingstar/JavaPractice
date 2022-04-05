public class WhileBreak {
    public static void main(String[] args) {
        for (int i = 0; i <10; i++){
            System.out.println("반복 " + i + " 시작");
            if (i == 3) {
                break;
            }
            System.out.println("반복 " + i + " 끝");
        }
    }
}
