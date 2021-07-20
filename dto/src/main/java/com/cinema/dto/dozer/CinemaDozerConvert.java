package com.cinema.dto.dozer;

import com.cinema.dto.modelDto.CinemaDto;
import com.cinema.model.Cinema;
import org.dozer.DozerBeanMapper;
import org.dozer.DozerConverter;

public class CinemaDozerConvert extends DozerConverter {

  DozerBeanMapper mapper = new DozerBeanMapper();

    public CinemaDozerConvert(Class cinema, Class cinemaDto) {
        super(cinema, cinemaDto);
    }

    @Override
    public Object convertTo(Object cinema, Object cinemaDto) {
        Cinema cinemaEntity = new Cinema();
        return mapper.map(cinemaEntity, CinemaDto.class);
    }

    @Override
    public Object convertFrom(Object cinema, Object cinemaDto) {
        CinemaDto cnDto = new CinemaDto();
        return mapper.map(cnDto, Cinema.class);
    }

}
