package com.javanibble.maven.examples.mapstruct.mappers;

import com.javanibble.maven.examples.mapstruct.domain.Person;
import com.javanibble.maven.examples.mapstruct.model.PersonCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonCommand personToPersonCommand(Person person);

    Person personCommandToPerson(PersonCommand personCommand);

}
