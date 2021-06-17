package com.phatcao.myfootball.dao.repository;

import com.phatcao.myfootball.dao.entity.ScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ScoreRepository extends JpaRepository<ScoreEntity , Long >
{

}