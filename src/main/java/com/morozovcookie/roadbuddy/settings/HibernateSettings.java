package com.morozovcookie.roadbuddy.settings;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.yml")
@ConfigurationProperties("hibernate")
public class HibernateSettings {

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    public String getDialect() {
        return dialect;
    }

    public void setShow_sql(boolean show_sql) {
        this.show_sql = show_sql;
    }

    public boolean isShow_sql() {
        return show_sql;
    }

    public void setHmb2ddl(Hmb2ddl hmb2ddl) {
        this.hmb2ddl = hmb2ddl;
    }

    public Hmb2ddl getHmb2ddl() {
        return hmb2ddl;
    }

    public static class Hmb2ddl {

        public void setAuto(String auto) {
            this.auto = auto;
        }

        public String getAuto() {
            return auto;
        }

        private String auto;
    }

    private String dialect;

    private boolean show_sql;

    private Hmb2ddl hmb2ddl;
}
