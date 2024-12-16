package org.example.skillbox_mod4.config;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    ROLE_ADMIN,
    ROLE_USER,
    ROLE_MODERATOR;

    @Override
    public String getAuthority() {
        return this.name();
    }
}
