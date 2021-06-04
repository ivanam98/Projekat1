package com.projekat.Projekat1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projekat.Projekat1.entity.Member;
import com.projekat.Projekat1.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired 
	private MemberRepository memberRepository;
	
	public void create(Member member) throws Exception {
		
        if(member.getId() != null){
            throw new Exception("Id mora biti null.");
        }
        this.memberRepository.save(member);

    }
	
	public Member findByUsername(String username) {
        return this.memberRepository.findByUsername(username);
	}
}
