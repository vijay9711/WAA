package waarest.waarest.entity.dtos;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class LoginRequest {
    @Getter
    private String email;
    @Getter
    private String password;
}
