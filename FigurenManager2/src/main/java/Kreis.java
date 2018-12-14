public class Kreis extends Figuren{

    int radius;
    int koordinaten;

    public Kreis() {
    }
    public Kreis(int radius, int koordinaten) {
        this.radius = radius;
        this.koordinaten = koordinaten;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getKoordinaten() {
        return koordinaten;
    }

    public void setKoordinaten(int koordinaten) {
        this.koordinaten = koordinaten;
    }
    public double getArea(int radius){
        double area = Math.PI * Math.pow(radius, 2);

        return area;
    }
    public double getCircumfence(int radius){
        double circumfence = 2 * radius * Math.PI;

        return circumfence;
    }
    public String output(){

        return "Kreis mit Radius "+ radius + ": Fläche -> "+ getArea(radius)+", Umfang -> " + getCircumfence(radius);
    }
}
