package com.example.arom1.common.util.jwt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Getter
@Setter
@Component
@ConfigurationProperties("jwt")
public class JwtProperties {

    private String issuer;
    private String secretKey;
    private Duration accessExpiredAt = Duration.ofMinutes(1);
    private Duration refreshExpiredAt = Duration.ofDays(7);
}
