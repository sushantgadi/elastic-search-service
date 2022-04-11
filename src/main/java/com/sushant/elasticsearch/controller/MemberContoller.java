package com.sushant.elasticsearch.controller;

import com.sushant.elasticsearch.model.Member;
import com.sushant.elasticsearch.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/member")
public class MemberContoller {

    @Autowired
    private MemberRepository memberRepository;

    @PostMapping
    private Iterable<Member> save(@RequestBody List<Member> members){
       return memberRepository.saveAll(members);
    }

    @GetMapping
    private Iterable<Member> findAll(){
        return  memberRepository.findAll();
    }

    @GetMapping("/{firstName}")
    private Optional<Member> findBy(@PathVariable String firstName){
        return memberRepository.findByFirstName(firstName);
    }
}
