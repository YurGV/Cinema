package com.cinema.dto.modelDto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientDto {

    private Long id;

    @Length(min = 3, max = 20)
    private String firstName;

    @Length(min = 3, max = 20)
    private String lastName;

    @Email
    @NotNull
    @UniqueElements
    private String email;

    @Length(min = 5, max = 20)
    private String password;


}
