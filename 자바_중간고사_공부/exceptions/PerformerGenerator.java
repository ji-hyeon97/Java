package com.exceptions;
import com.company.performer;
import com.company.Gender;
public class PerformerGenerator {
    public static performer get(String name)
            throws EmptyPerformerException {
        return new performer("seo", 40, 1.91f, "남산", "영화", Gender.MALE);
    }
}
