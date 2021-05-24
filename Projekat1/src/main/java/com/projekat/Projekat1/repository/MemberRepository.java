package com.projekat.Projekat1.repository;

import org.springframework.stereotype.Repository;

import com.projekat.Projekat1.entity.Member;

@Repository
public interface MemberRepository {
	
	Member findByUsername(String username);

}
