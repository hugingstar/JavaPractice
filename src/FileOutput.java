import java.io.FileWriter;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/output01.txt"); //True 옵션을 넣으면 덮어쓰기가 아니라 뒤에 추가로 입력한다.
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            System.exit(1);
        }

        try {
            writer.write("치킨은 살 안 쪄요.\n");
            writer.write("두번째줄이다.");
            writer.close();
        } catch (IOException e) {
            System.out.println("파일에 데이터를 쓰는 데에 실패했습니다.");
            System.exit(2);
        }
    }
}
