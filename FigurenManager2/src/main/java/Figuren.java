abstract public class Figuren {

    static Rechteck rechteck = new Rechteck(5, 4 , 3);
    static Quadrat quadrat = new Quadrat(4, 2);
    static Kreis kreis = new Kreis(5, 2);

    static String[] figures = new String[]{
            rechteck.output(),
            quadrat.output(),
            kreis.output(),
    };


    abstract public String output();
}
