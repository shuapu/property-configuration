package com.app.service.impl;

import com.app.configs.CareerDetails;
import com.app.configs.PersonalDetails;
import com.app.model.PersonResponseDto;
import com.app.service.PersonService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class IPersonService implements PersonService {
   private PersonalDetails personalDetails;
   private CareerDetails careerDetails;

   @Override
   public PersonResponseDto getPerson(){
     return   PersonResponseDto.builder()
               .name(personalDetails.name())
               .age(personalDetails.age())
               .gender(personalDetails.gender())
               .designation(careerDetails.designation())
               .salary(careerDetails.salary())
               .build();

   }


}
