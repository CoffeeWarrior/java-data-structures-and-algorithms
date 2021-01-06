package JavaTextBook.ChapterTwo.CodeSnippets.Progressions;
import java.lang.*;

class C2_2 extends Progression{
    //first and cur are already definied in progression
    protected long difference;

    C2_2(){
        this(2, 200); //call the other constructor with 2 default values
    }

    C2_2(long first, long second){
        this.first = first;
        this.difference = Math.abs(first - second);
    }

    protected long nextValue(){
        cur += difference;
        return cur;
    }

}

