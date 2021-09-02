package com.hjkill.spring.base.common.jpa;

import org.springframework.data.repository.CrudRepository;

public interface JpaUserRepository extends CrudRepository<JpaUser, Long> {
}
