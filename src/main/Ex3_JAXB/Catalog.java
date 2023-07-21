package main.Ex3_JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@XmlRootElement(name = "catalog")
public class Catalog {

    @XmlElement(name = "adress")
    private List<Adress> adresses= new ArrayList<>();

    public void add(Adress adress) {
       adresses.add(adress);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(adresses.toArray());
    }

}
