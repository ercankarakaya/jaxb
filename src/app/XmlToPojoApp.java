package app;

import model.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlToPojoApp {
    public static void main(String[] args) {

        try {
            JAXBContext jaxbContext=JAXBContext.newInstance(User.class);
            String path=System.getProperty("user.dir");
            File file = new File(path+"\\data.xml");
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            User user = (User) unmarshaller.unmarshal(file);
            System.out.println(user + "\n" + user.getJob());
            System.out.println(System.getProperty("user.dir"));

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
