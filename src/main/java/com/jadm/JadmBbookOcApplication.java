package com.jadm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
public class JadmBbookOcApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(JadmBbookOcApplication.class, args);
    }
}
