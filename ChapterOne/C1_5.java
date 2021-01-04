package JavaTextBook.ChapterOne;

import java.util.Scanner;
import java.util.ArrayList;
public class C1_5 {
    public void run(){
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        ArrayList<String> lines = new ArrayList();
        while(inputStream.hasNextLine()){
            lines.add(inputStream.nextLine());
        }
        inputStream.close();

    }
    
}
