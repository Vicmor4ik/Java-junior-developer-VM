package com.vicmor.project.lesson10.staticmodifier;

public final class AppAuth implements Auth{
    //
    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }
}