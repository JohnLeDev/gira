package com.anlecybersoft.gira.role.repository;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.anlecybersoft.gira.role.model.GiraRole;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GiraRoleRepositoryTest {
    
    @Autowired
    private GiraRoleRepository repository;

    @Test
    public void shouldNotInsertRole(){
       GiraRole role = GiraRole.builder().code("fouah").description("description").build();

       assertDoesNotThrow( () -> repository.save(role));
    }
}
