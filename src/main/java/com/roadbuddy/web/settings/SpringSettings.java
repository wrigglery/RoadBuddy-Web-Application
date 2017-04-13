package com.roadbuddy.web.settings;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.yml")
@ConfigurationProperties("spring")
public class SpringSettings {

    public void setProfiles(String profiles) {
        this.profiles = profiles;
    }

    public String getProfiles() {
        return profiles;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public static class Data {

        public void setRest(Rest rest) {
            this.rest = rest;
        }

        public Rest getRest() {
            return rest;
        }

        public static class Rest {

            public void setBasePath(String basePath) {
                this.basePath = basePath;
            }

            public String getBasePath() {
                return basePath;
            }

            private String basePath;
        }

        private Rest rest;
    }

    private String profiles;

    private Data data;
}
