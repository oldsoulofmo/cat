import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Cat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        if (args.length > 0) {
            try {
                File file = new File(args[0]);
                FileReader fR = new FileReader(file);
                BufferedReader reader = new BufferedReader(fR);

                String line;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                reader.close();
            } catch (IOException e) {
                e.getMessage();
            }

        }
    }
}
