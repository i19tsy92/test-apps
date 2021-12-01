package ru.rookonroad.apps;

import org.junit.jupiter.api.Assertions;
import ru.rookonroad.apps.data.Client;
import ru.rookonroad.apps.test.StreamApi;

import java.sql.Date;
import java.time.LocalDate;

public class Main {

    // При запуске тестируются методы StreamApi
    // Добавить по аналогии методы тестирования для findAllWithFilter
    public static void main(String ... args) {
        StreamApi streamApi = new StreamApi();
        Assertions.assertEquals(0, streamApi.findAll(0, 0).size());
        Assertions.assertEquals(3, streamApi.findAll(0, 3).size());
        Assertions.assertEquals(3, streamApi.findAll(1, 3).size());
        Client client =  new Client();
        client.setName("Petr");
        client.setBirthDate(Date.valueOf(LocalDate.of(1992, 11, 29)));
        client = streamApi.create(client);
        Assertions.assertEquals(client, streamApi.findById(client.getId()));
    }
}
