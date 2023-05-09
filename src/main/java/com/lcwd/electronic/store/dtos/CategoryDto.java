package com.lcwd.electronic.store.dtos;

import lombok.*;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private String categoryId;

    @NotBlank
    @Size(min = 4,message = "title must be of min 4 chars ")
    private String title;

    @NotBlank(message = "description required!!")
    private String description;

    @NotBlank(message = "coverImage Required!!")
    private String coverImage;

}
