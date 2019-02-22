package io.micronaut.example.controllers;

import io.micronaut.example.entities.Response;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;

@Controller("/secondpoint")
public class SecondController {

    @Get("/{name}")
    public Single<Response> Hello(String name) {
        Response response = new Response();
        response.setMessage(name + " Welcome to Second Point");
        return Single.just(response);
    }

}
