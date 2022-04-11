package com.sushant.elasticsearch.repository;

import com.sushant.elasticsearch.model.Member;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.Optional;

public interface MemberRepository extends ElasticsearchRepository<Member, Integer> {
    Optional<Member> findByFirstName(String fistName);
}
