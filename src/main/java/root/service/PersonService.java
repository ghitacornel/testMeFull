package root.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.model.Person;
import root.repository.PersonRepository;

import java.util.*;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public List<Person> findAll() {
        return repository.findAll();
    }

    public Person findById(String id) {
        return repository.findById(id).get();
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

    public void save(Person person) {
        repository.save(person);
    }

}
