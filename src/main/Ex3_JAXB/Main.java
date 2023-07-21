package main.Ex3_JAXB;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Catalog catal = new Catalog();
        catal.add(new Adress("Kyiv", "Khreshchatyk", 22));
        catal.add(new Adress("Cherkasy", "Vyshnevetsky", 34));


        try {
            // Створюємо файл
            File file = new File("C:\\Users\\User\\IdeaProjects\\MyProjectMaven\\src\\main\\Ex3_JAXB\\city.xml");
            // Викликаємо статичний метод JAXBContext
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            // Повертає об'єкт класу Marshaller, щоб трансформувати об'єкт
            Marshaller mar = jaxbContext.createMarshaller();

            // Читабельне форматування
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Записуємо у файл, marshal(з пам'яті, у файл)
            mar.marshal(catal, file);
            mar.marshal(catal, System.out);

            // Зчитуємо з файлу
            Unmarshaller unmar = jaxbContext.createUnmarshaller();
            catal = (Catalog) unmar.unmarshal(file);
            System.out.println(catal);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
