import com.git.domain.DemoEntity;
import com.git.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author wangquan07
 * 2018/12/31 14:06
 */
public class DubboDemo extends BaseTest {
    @Autowired
    private DemoService demoService;

    @Test
    public void testGet() {
        DemoEntity demoEntity = demoService.get(1);
        Assert.assertNotNull(demoEntity);
        System.out.println(demoEntity.getId() + "---------------" + demoEntity.getStartDate());
    }

}
