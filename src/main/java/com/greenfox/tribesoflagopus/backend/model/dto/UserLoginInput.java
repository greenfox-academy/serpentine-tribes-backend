package com.greenfox.tribesoflagopus.backend.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

@Data
@NoArgsConstructor
public class UserLoginInput implements JsonDto {

  @NotBlank
  private String username;
  @NotBlank
  private String password;
}
