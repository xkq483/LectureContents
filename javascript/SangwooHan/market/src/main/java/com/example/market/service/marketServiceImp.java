package com.example.market.service;

import com.example.market.entity.Market;
import com.example.market.rapository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class marketServiceImp implements  marketService{
  @Autowired
  private MarketRepository repository;
    @Override
    public void register(Market market) {
        repository.create(market);
    }

    @Override
    public List<Market> list() throws Exception {
        return repository.list();
    }
}
