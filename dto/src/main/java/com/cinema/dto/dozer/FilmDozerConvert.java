package com.cinema.dto.dozer;


import com.cinema.dto.modelDto.FilmDto;
import com.cinema.model.Film;
import org.dozer.DozerBeanMapper;
import org.dozer.DozerConverter;

public class FilmDozerConvert extends DozerConverter {

  DozerBeanMapper mapper = new DozerBeanMapper();

    public FilmDozerConvert(Class cinema, Class cinemaDto) {
        super(cinema, cinemaDto);
    }

    @Override
    public Object convertTo(Object cinema, Object cinemaDto) {
        Film cinemaEntity = new Film();
        return mapper.map(cinemaEntity, FilmDto.class);
    }

    @Override
    public Object convertFrom(Object cinema, Object cinemaDto) {
        FilmDto flDto = new FilmDto();
        return mapper.map(flDto, Film.class);
    }

}
