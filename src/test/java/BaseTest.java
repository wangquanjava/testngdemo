import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * @author wangquan07
 * 2018/12/31 14:06
 */
@ContextConfiguration(locations = {"classpath:applicationContext-consumer.xml"})
public class BaseTest  extends AbstractTestNGSpringContextTests {
}
