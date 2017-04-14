package com.roadbuddy.web.settings;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.yml")
@ConfigurationProperties("spring")
public class SpringSettings {

    public static class Data {

        public static class Rest {

            public void setBasePath(String basePath) {
                this.basePath = basePath;
            }

            public String getBasePath() {
                return basePath;
            }

            private String basePath;
        }

        public void setRest(Rest rest) {
            this.rest = rest;
        }

        public Rest getRest() {
            return rest;
        }

        private Rest rest;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return this.data;
    }

    public static class DataSource {

        public void setDriverClassName(String driverClassName) {
            this.driverClassName = driverClassName;
        }

        public String getDriverClassName() {
            return driverClassName;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserName() {
            return userName;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPassword() {
            return password;
        }

        private String driverClassName;

        private String url;

        private String userName;

        private String password;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return this.dataSource;
    }

    public static class Jpa {

        public static class Hibernate {

            public void setDdlAuto(String ddlAuto) {
                this.ddlAuto = ddlAuto;
            }

            public String getDdlAuto() {
                return ddlAuto;
            }

            private String ddlAuto;
        }

        public void setHibernate(Hibernate hibernate) {
            this.hibernate = hibernate;
        }

        public Hibernate getHibernate() {
            return hibernate;
        }

        public void setShowSql(boolean showSql) {
            this.showSql = showSql;
        }

        public boolean isShowSql() {
            return showSql;
        }

        private Hibernate hibernate;

        private boolean showSql;
    }

    public void setJpa(Jpa jpa) {
        this.jpa = jpa;
    }

    public Jpa getJpa() {
        return jpa;
    }

    private Data data;

    private DataSource dataSource;

    private Jpa jpa;
}
