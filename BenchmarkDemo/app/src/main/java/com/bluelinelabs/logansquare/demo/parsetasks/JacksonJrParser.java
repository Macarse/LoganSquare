package com.bluelinelabs.logansquare.demo.parsetasks;

import com.bluelinelabs.logansquare.demo.model.Response;
import com.fasterxml.jackson.jr.ob.JSON;

import java.io.IOException;

public class JacksonJrParser extends Parser {

    public JacksonJrParser(ParseListener parseListener, String jsonString) {
        super(parseListener, jsonString);
    }

    @Override
    protected int parse(String json) {
        try {
            Response response = JSON.std.beanFrom(Response.class, json);
            return response.users.size();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }
}
