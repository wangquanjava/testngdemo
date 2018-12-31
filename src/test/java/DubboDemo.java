import com.git.domain.DemoEntity;
import com.git.service.DemoService;
import com.google.common.base.Stopwatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author wangquan07
 * 2018/12/31 14:06
 */
public class DubboDemo extends BaseTest {
    @Autowired
    private DemoService demoService;

    @Test
    public void testGet() {
        // 创建计时器
        Stopwatch stopwatch = Stopwatch.createStarted();
        // 开始请求
        DemoEntity demoEntity = demoService.get(1);
        // 计算耗时
        long cost = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        System.out.println("请求耗时:" + cost);
        Assert.assertTrue(cost < 100, "请求耗时必须小于100ms");
        Assert.assertNotNull(demoEntity);
        System.out.println(demoEntity.getId() + "---------------" + demoEntity.getStartDate());
    }

}
