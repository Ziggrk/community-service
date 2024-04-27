package com.groweasy.communityservice.controller;

import com.groweasy.communityservice.model.Trend;
import com.groweasy.communityservice.repository.TrendRepository;
import com.groweasy.communityservice.service.TrendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grow-easy")
public class TrendController {
    @Autowired
    private TrendService trendService;

    private final TrendRepository trendRepository;

    public TrendController(TrendRepository trendRepository) {
        this.trendRepository = trendRepository;
    }

    @GetMapping("/trends")
    public ResponseEntity<List<Trend>> getAllTrends() {
        return new ResponseEntity<List<Trend>>(trendRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/trends")
    public ResponseEntity<Trend> createTrend(Trend trend) {
        try {
            return new ResponseEntity<Trend>(trendService.createTrend(trend), HttpStatus.CREATED);
        }catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
