package com.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.news.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long>{

}
