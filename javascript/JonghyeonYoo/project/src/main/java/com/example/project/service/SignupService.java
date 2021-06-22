package com.example.project.service;

import com.example.project.entity.Signup;
import org.springframework.stereotype.Service;

public interface SignupService {
    public void register(Signup signup) throws Exception;
}
