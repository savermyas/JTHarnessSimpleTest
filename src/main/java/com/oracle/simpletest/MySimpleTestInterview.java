package com.oracle.simpletest;

import com.sun.interview.FinalQuestion;
import com.sun.interview.Interview;
import com.sun.tck.j2me.interview.MidpTckBaseInterview;
import com.sun.tck.j2me.interview.lib.Exporters;
import com.sun.tck.j2me.interview.lib.StringQuestion;

public class MySimpleTestInterview extends Interview {

	protected MySimpleTestInterview(MidpTckBaseInterview parent, String baseTag) throws Fault {
		super(parent, baseTag);
		// TODO Auto-generated constructor stub
		init();
	}
	
	protected MySimpleTestInterview(String baseTag) throws Fault {
		super(baseTag);
		// TODO Auto-generated constructor stub
		init();
	}
	
	private void init() throws Fault {
        setResourceBundle("i18n");
        //setHelpSet("help/TemplateTestInterview");
        setHelpSet(MySimpleTestInterview.class.getResource("help/MySimpleTestInterview").toString());
        first.setExporter(
                Exporters.getStringValueExporter("exampleProperty.value"));
        setFirstQuestion(first);
        first.linkTo(end);
    }

    private StringQuestion first = new StringQuestion(this, "exampleProperty");
    private final FinalQuestion end = new FinalQuestion(this, "end");

}
