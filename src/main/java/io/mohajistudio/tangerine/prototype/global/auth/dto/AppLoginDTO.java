package io.mohajistudio.tangerine.prototype.global.auth.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppLoginDTO {
    @NotNull
    @NotEmpty
    private String token;
}
