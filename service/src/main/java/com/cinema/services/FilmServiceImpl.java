package com.cinema.services;

import com.cinema.dao.FilmDaoImpl;
import com.cinema.dto.modelDto.FilmDto;
import com.cinema.dto.modelMappingDto.FilmMapper;
import com.cinema.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class FilmServiceImpl implements FilmService {

    FilmDaoImpl filmDao;
    FilmMapper filmMapper;

    @Autowired
    public FilmServiceImpl(FilmDaoImpl filmDao, FilmMapper filmMapper) {
    this.filmDao = filmDao;
    this.filmMapper = filmMapper;
    }

    @Override
    public FilmDto findByName(String name) {

//        return filmDao.getAll().stream()
//                .filter(x -> x.getName().equals(name))
//                .findFirst()
//                .orElseThrow(UserNotFoundException::new);
        return null;
    }

    @Override
    public List<FilmDto> getAll() {
        return filmDao.getAll().stream()
                .map(filmMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public FilmDto updateFilmInfo(FilmDto editFilm) {
        filmDao.save(filmMapper.toEntity(editFilm));
        return editFilm;
    }
}
