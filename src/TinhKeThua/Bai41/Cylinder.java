package TinhKeThua.Bai41;

public class Cylinder extends Circle{

    private double height = 1.0;

    public Cylinder(){
    }

    public Cylinder(double radius){
        super(radius);
    }

    public Cylinder(double radius, double height){
        super.setRadius(radius);
    }

    public Cylinder(double radius, double height, String color) {
        super.setRadius(radius);
        super.setColor(color);
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public double getVolumn(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
