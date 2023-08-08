import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cvetochki {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("inputcv.txt"));
        int k = sc.nextInt();
            k <= 1000;
            String x = "V";
            String y = "C";
            String z = "G";
            String b = "bufer";
            for (int i = 0; i < k; i++) {
                b = y;
                y = x;
                x = b;
                b = x;
                y = z;
                z = b;
            }

            String re = x+y+z;
            System.out.print(re);
            FileWriter writer = new FileWriter("output.txt");
            writer.write(re);
            writer.close();

        }
}
