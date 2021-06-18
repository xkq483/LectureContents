package com.example.firstproject.service;

import com.example.firstproject.entity.Board;
import org.springframework.stereotype.Service;


public interface BoardService {
    public void register(Board board) throws Exception;
}
