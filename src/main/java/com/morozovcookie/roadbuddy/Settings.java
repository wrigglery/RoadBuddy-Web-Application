package com.morozovcookie.roadbuddy;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.net.URL;

@Component
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class Settings {

    public Database getDb() {
        return db;
    }

    public Hibernate getHibernate() {
        return hibernate;
    }

    private Database db;

    private Hibernate hibernate;

    public static class Database {

        public String getDriver() {
            return driver;
        }

        public URL getUrl() {
            return url;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        private String driver;

        private URL url;

        private String username;

        private String password;
    }

    public static class Hibernate {

        public String getDialect() {
            return dialect;
        }

        public boolean isShow_sql() {
            return show_sql;
        }

        public Hmb2Ddl getHmb2Ddl() {
            return hmb2Ddl;
        }

        private String dialect;

        private boolean show_sql;

        private Hmb2Ddl hmb2Ddl;

        private static class Hmb2Ddl {

            public String getAuto() {
                return auto;
            }

            private String auto;
        }
    }
}
