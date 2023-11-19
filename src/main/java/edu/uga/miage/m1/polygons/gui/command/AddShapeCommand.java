package edu.uga.miage.m1.polygons.gui.command;

import java.util.List;

import edu.uga.miage.m1.polygons.gui.JDrawingFrame;
import edu.uga.miage.m1.polygons.gui.shapes.SimpleShape;

public class AddShapeCommand implements Command {

    private SimpleShape simpleShape;
    private List<SimpleShape> listOfShapes;
    private JDrawingFrame frame;

    public AddShapeCommand(SimpleShape simpleShape, List<SimpleShape> listOfShapes) {
        this.simpleShape = simpleShape;
        this.listOfShapes = listOfShapes;
    }

    @Override
    public void execute() {
        listOfShapes.add(simpleShape);
    }

    public void undoShape() {
        this.frame.undoShape();
    }
}
