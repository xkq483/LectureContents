package com.example.jsmain.service;

import com.example.jsmain.entity.Board;
import org.springframework.stereotype.Service;


public interface BoardService {
    public void register(Board board) throws Exception;
}
