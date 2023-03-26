import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        BonusTest.class,
        BowlingGameTest.class,
        FrameFactoryTest.class,
        NormalTest.class,
        SpareTest.class,
        StrikeTest.class
})
public class TestSuite {
}
