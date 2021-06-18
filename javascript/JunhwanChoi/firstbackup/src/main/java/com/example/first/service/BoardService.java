package com.example.first.service;

import com.example.first.entity.Board;
import org.springframework.stereotype.Service;

public interface BoardService {
    public void register(Board board) throws Exception;
}