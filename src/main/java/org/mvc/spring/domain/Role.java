package org.mvc.spring.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * 01.11.2019
 *
 * @author Jimy
 * @project FirstMVCProject
 */
public enum Role implements GrantedAuthority {
    USER, ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
