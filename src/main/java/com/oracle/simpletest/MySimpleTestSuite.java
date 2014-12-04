package com.oracle.simpletest;

import java.io.File;
import java.util.Map;

import com.sun.javatest.InterviewParameters;
import com.sun.javatest.util.I18NResourceBundle;
import com.sun.tck.j2me.interview.BasicTckInterview;
import com.sun.tck.j2me.interview.VmInterview;
import com.sun.tck.j2me.javatest.J2meBaseTestSuite;

public class MySimpleTestSuite extends J2meBaseTestSuite {

	public MySimpleTestSuite(File root, Map tsInfo, ClassLoader cl)
			throws Fault {
		super(root, tsInfo, cl);
		// TODO Auto-generated constructor stub
	}

	 public InterviewParameters createInterview() throws Fault {
	    	String mode = getTestSuiteInfo("interview.mode");
	    	InterviewParameters result = null;
	    	try {
	    		
	    		result = BasicTckInterview.createBuilder(this)
//	    		.setImpAware(false)
	                .setSubInterview("com.oracle.simpletest.MySimpleTestInterview")
	                .setDistributed(true)
//	                .setBundleSizeLimit(100000)
//	                .setKeywordsEnabled(true)
//	                .setEnableSeparatorQuestion(true)
//	                .setImplemetationBaseChoices(new String[] {VmInterview.MIDP})
	                .build();
	        } catch (com.sun.interview.Interview.Fault fault) {
	            fault.printStackTrace();
	            throw new com.sun.javatest.TestSuite.Fault(i18n,
	                    "ts.errorInitInterview", fault.getMessage());
	        }
	    	return result;
	    }	
	 
	 private static final I18NResourceBundle i18n =
		        I18NResourceBundle.getBundleForClass(MySimpleTestSuite.class);
}
