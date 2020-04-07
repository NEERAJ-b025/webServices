package com.neeraj.ws.soapcalculator;

import com.neeraj.springsoap.gen.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalcEndPoint {

    private static final String NAMESPACE_URI = "http://www.neeraj.com/springsoap/gen";

    private CalcRepository calcRepository;

    @Autowired
    public CalcEndPoint(CalcRepository calcRepository) {
        this.calcRepository = calcRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCalcRequest")
    @ResponsePayload
    public GetCalcResponse getCalc(@RequestPayload GetCalcRequest request) {
        GetCalcResponse response = new GetCalcResponse();
        response.setVal(request.getValue1()+request.getValue2());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCalcSubRequest")
    @ResponsePayload
    public GetCalcResponse getSubCalc(@RequestPayload GetCalcSubRequest request) {
        GetCalcResponse response = new GetCalcResponse();
        response.setVal(request.getValue1()-request.getValue2());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCalcMulRequest")
    @ResponsePayload
    public GetCalcResponse getMulCalc(@RequestPayload GetCalcMulRequest request) {
        GetCalcResponse response = new GetCalcResponse();
        response.setVal(request.getValue1()*request.getValue2());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCalcDivRequest")
    @ResponsePayload
    public GetCalcResponse getDivCalc(@RequestPayload GetCalcDivRequest request) {
        GetCalcResponse response = new GetCalcResponse();
        if (request.getValue2() == 0) {
            response.setVal(0);
        } else {
            response.setVal(request.getValue1() / request.getValue2());
        }
        return response;
    }
}
