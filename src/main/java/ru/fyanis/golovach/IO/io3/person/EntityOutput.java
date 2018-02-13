package ru.fyanis.golovach.IO.io3.person;

import java.io.IOException;

public interface EntityOutput {
    public void writePerson(Person person) throws IOException;
}
