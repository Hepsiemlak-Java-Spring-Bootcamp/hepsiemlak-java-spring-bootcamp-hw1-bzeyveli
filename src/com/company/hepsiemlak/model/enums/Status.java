package com.company.hepsiemlak.model.enums;

public enum Status {

    ACTIVE("Aktif"),
    PASSIVE("Pasif");

    private final String key;

    Status(final String key) {
        this.key = key;
    }

    private static Status get(Integer ordinal) {
        if (ordinal != null) {
            if (ordinal == 0) {
                return Status.ACTIVE;

            } else if (ordinal == 1) {
                return PASSIVE;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Status{" +
                "key='" + key + '\'' +
                '}';
    }
}
