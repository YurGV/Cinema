package com.cinema.dto.modelDto;

import com.cinema.model.enums.Country;
import com.cinema.model.enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.NotNull;
import java.text.Format;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FilmDto {

    private Long id;

    @Length(min = 1, max = 30)
    private String name;

    @Range(min = 0, max = 100)
    private Integer age;

    @Range(min = 1900, max = 2021)
    private Date year;

    @Range(min = 1, max = 500)
    private Integer durability;

    @NotNull
    private Country county;

    @NotNull
    private Format format;

    @NotNull
    private Genre genre;
}
