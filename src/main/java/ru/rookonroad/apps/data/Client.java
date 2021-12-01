package ru.rookonroad.apps.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Client {
    private Integer id;
    private String name;
    private Date birthDate;
    private List<Client> clients;

    public Client() {
        this.clients = new ArrayList<>();
    }

    public Client(String name, Date birthDate) {
        this.id = new Random().nextInt();
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
