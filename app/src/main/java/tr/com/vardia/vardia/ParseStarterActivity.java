package tr.com.vardia.vardia;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("x1a9LhnrKWkoYJdInyIjLoslgSKuZzThNhr37mlW")
                .clientKey("AlE0ablHqCLyoIUUk5woZd9NKN6xx6VrqyKneCde")
                .server("https://parseapi.back4app.com/")
                .build()


        );


    }
}
