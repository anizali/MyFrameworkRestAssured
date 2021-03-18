package com.qa.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void initialise() {
        System.out.println("Initialise");


    }

    @After
    public void quit() {
        System.out.println("Quit function");
    }
}
