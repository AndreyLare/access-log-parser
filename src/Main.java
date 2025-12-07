import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        while (true){
            System.out.println("Введите путь к файлу (или '0' для выхода): ");
            String path = new Scanner(System.in).nextLine();

            File file = new File(path);

            boolean fileExist = file.exists();
            boolean isDirectory = file.isDirectory();

            if (path.equalsIgnoreCase("0")) {
                break;
            }
            if (!fileExist) {
                System.out.println("файл не существует или указанный путь является путём к папке, а не к файлу");
                continue;
            }
            if (!isDirectory && fileExist) {
                System.out.println("Путь указан верно");
                result ++;
                System.out.println("Это файл номер " + result);
            }
        }
    }
}