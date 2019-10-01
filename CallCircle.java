public class CallCircle {
    public static void main(String[] args) {
        Circle cc = new Circle(58.75);
        System.out.print("Raduis: "+cc.getRadius());
        System.out.print("Area: "+ Math.floor(cc.computeArea()));
        System.out.print("Circumference: "+cc.computeCircumference());
        System.out.print("Diameter: "+cc.computeDiameter());
    }
}
