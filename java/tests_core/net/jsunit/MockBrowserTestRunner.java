package net.jsunit;

import java.util.Arrays;
import java.util.List;

import net.jsunit.model.BrowserResult;

import org.jdom.Element;

public class MockBrowserTestRunner implements BrowserTestRunner {

	public boolean disposeCalled;
    public BrowserResult acceptedResult;
    public BrowserResult resultToReturn;
    public boolean shouldSucceed;
    public String idPassed;
	public int timeoutSeconds;
	public boolean hasReceivedResult;
    
	public void startTestRun() {
	}

	public void finishTestRun() {
	}

	public long launchTestRunForBrowserWithFileName(String browserFileName) {
		return 0;
	}

	public void accept(BrowserResult result) {
        this.acceptedResult = result;
	}

	public boolean hasReceivedResultSince(long launchTime) {
		return hasReceivedResult;
	}

	public BrowserResult lastResult() {
        return new BrowserResult() {
            public int failureCount() {
                return shouldSucceed ? 0 : 1;
            }
        };
	}

	public void dispose() {
		disposeCalled = true;
	}

    public BrowserResult findResultWithId(String id) {
        idPassed = id;
        return resultToReturn;
    }

	public void logStatus(String message) {
	}

	public List<String> getBrowserFileNames() {
        return Arrays.asList(new String[] {"mybrowser.exe"});
	}

	public int timeoutSeconds() {
		return 0;
	}

	public Element asXml() {
		return null;
	}

	public boolean isAlive() {
		return true;
	}

}