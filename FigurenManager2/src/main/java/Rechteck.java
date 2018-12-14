public class Rechteck extends Figuren {

    int length;
    int width;
    int koordinaten;
    int area;

    public Rechteck() {
    }

    public Rechteck(int length, int width, int koordinaten) {
        this.length = length;
        this.width = width;
        this.koordinaten = koordinaten;
    }
    public int getKoordinaten() {
        return koordinaten;
    }

    public void setKoordinaten(int koordinaten) {
        this.koordinaten = koordinaten;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public double getCircumfence(int length, int width){
        double circumfence = (length + width) * 2;

        return circumfence;
    }
    public double getArea(int length, int width){
        double area = length * width;

        return area;
    }
    @Override
    public String output(){
        return "Reckteck mit Länge "+ length + " und Breite " + width + ": Fläche -> "+ getArea(length, width) + ", Umfang -> "+ getCircumfence(length, width) ;
    }
}
