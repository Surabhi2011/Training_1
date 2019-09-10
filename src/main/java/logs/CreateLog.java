package logs;

import org.apache.log4j.Logger;

public class CreateLog {
	Logger log;
	public void log(String TestCase,String exp,String act) {
		log=Logger.getLogger("devpinoyLogger");
		log.info("=======================================================================================");
		log.info("Test case : " + TestCase );
		log.info("=======================================================================================");
		log.info("=======================================================================================");
		log.info("Expected Value :"+exp+"   Actual Value :"+act);
	}
}
