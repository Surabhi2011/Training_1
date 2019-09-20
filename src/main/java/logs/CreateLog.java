package logs;

import org.apache.log4j.Logger;

public class CreateLog {
	Logger log;
	public void log(String testName,String message) {
		log=Logger.getLogger("devpinoyLogger");
		//log.info("=======================================================================================");
		log.info(testName+": " + message +" Run Successfully");
		//log.info("=======================================================================================");
		//log.info("=======================================================================================");
		
	}
}
