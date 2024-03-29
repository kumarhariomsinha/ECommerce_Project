package com.lcwd.electronic.store.dtos;

import com.lcwd.electronic.store.validate.ImageNameValid;
import lombok.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String userId;
    @Size(min = 3,max = 20,message = "Invalid name!!")
    private String name;
   // @Email(message = "Invalid User Email!!")
    @Pattern(regexp = "^[a-z0-9][-a-z0-9.]+@([-a-z0-9]+\\.)+[a-z]{2,5}$",message = "Invalid user email!!")
    @NotBlank(message = "Email required!!!!!")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;

    @Size(min = 4,max = 6,message = "Invalid gender")
    private String gender;

    @NotBlank(message = "Write somthing about yourself")
    private String about;

    //@Pattern
    //custom validators
    @ImageNameValid
    private String imageName;

    private Set<RoleDto> roles= new HashSet<>();
}
