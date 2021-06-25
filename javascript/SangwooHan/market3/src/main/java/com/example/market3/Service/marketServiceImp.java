package com.example.market3.Service;

import com.example.market3.Entity.Login;
import com.example.market3.Entity.Market;
import com.example.market3.Entity.Signup;
import com.example.market3.Rapository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class marketServiceImp implements  marketService {
  int num = 0;
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

  @Override
  public Market read(Integer productNo) throws Exception {
    return repository.read(productNo);
  }

  @Override
  public void remove(Integer productNo) throws Exception {
    repository.delete(productNo);
  }

  @Override
  public void modify(Market market) throws Exception {
    repository.update(market);
  }

  @Override
  public void signup(Signup signup) {
    repository.create2(signup);
  }

  @Override
  public int logincheck(Login login) {
    int i = 0;
    repository.loginchecking(login);

    return  i;
  }
}



