import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {

    MoodAnalyser moodAnalyser = null;

    @Before
    public void setUp(){
        moodAnalyser = new MoodAnalyser();
    }

    @Test
    public void givenSadMood_ShouldReturnSad(){
        String result = moodAnalyser.analyserMood("i am sad");
        Assert.assertEquals("SAD",result);
    }

    @Test
    public void givenAnyMood_ShouldReturnHappy(){
        String result = moodAnalyser.analyserMood("i am in any mood");
        Assert.assertEquals("HAPPY",result);
    }
}
