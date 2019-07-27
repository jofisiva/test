package com.techworld.aws;

import java.util.Collections;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaJavaAPI implements RequestHandler<Object, GateWayResponse> {

    @Override
    public GateWayResponse handleRequest(Object o, Context context) {

    String message = "Hello Sivabalan AWS lambda S3";
    System.out.println(message);
        GateWayResponse response = new GateWayResponse(message,
                200,
                Collections.singletonMap("X-Powered-By", "TechWorld"),
                false);


        return response;
    }
}
