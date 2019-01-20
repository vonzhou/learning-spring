package com.vonzhou.learningspring.service;

import com.vonzhou.learningspring.domain.Spitter;
import com.vonzhou.learningspring.mappers.SpitterMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by vonzhou on 16/7/12.
 */
@Service
@Transactional
public class SpitterService {

    @Autowired
    private SqlSession sqlSession;

    @Autowired
    private SpitterMapper spitterMapper;

    public List<Spitter> findAllSpitters() {
//        SpitterMapper spitterMapper = sqlSession.getMapper(SpitterMapper.class);
        return spitterMapper.findAllSpitters();
    }

    public Spitter findSpitterById(long id){
        return spitterMapper.findSpitterById(id);
    }
}
