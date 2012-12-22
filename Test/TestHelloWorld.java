import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 12-12-16
 * Time: 下午11:10
 * To change this template use File | Settings | File Templates.
 */
public class TestHelloWorld {
    HelloWorld hw;

    @Before()
    public void setUp(){
        hw = new HelloWorld();
    }

    @Test()
    public void should_print_hello_world(){
        assertThat(hw.test1(),is("Hello World!"));
    }
}
