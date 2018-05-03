package com.jsee.gona.demo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix = "girl")
public class GirlProperty {

    private String sss = "ssssssss";
    private String cupSize;
    private int age;

    public String getSss() {
        return sss;
    }

    public void setSss(String sss) {
        this.sss = sss;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
