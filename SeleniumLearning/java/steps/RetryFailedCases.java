package steps;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedCases implements IRetryAnalyzer{

	public boolean retry(ITestResult result) {
		int count=0;
		if(count<1)
		{
			return true;
		}
		return false;
	}

}
