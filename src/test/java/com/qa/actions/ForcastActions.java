package com.qa.actions;

import com.qa.utils.Constants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ForcastActions {

 public static Response response;

    public static void requestForecastWithGet(String postCode) {
        RestAssured.baseURI = Constants.FORECAST_ENDPOINTS;
        RequestSpecification request;
        request = RestAssured.given();
        response = request.queryParam("key",Constants.WEATHER_API_KEY)
                .queryParam("postal_code", postCode)
                .get();

        System.out.println("Response is " + response.asString());
    }

    public static int getStatusCode()  {
        return response.then().extract().statusCode();
    }
}
