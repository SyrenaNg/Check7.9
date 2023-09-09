package Baitap;
public class Rectangle {
    private  double width;
    private double height;
    public Rectangle() {};
    public Rectangle(double w,double h) {
        this.width = w;
        this.height = h;
    }
    public double getArea() {
        double dt = this.width * this.height;
        return dt;
    }
    public double getPerimeter() {
        double cv = (this.width + this.height) * 2;
        return cv;
    }
    public String display() {
        return "w" + this.width + "-" + "h" + this.height;
    }
}
