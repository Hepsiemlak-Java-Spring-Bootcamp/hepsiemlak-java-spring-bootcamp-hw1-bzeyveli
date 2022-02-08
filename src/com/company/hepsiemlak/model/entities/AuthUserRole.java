package com.company.hepsiemlak.model.entities;

import com.company.hepsiemlak.audits.DateAudit;

public class AuthUserRole extends DateAudit {

    private AuthRole role;

    private AuthUser user;

    public AuthUserRole(AuthRole role, AuthUser user) {
        this.role = role;
        this.user = user;
    }

    public AuthUserRole() {
    }

    @Override
    public String toString() {
        return "AuthUserRole{" +
                "role=" + role +
                ", user=" + user +
                '}';
    }
}
