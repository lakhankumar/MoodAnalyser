
public class MoodAnalyser {
   private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyserMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        }
        return "HAPPY";
    }
}
