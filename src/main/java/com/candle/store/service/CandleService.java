package com.candle.store.service;

import com.candle.store.entity.Candle;
import com.candle.store.repository.CandleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandleService {
    @Autowired
    CandleRepository candleRepository;

    public List<Candle> listAllCandels(){
        return candleRepository.findAll();
    }
}
