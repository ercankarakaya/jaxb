package model;

import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@ToString
@NoArgsConstructor
@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD) // It means use all fields.
public class User {

    private int id;
    private String name;
    private String username;
    private String password;
    private Job job;

    public User(int id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }


}
