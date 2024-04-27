package com.groweasy.communityservice.service.impl;

import com.groweasy.communityservice.model.Trend;
import com.groweasy.communityservice.repository.TrendRepository;
import com.groweasy.communityservice.service.TrendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrendServiceImpl implements TrendService {

    @Autowired
    private TrendRepository trendRepository;

    @Override
    public Trend createTrend(Trend trend) {
        return trendRepository.save(trend);
    }
}
