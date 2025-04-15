package Maven_MKT.Mock_Interview_Maven;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClassPro implements IRetryAnalyzer{
	int current_Count=0;
	int retry_Count=1;
	@Override
	public boolean retry(ITestResult result) {
		if(current_Count<retry_Count)
		{
			current_Count++;
			return true;
		}
		return false;
	}

}
