package MultiThreading.Lambda.Debugging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task21 {
    // ✅ Use Task21.class instead of Task19.class
    private static final Logger logger = LogManager.getLogger(Task21.class);

    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int sum = x + y;

        logger.debug("x = {}", x);
        logger.debug("y = {}", y);
        logger.debug("sum = {}", sum);
    }
}
