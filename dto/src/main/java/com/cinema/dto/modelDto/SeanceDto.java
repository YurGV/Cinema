package com.cinema.dto.modelDto;


import com.cinema.model.Film;
import com.cinema.model.Ticket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SeanceDto {

    private Long id;

    private Film film;

    private List<Ticket> tickets;
}
