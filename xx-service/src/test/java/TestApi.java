import com.xx.utils.ApiUtil;
import org.junit.Test;

public class TestApi {

    @Test
    public void test() {
        // Run "mvn test" in console or click the "test" btn in IntelliJ IDEA Maven panel to run this test.
        String result = ApiUtil.requestApi("Mock Params");
        System.out.println(result);
    }

}
