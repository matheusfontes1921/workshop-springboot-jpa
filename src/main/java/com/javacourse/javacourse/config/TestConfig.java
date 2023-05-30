package com.javacourse.javacourse.config;


import com.javacourse.javacourse.entities.User;
import com.javacourse.javacourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired /*spring resolve essa dependencia*/
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Maria","maria@gmail.com","9888888","1921");
        User u2 = new User(null,"Gabriel","gabriel@gmail.com","9888888","1921");
        userRepository.saveAll(Arrays.asList(u1,u2)); //operação assim feita pq o saveall necessita de uma lista pra salvar no bd
    }
}
