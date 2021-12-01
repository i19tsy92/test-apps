package ru.rookonroad.apps.test;

import ru.rookonroad.apps.data.Client;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StreamApi {

    private final List<Client> clients;

    {
        this.clients = new ArrayList<Client>() {{
            add(new Client("John", Date.valueOf(LocalDate.of(1990, 10,22))));
            add(new Client("Ivan", Date.valueOf(LocalDate.of(1988, 8,11))));
            add(new Client("Stepan", Date.valueOf(LocalDate.of(1981, 10,6))));
            add(new Client("Roman", Date.valueOf(LocalDate.of(1987, 11,22))));
            add(new Client("Ivan", Date.valueOf(LocalDate.of(1993, 10,10))));
            add(new Client("John", Date.valueOf(LocalDate.of(1987, 11,11))));
            add(new Client("John", Date.valueOf(LocalDate.of(1972, 9,27))));
        }};
    }

    /**
     * Метод должен вернуть все записи постранично (limit and skip)
     * @param page - номер страницы (начинается с 0)
     * @param size - размер страницы
     * @return
     */
    public List<Client> findAll(Integer page, Integer size) {
        // TODO реализовать метод
        return null;
    }

    /**
     * Метод должен вернуть все записи соотвествуюзие фильтру
     * @param name - имя клиента
     * @param from - дата рождения с
     * @param to - дата рождения до
     * @return отфильтрованный список
     */
    public List<Client> findAllWithFilter(String name, Date from, Date to) {
        // Пример:
        // clients.stream().filter(client -> client.getName().equals(name)).collect(Collectors.toList());
        // TODO реализовать метод
        return null;
    }

    /**
     * Метод должен возвращать клиент по идентификатору, если такого идентификатора нет - бросать exception
     * @param id - идентификатор клиента
     * @return одна запись
     */
    public Client findById(Integer id) {
        return null;
    }

    public Client create(Client client) {
        if (client.getId() != null) {
            throw new IllegalArgumentException();
        }
        //TODO реализовать генерацию идентификатора и добавление в список клиентов клиента, возвразать добавленного клиента с установленным id
        return null;
    }
}
