package com.github.mesimpletest.testsuite;

import com.sun.interview.FinalQuestion;
import com.sun.interview.Interview;
import com.sun.tck.j2me.interview.MidpTckBaseInterview;
import com.sun.tck.j2me.interview.lib.StringQuestion;

public class MySimpleTestInterview extends Interview {

	public MySimpleTestInterview(MidpTckBaseInterview parent)
            throws Fault {
        super(parent, "ams");
        init();
    }
	
	private void init() throws Fault {
        setResourceBundle("i18n");
        setHelpSet("help/MySimpleTestInterview");
        //System.out.println(MySimpleTestInterview.class.getResource("help/MySimpleTestInterview").toString());
        //setHelpSet(MySimpleTestInterview.class.getResource("help/MySimpleTestInterview").toString());
        //System.out.println(getHelpSet());
        //first.setExporter(Exporters.getStringValueExporter("exampleProperty.value"));
        setFirstQuestion(first);
        first.linkTo(end);
    }

    private StringQuestion first = new StringQuestion(this, "exampleProperty");
    private final FinalQuestion end = new FinalQuestion(this, "end");

}
