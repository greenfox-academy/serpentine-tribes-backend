package com.greenfox.tribesoflagopus.backend.repository;

import com.greenfox.tribesoflagopus.backend.model.entity.User;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  boolean existsByUsername(String username);

  @Transactional
  void deleteByUsername(String username);

  User findByUsername(String username);

  User findByToken (String token);
}