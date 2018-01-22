package com.javabasics;

import java.util.logging.*;

public class Logging {

    private static final Logger LOGGERA = Logger.getLogger("org.stepic.java.logging.ClassA");
    private static final Logger LOGGERB = Logger.getLogger("org.stepic.java.logging.ClassB");
    private static final Logger LOGGERC = Logger.getLogger("org.stepic.java");

    public static void main(String[] args) {

    }

    private static void configureLogging() {

        Handler consoleHandler = new ConsoleHandler();
        XMLFormatter xmlFormatter = new XMLFormatter();

        LOGGERA.setLevel(Level.ALL);
        LOGGERB.setLevel(Level.WARNING);

        LOGGERC.setUseParentHandlers(false);
        LOGGERC.addHandler(consoleHandler);
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(xmlFormatter);

    }
}
