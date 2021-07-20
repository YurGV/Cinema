package com.cinema.dto.modelDto;

import com.cinema.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlaceDto {
    private Long id;

    @Column
    private Integer number;
    @Column
    private Integer row;
    @Column
    private Status status;
}
