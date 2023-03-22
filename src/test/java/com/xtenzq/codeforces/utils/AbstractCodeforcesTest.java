package com.xtenzq.codeforces.utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public abstract class AbstractCodeforcesTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    protected void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    protected String getOutput() {
        return testOut.toString();
    }

    protected void provideFile(String name) {
        try (FileInputStream fileInputStream = new FileInputStream(getFileFromResource(name))) {
            testIn = new ByteArrayInputStream(fileInputStream.readAllBytes());
            System.setIn(testIn);
        } catch (Exception ignored) {

        }
    }

    protected String readFile(String name) {
        try (FileInputStream fileInputStream = new FileInputStream(getFileFromResource(name))) {
            return new String(fileInputStream.readAllBytes(), StandardCharsets.UTF_8);
        } catch (Exception ignored) {

        }
        return "";
    }

    private File getFileFromResource(String fileName) throws URISyntaxException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return new File(resource.toURI());
        }
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }
}
