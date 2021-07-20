package com.cinema.dto.mappingDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public abstract class AbstractMapper<E, D> implements Mapper<E, D> {

    @Autowired
    ModelMapper mapper;

    private final Class<E> entityClass;
    private final Class<D> dtoClass;

    AbstractMapper(Class<E> entityClass, Class<D> dtoClass) {
        this.entityClass = entityClass;
        this.dtoClass = dtoClass;
    }

    @Override
    public E toEntity(D dto) {
        return Objects.isNull(dto)
                ? null
                : mapper.map(dto, entityClass);
    }

    @Override
    public D toDto(E entity) {
        return Objects.isNull(entity)
                ? null
                : mapper.map(entity, dtoClass);
    }
}






    /* если нужны доп филды изменять то можно использовать ниже*/

//    Converter<E, D> toDtoConverter() {
//        return context -> {
//            E source = context.getSource();
//            D destination = context.getDestination();
//            mapSpecificFields(source, destination);
//            return context.getDestination();
//        };
//    }
//
//    Converter<D, E> toEntityConverter() {
//        return context -> {
//            D source = context.getSource();
//            E destination = context.getDestination();
//            mapSpecificFields(source, destination);
//            return context.getDestination();
//        };
//    }
//
////    void mapSpecificFields(E source, D destination) {
////    }
////
////    void mapSpecificFields(D source, E destination) {
////    }

