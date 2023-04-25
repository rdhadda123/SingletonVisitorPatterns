package SingletonVisitorPatterns.Part2.Parts.VisitInterface;

import SingletonVisitorPatterns.Part2.Parts.Computer;
import SingletonVisitorPatterns.Part2.Parts.Keyboard;
import SingletonVisitorPatterns.Part2.Parts.Monitor;
import SingletonVisitorPatterns.Part2.Parts.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
