package SingletonVisitorPatterns.Part2.Parts;

import SingletonVisitorPatterns.Part2.Parts.VisitInterface.ComputerPartVisitor;

public class Mouse implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
    
}
