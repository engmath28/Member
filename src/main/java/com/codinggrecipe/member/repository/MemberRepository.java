package com.codinggrecipe.member.repository;

import com.codinggrecipe.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
}
