package TinhKeThua.Bai41;

public class Circle {

    private double radius = 1.0;
    private  String color;

    public Circle(){
    }

    public Circle(double radius){
        if (radius <= 0) {
            throw new RuntimeException("Cạnh phải là số dương");
        }
        this.radius = radius;
    }

    public Circle(double radius, String color){
        if (radius <= 0) {
            throw new RuntimeException("Cạnh phải là số dương");
        }
        this.color = color;
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }



    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public double getArea(){
//        double area = Math.PI*Math.pow(radius,2);
        double area = Math.PI*(radius * radius);
        return area;
    }

}
