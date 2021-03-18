package com.qa.actions;

import com.qa.pojo.Data;
import com.qa.pojo.GetForcast;
import com.qa.utils.Constants;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


/**
 * ForeCastActions class is to have the reusable functions related ForeCast Api
 *
 * created by Aniz
 * date 3/18/2021
 */

public class ForcastActions {

    public static Response response;
    public static GetForcast gf;
    public static ArrayList<String> date;

    public static void requestForecastWithGet(String postCode) {
        RestAssured.baseURI = Constants.FORECAST_ENDPOINTS;
        RequestSpecification request;
        request = RestAssured.given();
        date = new ArrayList<>();
        gf = request.queryParam("key", Constants.WEATHER_API_KEY)
                .queryParam("postal_code", postCode)
                .get().as(GetForcast.class);
        System.out.println("Time Zone - " + gf.getTimezone());
    }

    public static void getAllDatesForTemperatureRange(Float minTemp, Float maxTemp) {

        for (Data data : gf.getData()) {
            float Temp = Float.parseFloat(data.getTemp());
            if (Temp >= minTemp && Temp <= maxTemp) {
                date.add(data.getDatetime());
            }
        }
        System.out.println("Temperature satisfied dates **** - " + date);

    }

    public static void getAllDatesForWindSpeedRange(Float minSpeed, Float maxSpeed) {
        for (Data data : gf.getData()) {
            float windSpeed = Float.parseFloat(data.getWind_spd());
            if (!(windSpeed >= minSpeed && windSpeed <= maxSpeed)) {
                date.remove(data.getDatetime());
            }
        }
        System.out.println("Wind Speed satisfied dates **** - " + date);
    }

    public static void getAllDatesForUVIndex(Float maxUvIndex) {
        for (Data data : gf.getData()) {
            float uvIndex = Float.parseFloat(data.getUv());
            if (!(uvIndex <= maxUvIndex)) {
                date.remove(data.getDatetime());
            }
        }
        System.out.println("UV index satisfied dates **** - " + date);
    }

    public static void displayDates() {

        System.out.println("Final Dates for the Surfer -  " + date);
    }

    public static int getDayNumberOld(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.DAY_OF_WEEK);
    }
}
