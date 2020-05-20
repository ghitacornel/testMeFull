package root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import root.model.Person;
import root.service.PersonService;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    PersonService service;

    @GetMapping
    public List<Person> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Person findById(@PathVariable("id") String id) {
        return service.findById(id);
    }

    @PutMapping(value = "")
    public void create(@RequestBody Person person) {
        service.save(person);
    }

    @PatchMapping(value = "")
    public void update(@RequestBody Person person) {
        service.save(person);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable("id") String id) {
        service.deleteById(id);
    }
}
