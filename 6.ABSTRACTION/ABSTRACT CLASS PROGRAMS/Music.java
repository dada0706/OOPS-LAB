abstract class MusicalInstrument {
    abstract void play();
    abstract void tune();
    void commonFeature() {
        System.out.println("All instruments produce sound.");
    }
}
class Piano extends MusicalInstrument {
    void play() {
        System.out.println("Playing the piano.");
    }
    void tune() {
        System.out.println("Tuning the piano.");
    }
   public class Music{
    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.commonFeature();
        piano.tune();
        piano.play();
    }
}
