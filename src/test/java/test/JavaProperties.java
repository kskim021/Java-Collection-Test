package test;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaProperties {

    @Test
    public void javaPropertiesTest() {
        Properties properties = new Properties();

        properties.setProperty("email", "kskim@kskim.com");
        properties.setProperty("name", "kskim");
        properties.setProperty("phone", "01000000000");
        properties.put("id", "id");

        Iterator iterator = properties.keySet().iterator();

        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            String value = properties.getProperty(key);
            System.out.println(key + " : " + value);
        }

        Stream stream = properties.keySet().stream();

        List<String> list = (List<String>) stream.filter(item -> item.equals("id")).collect(Collectors.toList());

        System.out.println(list.get(0));
    }

    @Test
    public void propertiesFile() {
        Properties properties = new Properties();

        try (FileReader fileReader = new FileReader("data/props.properties")) {
            properties.load(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void propertiesClass() {
        Class aClass = Properties.class;

        InputStream inputStream = aClass.getResourceAsStream("/data/prop.properties");
        Properties properties = new Properties();

        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
