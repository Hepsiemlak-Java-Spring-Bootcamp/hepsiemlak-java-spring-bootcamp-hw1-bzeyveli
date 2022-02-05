package com.company.hepsiemlak.model.enums;

public enum RoleType {

    CORPORATE("Kurumsal"),
    INDIVIDUAL("Bireysel");

    private final String text;

    RoleType(final String text) {
        this.text = text;
    }

    public static RoleType get(int ordinal) {
            if (ordinal == 0) {
                return RoleType.CORPORATE;
            } else if (ordinal == 1) {
                return RoleType.INDIVIDUAL;
            }
        return null;
    }

    @Override
    public String toString() {
        return text;
    }
}
