import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenSadMood_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("i am sad");
        String result = moodAnalyser.analyserMood();
        Assert.assertEquals("SAD", result);
    }

    @Test
    public void givenAnyMood_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("i am happy");
        String result = moodAnalyser.analyserMood();
        Assert.assertEquals("HAPPY", result);
    }

    @Test
    public void  givenMessage_WhenNull_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String result = moodAnalyser.analyserMood();
        Assert.assertEquals("HAPPY", result);
    }
}
