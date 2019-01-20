package com.vonzhou.learningspring.mappers;

import com.vonzhou.learningspring.domain.Spitter;

import java.util.List;

/**
 * Created by vonzhou on 16/7/12.
 */
public interface SpitterMapper {
    List<Spitter> findAllSpitters();
    Spitter findSpitterById(Long id);
}
