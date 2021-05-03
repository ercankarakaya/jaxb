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
@XmlAccessorType(XmlAccessType.FIELD)
public class Job {

    private String name;
    private String departmen;

    public Job(String name, String departmen) {
        this.name = name;
        this.departmen = departmen;
    }


}
