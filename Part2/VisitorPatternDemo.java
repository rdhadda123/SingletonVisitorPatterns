package SingletonVisitorPatterns.Part2;

import SingletonVisitorPatterns.Part2.Parts.Computer;
import SingletonVisitorPatterns.Part2.Parts.VisitInterface.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
