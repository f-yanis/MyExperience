package ru.fyanis.golovach.IO.io3.person;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        new EntityDataOutput(new DataOutputStream(buff)).writePerson(new Person("Mike", 43, new Person.Sex[]{Person.Sex.M}));
        byte[] bytes = buff.toByteArray();

        Person p = new EntityDataInput(new DataInputStream(new ByteArrayInputStream(bytes))).readPerson();
        System.out.println(p);
    }
}
