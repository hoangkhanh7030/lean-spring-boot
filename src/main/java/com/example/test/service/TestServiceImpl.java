package com.example.test.service;

import com.example.test.entity.Persion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TestServiceImpl implements TestService{
    @Override
    public List<Persion> getAll() {
        return mockData();
    }
    public List<Persion> mockData(){
    List<Persion> list = new ArrayList<>();
    list.add(new Persion("1","Khanh",6));
    return list;

    }
}
