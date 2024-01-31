import java.io.FileInputStream;
import java.util.Scanner;
import java.io.PrintWriter;

public class FileInputOutput {

    public static void main(String[] args) {
//       1) Open the given file inside src called moviesDataSet.csv
        PrintWriter fileWriter;
        FileInputStream myFile = null;
        try {
            myFile = new FileInputStream("src/moviesDataset.csv");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        Scanner fileReader = new Scanner(myFile);
        while (fileReader.hasNextLine()) {
            String data = fileReader.nextLine();
            String[] arr = data.split(",");
//            System.out.print(arr[2] + " ");
//            System.out.println(arr[4]);
            fileWriter = new PrintWriter(myFile);
            fileWriter.println(arr[4]);
        }
        myFile.close();
        fileWriter.close();

//       2) Read each row in the dataset


//       3) Print each row to the screen
//       4) Print only the name of the movie
//       5) Add exception handling (try & catch) when needed
//       6) Close the files after finishing the processing
//       7) Commit your code and push it to the GitHub

    }
}