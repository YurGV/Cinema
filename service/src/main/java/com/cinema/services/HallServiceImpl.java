package com.cinema.services;

import com.cinema.dao.HallDao;
import com.cinema.dto.modelDto.HallDto;
import com.cinema.dto.modelMappingDto.HallMapper;
import com.cinema.service.HallService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class HallServiceImpl implements HallService {

    private final HallDao hallDao;
    private final HallMapper hallMapper;

    @Override
    @Transactional
    public HallDto updateHall(HallDto editHall) {
        hallDao.save(hallMapper.toEntity(editHall));
        return editHall;
    }

}
