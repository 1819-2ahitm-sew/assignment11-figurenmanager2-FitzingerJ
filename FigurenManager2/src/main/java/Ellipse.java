public class Ellipse extends Figuren {

    int hauptachse;
    int nebenachse;

    public Ellipse() {
    }
    public Ellipse(int hauptachse, int nebenachse) {
        this.hauptachse = hauptachse;
        this.nebenachse = nebenachse;
    }
    public int getHauptachse() {
        return hauptachse;
    }

    public void setHauptachse(int hauptachse) {
        this.hauptachse = hauptachse;
    }

    public int getNebenachse() {
        return nebenachse;
    }

    public void setNebenachse(int nebenachse) {
        this.nebenachse = nebenachse;
    }
    public double area(int nebenachse, int hauptachse){

        return 1;
    }
    public String output(){

        return null;
    }
}
