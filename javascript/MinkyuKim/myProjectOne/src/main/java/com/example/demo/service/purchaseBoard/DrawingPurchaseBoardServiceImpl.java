package com.example.demo.service.purchaseBoard;

import com.example.demo.entity.DrawingPurchaseBoard;
import com.example.demo.entity.PurchasingSignUp;
import com.example.demo.repository.DrawingPurchaseRepository;
import com.example.demo.repository.PurchasingSignUpRepository;
import com.example.demo.service.PurchasingSignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrawingPurchaseBoardServiceImpl implements DrawingPurchaseBoardService {

    @Autowired
    public DrawingPurchaseRepository drawingPurchaseRepository;

    @Override
    public void drawingLists(DrawingPurchaseBoard drawingPurchaseBoard) throws Exception {
    drawingPurchaseRepository.create(drawingPurchaseBoard);
    }

    /*@Override
    public List<DrawingPurchaseBoard> drawingList() throws Exception {
        return drawingPurchaseRepository.drawingList();
    }

     */


}

