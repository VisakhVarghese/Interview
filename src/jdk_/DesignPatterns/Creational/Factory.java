package jdk_.DesignPatterns.Creational;

public class Factory {
        public static Shape getShape(String shapeType) {
            if (shapeType.equalsIgnoreCase("CIRCLE")) {
                return new Circle();
            } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
                return new Rectangle();
            }
            return null;
        }
}





