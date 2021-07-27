package com.cinema.dto.modelDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.UniqueElements;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CinemaDto {

    private Long id;

    @Length(min = 3, max = 30)
    private String name;

    @UniqueElements
    @Email
    @NotNull
    private String email;

    @NotNull
    private String address;

    @Range(min = 1, max = 100)
    private int numberOfCinemaHall;
}
