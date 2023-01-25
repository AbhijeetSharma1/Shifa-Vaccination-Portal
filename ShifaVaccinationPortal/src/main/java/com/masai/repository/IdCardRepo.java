package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.IdCard;

@Repository
public interface IdCardRepo extends JpaRepository<IdCard, Integer>{
//	public IdCard findBymemberUserName(String memberUserName);
}