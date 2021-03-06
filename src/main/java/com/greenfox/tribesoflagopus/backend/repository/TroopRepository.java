package com.greenfox.tribesoflagopus.backend.repository;

import com.greenfox.tribesoflagopus.backend.model.entity.Troop;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TroopRepository extends CrudRepository<Troop, Long> {

  boolean existsByIdAndKingdomUserId(Long id, Long userId);

  List<Troop> findAllByKingdomUserId(Long userId);

  Troop findOneByIdAndKingdomUserId(Long id, Long userId);

  boolean existsByKingdomUserId(Long userId);

  boolean existsByKingdomUserUsername(String username);
}
