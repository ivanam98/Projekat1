package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;

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
