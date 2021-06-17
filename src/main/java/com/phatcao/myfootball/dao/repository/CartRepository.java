package com.phatcao.myfootball.dao.repository;

import com.phatcao.myfootball.dao.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepository extends JpaRepository<CardEntity, String>
{
}
