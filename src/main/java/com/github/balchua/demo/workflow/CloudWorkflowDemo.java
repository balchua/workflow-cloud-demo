package com.github.balchua.demo.workflow;

import org.activiti.cloud.starter.rb.configuration.ActivitiRuntimeBundle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ActivitiRuntimeBundle
public class CloudWorkflowDemo {

    public static void main(String[] args) {
        SpringApplication.run(CloudWorkflowDemo.class,
                args);
    }
}