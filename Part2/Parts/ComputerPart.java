package SingletonVisitorPatterns.Part2.Parts;

import SingletonVisitorPatterns.Part2.Parts.VisitInterface.ComputerPartVisitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
