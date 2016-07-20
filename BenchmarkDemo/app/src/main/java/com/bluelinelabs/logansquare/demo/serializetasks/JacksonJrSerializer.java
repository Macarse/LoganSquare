package com.bluelinelabs.logansquare.demo.serializetasks;

import com.bluelinelabs.logansquare.demo.model.Response;
import com.fasterxml.jackson.jr.ob.JSON;

import java.io.IOException;

public class JacksonJrSerializer extends Serializer {

    public JacksonJrSerializer(SerializeListener parseListener, Response response) {
        super(parseListener, response);
    }

    @Override
    protected String serialize(Response response) {
        try {
            String ret = JSON.std.asString(response);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
