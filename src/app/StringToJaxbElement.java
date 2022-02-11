package app;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class StringToJaxbElement {
    public static void main(String[] args) {

        String text="This is a text";

        JAXBElement<Object> value;
        QName qName=new QName(String.class.getSimpleName());
        value=new JAXBElement(qName,String.class,text);
        System.out.println(value.getValue());

    }
}
