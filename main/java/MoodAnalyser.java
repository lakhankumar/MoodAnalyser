
public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyserMood() {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            }
            return "HAPPY";
        } catch (NullPointerException exception) {
            return "HAPPY";
        }
    }
}