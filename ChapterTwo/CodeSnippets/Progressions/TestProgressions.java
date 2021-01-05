package JavaTextBook.ChapterTwo.CodeSnippets.Progressions;

public class TestProgressions {
    public static void main(String[] args){
        Progression myProgression1 = new Progression();
        myProgression1.printProgression(5);

        System.out.println("");

        ArithmeticProgression myProgression2 = new ArithmeticProgression(2);
        myProgression2.printProgression(5);

        System.out.println("");

        GeometricProgression myProgression3 = new GeometricProgression(3);
        myProgression3.printProgression(5);

        System.out.println("");

        FibonacciProgression myProgression4 = new FibonacciProgression();
        myProgression4.printProgression(10);

    }
    
}
