package com.example.cholongtest.service;
import com.example.cholongtest.entity.Membership;

public interface MembershipService {
    public void register(Membership membership) throws Exception;
    public void login(Membership membership) throws Exception;
}
