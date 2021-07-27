package com.cinema.dto.modelDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HallDto {

    private Long id;

    @NotNull
    private String name;
    @NotNull
    private Integer capacity;

    private CinemaDto cinema;

}
