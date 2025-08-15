package com.app.resource;

import com.app.model.PersonResponseDto;
import com.app.service.PersonService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app/v1/person")
@Slf4j
@AllArgsConstructor
public class PersonController {

    private PersonService personService;

    @GetMapping("/get")
    public ResponseEntity<PersonResponseDto> getPerson() {
        log.info("Get Person - Start");
        PersonResponseDto person = personService.getPerson();
        log.info("Get Person - End");
        return ResponseEntity.ok(person);
    }

}
