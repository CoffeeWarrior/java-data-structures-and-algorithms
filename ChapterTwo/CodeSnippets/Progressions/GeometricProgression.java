package JavaTextBook.ChapterTwo.CodeSnippets.Progressions;

public class GeometricProgression extends Progression {
    protected long base;
    // inherits variables first and cur

    //default constructor sets base as 2

    GeometricProgression(){
        this(2);
    }

    GeometricProgression(long b){
        base = b;
        first = 1;
        cur = first;
    }

    protected long nextValue(){
        cur *= base;
        return cur;
    }

    // inherits methods firstValue() and printProgression(int)
}
