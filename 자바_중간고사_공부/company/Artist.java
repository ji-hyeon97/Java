package com.company;

public interface Artist{
    String getSchool();
    void setSchool(String School);
    default boolean isCreative(){
        return true;
    }
}
