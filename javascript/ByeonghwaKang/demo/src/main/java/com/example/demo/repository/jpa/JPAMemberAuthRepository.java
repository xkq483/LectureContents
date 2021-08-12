package com.example.demo.repository.jpa;

import com.example.demo.entity.jpa.MemberAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface JPAMemberAuthRepository extends JpaRepository<MemberAuth, Long> {
}