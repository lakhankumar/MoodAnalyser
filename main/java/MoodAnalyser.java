public class MoodAnalyser {
    public String analyserMood(String message){
        if(message.toLowerCase().contains("sad")){
            return "SAD";
        }
        return "happy";
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        moodAnalyser.analyserMood("i am happy");
    }
}