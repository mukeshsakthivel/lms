package com.lmsProject.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lmsProject.model.Member;


public interface MemberRepository extends JpaRepository<Member, Long> {

}
