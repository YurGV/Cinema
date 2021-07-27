package com.cinema.dto.modelDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SectorDto {
    private Long id;


    private String name;

    private BigDecimal price;

    private List<PlaceDto> places;
}
