package TemplateConfig;

import javax.xml.transform.Templates;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

public class TemplateConfig {

    public Template template(Templates builder) {
        return builder.build();
    }
}
