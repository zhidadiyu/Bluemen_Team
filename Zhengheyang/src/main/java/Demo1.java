import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:09:54 <br/>
 * 
 * @author Zhengheyang
 * @version
 * @see
 */
// import org.apache.log4j.Logger;

public class Demo1 {

    private final static Logger LOG = LoggerFactory.getLogger(Demo1.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LOG.info("请输入：");
        try {
            String j = null;
            String i = scanner.next();
            if (j.equals(i)) {
                LOG.info(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}