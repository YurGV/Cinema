package com.cinema.dto.mappingDto;

public interface Mapper<E, D> {

    E toEntity(D dto);

    D toDto(E entity);
}
