package main.Ex5_JSON;

import java.io.IOException;
import java.time.Instant;

public class Main {
    public static void main(String[] args) throws IOException {
      JacksonParser.parseJson("https://api.monobank.ua/bank/currency");
//        long unixTime = 1665083712;
//        Instant instant = Instant.ofEpochSecond(unixTime);
//        System.out.println(instant);
    }
}
