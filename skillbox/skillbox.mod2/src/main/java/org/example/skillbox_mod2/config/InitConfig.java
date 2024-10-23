package org.example.skillbox_mod2.config;

import org.example.skillbox_mod2.domain.UserStorage;
import org.example.skillbox_mod2.util.UserParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("init")
public class InitConfig {
    @Autowired
    UserParser userParser;

    @Bean
    public UserStorage userStorage(){
        return new UserStorage(userParser.parseInitFile());
    }

}
