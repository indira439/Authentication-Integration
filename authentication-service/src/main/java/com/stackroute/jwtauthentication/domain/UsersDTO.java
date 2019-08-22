package com.stackroute.jwtauthentication.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*  Data bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter
    and @RequiredArgsConstructor together*/
@Data

// It generates constructor with no parameters
@NoArgsConstructor
// It generates a constructor with 1 parameter for each field
@AllArgsConstructor
public class UsersDTO {
    private String userName;
    private String password;
}
