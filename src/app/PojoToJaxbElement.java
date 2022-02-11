package app;

import model.Job;
import model.User;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PojoToJaxbElement {
    public static void main(String[] args) {

        User user = new User(1,"Ercan","ercankarakaya","4321");
        Job job = new Job("Computer Engineer", "Engineer");
        user.setJob(job);

        JAXBElement<Object> value;
        QName qName=new QName(User.class.getSimpleName());
        value=new JAXBElement(qName,User.class,user);
        System.out.println(value.getValue());

    }
}
