package com.example.market.service;

import com.example.market.entity.Market;

import java.util.List;

public interface marketService {
    public void register(Market market);
    public List<Market> list() throws  Exception;
}
