package org.example.springboot.issue22926;

import org.apache.logging.log4j.core.async.AsyncLoggerContextSelector;
import org.apache.logging.log4j.jul.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Issue22926ReproducerApplication {
    private static Logger log = LoggerFactory.getLogger(Issue22926ReproducerApplication.class);

    public static void main(String[] args) {
        // https://logging.apache.org/log4j/2.x/manual/garbagefree.html
        // https://logging.apache.org/log4j/2.x/performance.html
        // https://logging.apache.org/log4j/2.x/manual/async.html
        // Enable JUL binding to LOG4J2
        System.setProperty("java.util.logging.manager", LogManager.class.getName());
        // Make all loggers, ASYNC loggers
        System.setProperty("log4j2.contextSelector", AsyncLoggerContextSelector.class.getName());
        // Enable full garbage free
        // -Dlog4j2.enable.threadlocals=true -Dlog4j2.enable.direct.encoders=true

        try {
            SpringApplication.run(Issue22926ReproducerApplication.class, args);
        } catch (RuntimeException e) {
            log.warn("Exception on spring application start: {}", e.getMessage(), e);
            throw e;
        }
    }
}
