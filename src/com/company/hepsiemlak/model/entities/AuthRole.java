package com.company.hepsiemlak.model.entities;

import com.company.hepsiemlak.audits.DateAudit;
import com.company.hepsiemlak.model.enums.RoleType;

public class AuthRole extends DateAudit {

    private Long id;

    private RoleType type;   // Bireysel veya kurumsal

    private Boolean isDeleted;  // Kullanıcı sistemde kayıtlı olup olmadığını kontrol etmek için

    public AuthRole(RoleType type, Boolean isDeleted) {
        this.type = type;
        this.isDeleted = isDeleted;
    }

    public AuthRole() {
    }
}
