public class Quadrat extends Figuren {

    int length;
    int koordinaten;

    public Quadrat() {
    }
    public Quadrat(int length, int koordinaten) {
        this.length = length;
        this.koordinaten = koordinaten;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getKoordinaten() {
        return koordinaten;
    }
    public void setKoordinaten(int koordinaten) {
        this.koordinaten = koordinaten;
    }
    public double getCircumfence(int length){
        int circumfence = length * 4;

        return circumfence;
    }
    public double getArea(int length){
        double area = Math.pow(length, 2);

        return area;
    }
    public String output(){

        return "Quadrat mit Seitenlänge "+ length +": Fläche -> "+ getArea(length)+", Umfang -> "+ getCircumfence(length);
    }

}
