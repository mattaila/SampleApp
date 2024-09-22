package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Item;
import com.example.demo.mapper.ItemMapper;

import jakarta.transaction.Transactional;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemMapper mapper;

    @Transactional
    public List<Item> getItemAll() {
        return mapper.findAll();
    }
}
