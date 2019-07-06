package demo.strategy;

import com.demo.strategy.Duck;
import com.demo.strategy.FlyWithWings;
import com.demo.strategy.MallardDuck;
import com.demo.strategy.QuackMute;
import org.junit.Test;

/**
 * @author zhouwq
 * @date 2019/5/30 18:30
 */

public class DuckTest {

    @Test
    public void testDuck(){
        Duck mallard = new MallardDuck();
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.setQuackBehavior(new QuackMute());
        mallard.performFly();
        mallard.performQuack();
    }
}
