package main.persons.controller;

import main.persons.dto.PersonDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
    private final List<PersonDto> personList = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong();

    @PostMapping
    public String addPerson(@RequestBody PersonDto person) {
        person.setId(idCounter.incrementAndGet());
        personList.add(person);
        return person.getFirstName() + " " + person.getLastName() + " added successfully";
    }

    @GetMapping
    public List<PersonDto> getPersons() {
        return personList;
    }

    @GetMapping("/{id}")
    public PersonDto retrievePerson(@PathVariable Long id) {
        return personList.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public String deletePerson(@PathVariable Long id) {
        PersonDto personToDelete = retrievePerson(id);
        if (personToDelete != null) {
            personList.remove(personToDelete);
            return personToDelete.getFirstName() + " " + personToDelete.getLastName() + " deleted successfully";
        } else {
            return "Person with id " + id + " not found";
        }
    }

    @PutMapping("/{id}")
    public String updatePerson(@PathVariable Long id, @RequestBody PersonDto personDto) {
        PersonDto existingPerson = retrievePerson(id);
        if (existingPerson != null) {
            existingPerson.setFirstName(personDto.getFirstName());
            existingPerson.setLastName(personDto.getLastName());
            existingPerson.setAge(personDto.getAge());
            return existingPerson.getFirstName() + " " + existingPerson.getLastName() + " updated successfully";
        }
        return "Person with id " + id + " not found";
    }
}
