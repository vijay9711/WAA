package waarest.waarest.service;

import waarest.waarest.entity.dtos.LoginRequest;
import waarest.waarest.entity.dtos.LoginResponse;
import waarest.waarest.entity.dtos.RefreshTokenRequest;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
