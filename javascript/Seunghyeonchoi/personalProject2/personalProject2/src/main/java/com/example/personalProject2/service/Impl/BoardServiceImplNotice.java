package com.example.personalProject2.service.Impl;

import com.example.personalProject2.entity.BoardNotice;
import com.example.personalProject2.repository.BoardRepositoryNotice;
import com.example.personalProject2.service.BoardServiceNotice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Service는 여기서 register가 여러 방식으로 동작할 수 있음을 명시한다.
// 또한 Controller의 Autowired에 자동으로 연결되도록 서포트한다.
@Service
public class BoardServiceImplNotice  implements BoardServiceNotice {

    @Autowired
    private BoardRepositoryNotice repositoryNotice;

    @Override
    public void registerNotice(BoardNotice boardNotice) throws Exception  {
        repositoryNotice.create(boardNotice);
    }
    @Override
    public List<BoardNotice> listNotice() throws Exception {
        return repositoryNotice.listNotice();
    }


}
