package kata3;

public class Kata3 {

    public static void main(String[] args) {
        
        Histogram<String> histogram = new Histogram();
        
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("hotmail.com");
        
        HistogramDisplay histo = new HistogramDisplay("HISTOGRAM...", histogram);
        
        histo.execute();
    }
    
}
