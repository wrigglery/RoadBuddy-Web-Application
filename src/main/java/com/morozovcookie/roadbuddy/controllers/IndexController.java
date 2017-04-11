package com.morozovcookie.roadbuddy.controllers;

import com.morozovcookie.roadbuddy.settings.DatabaseSettings;
import com.morozovcookie.roadbuddy.settings.GlobalSettings;
import com.morozovcookie.roadbuddy.settings.HibernateSettings;
import com.morozovcookie.roadbuddy.settings.SpringSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private HibernateSettings hibernateSettings;

    private DatabaseSettings databaseSettings;

    private GlobalSettings globalSettings;

    private SpringSettings springSettings;

    @Autowired
    public void setHibernateSettings(HibernateSettings settings) {
        hibernateSettings = settings;
    }

    @Autowired
    public void setDatabaseSettings(DatabaseSettings settings) {
        databaseSettings = settings;
    }

    @Autowired
    public void setGlobalSettings(GlobalSettings settings) {
        globalSettings = settings;
    }

    @Autowired
    public void setSpringSettings(SpringSettings settings) {
        springSettings = settings;
    }

    @RequestMapping(value = "/")
    public String index() {
        System.out.println(databaseSettings == null);
        System.out.println(databaseSettings.getDriver());
        System.out.println(databaseSettings.getUrl());
        System.out.println(databaseSettings.getUsername());
        System.out.println(databaseSettings.getPassword());
        System.out.println();

        System.out.println(hibernateSettings == null);
        System.out.println(hibernateSettings.getDialect());
        System.out.println(hibernateSettings.isShow_sql());
        System.out.println(hibernateSettings.getHmb2ddl() == null);
        System.out.println(hibernateSettings.getHmb2ddl().getAuto());
        System.out.println();

        System.out.println(globalSettings == null);
        System.out.println(globalSettings.getUrl());
        System.out.println();

        System.out.println(springSettings == null);
        System.out.println(springSettings.getProfiles());
        System.out.println(springSettings.getData().getRest().getBasePath());
        System.out.println();

        return "index";
    }
}
