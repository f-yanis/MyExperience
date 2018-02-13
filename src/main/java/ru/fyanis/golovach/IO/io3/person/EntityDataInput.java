package ru.fyanis.golovach.IO.io3.person;

import java.io.DataInput;
import java.io.IOException;

public class EntityDataInput implements EntiyInput {

    private final DataInput in;

    public EntityDataInput(DataInput in) {
        this.in = in;
    }

    @Override
    public Person readPerson() throws IOException {
        String name = in.readUTF();
        int age = in.readInt();
        Person.Sex[] sexArray = new Person.Sex[in.readInt()];
        for (int i = 0; i < sexArray.length; i++) {
            sexArray[i] = in.readBoolean() ? Person.Sex.F : Person.Sex.M;
        }
        return new Person(name, age, sexArray);
    }
}
