package lesson32.main.controller;

import lesson32.main.dto.PersonDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    private final List<PersonDto> persons = new ArrayList<>();

    @PostMapping("/persons")
    public String addPerson(@RequestBody PersonDto person) {
        persons.add(person);
        return person.getFirstName() + " " + person.getLastName() + " added successfully";
    }

    @GetMapping("/persons")
    public List<PersonDto> getPersons() {
        return persons;
    }

    @DeleteMapping("/persons{id}")
    public String deletePerson(@PathVariable Long id) {
        persons.removeIf(person -> person.getId().equals(id));
        return "Person deleted successfully";
    }

    @GetMapping("/persons{id}")
    public PersonDto retrievePerson(@PathVariable Long id) {
        return persons.stream().filter(person -> person.getId().equals(id)).findFirst().orElse(null);
    }

    @PutMapping("/persons{id}")
    public String updatePerson(@PathVariable Long id, @RequestBody PersonDto person) {
        PersonDto p = retrievePerson(id);
        if (p != null) {
            persons.add(person);
            return "Person updated successfully";
        } else {
            return "Person not found";
        }
    }
}
