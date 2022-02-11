package app;

import model.Job;
import model.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class PojoToXml {
    public static void main(String[] args) {

        User user = new User(1,"Ercan","ercankarakaya","4321");
        Job job = new Job("Computer Engineer", "Engineer");
        user.setJob(job);

        try {
            JAXBContext jaxbContext=JAXBContext.newInstance(User.class);
            Marshaller marshaller= jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);//çıktının formatlı olması için.
            marshaller.marshal(user,System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }


    }
}
