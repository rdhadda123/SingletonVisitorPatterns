package SingletonVisitorPatterns.Part2.Parts;

import SingletonVisitorPatterns.Part2.Parts.VisitInterface.ComputerPartVisitor;

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
