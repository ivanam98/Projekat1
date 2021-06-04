package com.projekat.Projekat1.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.projekat.Projekat1.entity.Member;
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

	Member findByUsername(String username);

}
