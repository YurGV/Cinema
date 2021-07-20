package com.cinema.dto.modelMappingDto;

public interface Mapper<E, D> {

    E toEntity(D dto);

    D toDto(E entity);
}
