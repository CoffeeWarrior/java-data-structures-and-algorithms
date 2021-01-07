package JavaTextBook.ChapterTwo.CodeSnippets.Progressions;

import java.lang.Math;

public class C2_3 extends Progression{
    long first;
    double cur;

    C2_3(){
        this(65536.0);
    }

    C2_3(double first){
        this.first = (long)first;
        this.cur = first;
    }
    
    protected long firstValue(){
        this.cur = this.first;
        return (long)this.first;
    }

    protected long nextValue(){
        cur = Math.sqrt(cur);
        return (long)cur;
    }
}
