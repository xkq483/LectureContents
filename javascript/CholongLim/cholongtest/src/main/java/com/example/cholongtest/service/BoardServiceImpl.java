package com.example.cholongtest.service;

import com.example.cholongtest.entity.Board;
import com.example.cholongtest.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Service는 여기서 register가 여러 방식으로 동작할 수 있음을 명시한다.
// 또한 Controller의 Autowired에 자동으로 연결되도록 서포트한다.
@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardRepository repository;

    @Override
    public void register(Board board) throws Exception {
        repository.create(board);
    }

    //상품 등록, 게시판에 글 쓰는것, 댓글쓰는것
}
