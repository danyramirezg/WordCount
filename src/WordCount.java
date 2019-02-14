
import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws Exception{

        File file = new File ("ShakespeareBook.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;
        while(scanner.hasNextLine()){
            String Line= scanner.nextLine();
            words += Line.split("").length;


        }
System.out.println("The file contains: "+ words+ " words");
    }


    }

