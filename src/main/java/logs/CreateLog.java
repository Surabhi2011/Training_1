package logs;

import org.apache.log4j.Logger;

public class CreateLog {
	Logger log;
	public void log(String methodName,String TestCase) {
		log=Logger.getLogger("devpinoyLogger");
		//log.info("=======================================================================================");
		log.info(methodName+": " + TestCase +" Run Successfully");
		//log.info("=======================================================================================");
		//log.info("=======================================================================================");
		
	}
}
