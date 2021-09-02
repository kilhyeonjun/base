package com.hjkill.spring.base.common.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JpaUserService {
    @Autowired
    private JpaUserRepository jpaUserRepository;

    public JpaUser signup(JpaUser jpaUser){
        return jpaUserRepository.save(jpaUser);
    }
}
