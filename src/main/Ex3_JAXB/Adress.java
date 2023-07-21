package main.Ex3_JAXB;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "book")
    public class Adress {

        private String city;
        private String street;
        private int bild;


        public Adress() {
        }

        public Adress(String city, String street, int bild) {
            this.city = city;
            this.street = street;
            this.bild = bild;

        }

        @Override
        public String toString() {
            return "[" + city + ", " + street + ", " + bild + "]";
        }

    public String getCity() {
        return city;
    }
    @XmlElement
    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }
    @XmlElement
    public void setStreet(String street) {
        this.street = street;
    }

    public int getBild() {
        return bild;
    }
    @XmlElement
    public void setBild(int bild) {
        this.bild = bild;
    }
}

