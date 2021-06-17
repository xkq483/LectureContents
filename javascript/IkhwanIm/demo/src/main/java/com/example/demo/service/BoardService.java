package com.example.demo.service;

import com.example.demo.entity.Board;
import org.springframework.stereotype.Service;

public interface BoardService {
    public void register(Board board) throws Exception;
}