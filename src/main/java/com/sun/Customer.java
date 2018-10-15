package com.sun;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Customer implements Serializable {
    private List<Person> persons;
    private Map<String,Person> maps;
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Map<String, Person> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Person> maps) {
        this.maps = maps;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
