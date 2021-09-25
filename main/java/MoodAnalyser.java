
public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyserMood() {
        try {
            if (message.length() == 0) {
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,
                        "Enter Proper Message. EMPTY Not Allowed");
            }
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            }
            return "HAPPY";
        } catch (NullPointerException exception) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,
                    "Enter Proper Message. NULL Not Allowed");
        }
    }
}