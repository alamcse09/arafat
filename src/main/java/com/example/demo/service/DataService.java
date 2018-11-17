package com.example.demo.service;

import com.example.demo.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public Optional<Data> findById(Long id) {

        return  dataRepository.findById( id );
    }

    public Data save(Integer val) {

        Data data = new Data();
        data.setData( val );

        return dataRepository.save( data );
    }
}
