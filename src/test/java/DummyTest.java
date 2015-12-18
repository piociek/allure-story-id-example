import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Issue;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;

import static org.testng.Assert.assertTrue;

public class DummyTest {
    @Stories(value = {"story1", "story2"}, id = "12")
    @TestCaseId("123")
    @Test
    public void simpleTestWithStoryAndId(){
        assertTrue(true);
    }

    @Stories({"story1", "story3"})
    @TestCaseId("124")
    @Test
    public void simpleTestWithStoryWithoutId(){
        assertTrue(true);
    }

    @Issue("321")
    @Test
    public void simpleTestWithoutStory(){
        assertTrue(true);
    }
}
