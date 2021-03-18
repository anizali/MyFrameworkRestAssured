package com.qa.actions;

import com.qa.pojo.Data;
import com.qa.pojo.GetForcast;
import com.qa.utils.Constants;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.ArrayList;

public class ForcastActions {

    public static Response response;
    public static GetForcast gf;
    public static ArrayList<String> date;

    public static void requestForecastWithGet(String postCode) {
        RestAssured.baseURI = Constants.FORECAST_ENDPOINTS;
        RequestSpecification request;
        request = RestAssured.given();
        response = request.queryParam("key", Constants.WEATHER_API_KEY)
                .queryParam("postal_code", postCode)
                .get();

        gf = request.queryParam("key", Constants.WEATHER_API_KEY)
                .queryParam("postal_code", postCode)
                .get().as(GetForcast.class);


        System.out.println("Response is " + response.asString());

        System.out.println("Time Zone - " + gf.getTimezone());
    }

    public static void getAllDatesForTemperatureRange(Float minTemp, Float maxTemp) {
        date = new ArrayList<>();
        for (Data data : gf.getData()) {
            float Temp = Float.parseFloat(data.getTemp());
            if (Temp >= minTemp && Temp <= maxTemp) {
                date.add(data.getDatetime());
            }
        }
        System.out.println("List of dates **** - " + date);

    }

    public static int getStatusCode() {
        return response.then().extract().statusCode();
    }
}
