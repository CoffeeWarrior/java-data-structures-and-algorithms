package JavaTextBook.ChapterTwo.CodeSnippets.Progressions;

class ArithmeticProgression extends Progression{
    protected long inc; //increment

    //inherits variables first and cur
    
    ArithmeticProgression(){
        this(1);
    }

    ArithmeticProgression(long increment){
        inc = increment;
    }

    protected long nextValue(){ //increments by the specified increment instead of the super classes nextValue function
        cur += inc;
        return cur;
    }

    // the firstValue() and printProgression(int) are inherited

    //becausee printProgression uses nextValue(), and nextValue is overwritten, it uses the overwritten version instead of the one defined in the original class.
}
