package com.example.demo.service.purchaseBoard;

import com.example.demo.entity.ArtworkPurchaseBoard;
import com.example.demo.repository.ArtworkPurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtworkPurchaseBoardServiceImpl implements ArtworkPurchaseBoardService {

    @Autowired
    public ArtworkPurchaseRepository artworkPurchaseRepository;

    @Override
    public void drawingLists(ArtworkPurchaseBoard artworkPurchaseBoard) throws Exception {
    artworkPurchaseRepository.drawingPurchaseCreate(artworkPurchaseBoard);
    }

    /*@Override
    public List<ArtworkPurchaseBoard> artworkList() throws Exception {
        return artworkPurchaseRepository.artworkList();
    }

     */


}

