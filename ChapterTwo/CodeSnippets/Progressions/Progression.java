package JavaTextBook.ChapterTwo.CodeSnippets.Progressions;

public class Progression {
    protected long first; //first value
    protected long cur; //current value

    Progression(){  //default constructor
        cur = first = 0;
    }

    protected long firstValue(){ //reset progression to first value
        cur = first;
        return cur;
    }

    protected long nextValue(){
        return ++cur; //increment & return the next value of the progression
    }

    public void printProgression(int n){ //print first n numbers of the progression
        System.out.print(firstValue());
        for(int i = 1; i < n; i++){
            System.out.print(" " + this.nextValue()); //print and increment next values
        }
    }

}
