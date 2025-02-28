import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Cat {
    public static void main(String[] args) {

        if (args.length > 0) {

            try {

                File file = new File(args[0]);
                FileReader fR = new FileReader(file);
                BufferedReader reader = new BufferedReader(fR);

                String line;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("No argument passed");
        }
    }
}
