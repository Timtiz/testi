import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Massiv {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        int n = sc.nextInt();
        double array[] = new double[n];
        for (int i = 0; i<n; i++){
            array[i] = sc.nextDouble();
        }
        Arrays.sort(array);
        int middle = array.length/2;
        double medianValue = 0;
        if (array.length%2 == 1)
            medianValue = array[middle];
        else
            medianValue = (array[middle-1] + array[middle]) / 2;
        System.out.println(medianValue);
    }
}
