package JavaTextBook.ChapterOne;
import java.util.ArrayList;

public class C1_4 {
    public void allSubstrings(ArrayList<String> characters, String currentWord){
        if(characters.size() == 1){
            System.out.println(currentWord + characters.get(0));
        }
        for(int i = 0; i < characters.size(); i++){
            String currentLetter = characters.get(i);
            currentWord += currentLetter;
            characters.remove(i);
            allSubstrings(characters, currentWord);
            characters.add(i, currentLetter);
            currentWord = currentWord.substring(0, currentWord.length() - 1);
        }
    }
}
