package com.example.demo.controller;

import com.example.demo.entity.DrawingPurchaseBoard;
import com.example.demo.repository.DrawingPurchaseRepository;
import com.example.demo.service.PurchasingSignUpService;
import com.example.demo.service.purchaseBoard.DrawingPurchaseBoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class ControllerPurchaseBoard {
/*
    @Autowired
    private DrawingPurchaseBoard drawingPurchaseBoardService;

    @GetMapping("/drawingPurchase")
    private String getDrawingPurchase(DrawingPurchaseBoard drawingPurchaseBoard, Model modelPurchase) {
        log.info("getDrawingPurchase()");

        return "/board/purchaseBoard/drawingPurchase";

        // @PostMapping("/drawingPurchase")
        //private String postDrawingPurchase(DrawingPurchaseBoard drawingPurchaseBoard, modelPurchase) {
        //   log.info("postDrawingPurchase");

        //log.info("DrawingPurchaseBoard: " + DrawingPurchaseBoard);

        //DrawingPurchaseBoardService.drawingPurchaseBoard(DrawingPurchaseRepository);
        //modelPurchase.addAttribute(DrawingPurchaseBoard);
        //modelPurchase.addAttribute("salesMSG", "게시글 등록이 완료되었습니다." )


    }

 */
}