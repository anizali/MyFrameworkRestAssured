package com.qa.runners;

import com.qa.utils.Constants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class junitTest {

    @Test

    public void test()
    {
        RestAssured.baseURI = Constants.FORECAST_ENDPOINTS;

        RequestSpecification request = RestAssured.given();


        Response response = request.queryParam("key",Constants.WEATHER_API_KEY)
                .queryParam("postal_code", "2026,AU")
                .get();

        System.out.println("Response is " + response.asString());

    }
}
