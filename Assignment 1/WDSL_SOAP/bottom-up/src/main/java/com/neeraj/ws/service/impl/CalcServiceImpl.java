package com.neeraj.ws.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.neeraj.ws.model.CalcModel;

@WebService
public class CalcServiceImpl {

	@WebMethod
	public CalcModel add(@WebParam(name = "value1") float value1, @WebParam(name = "value2") float value2) {
		CalcModel tn = new CalcModel();
		tn.setValue1(value1);
		tn.setValue2(value2);
		tn.setRetVal(value1 + value2);
		return tn;
	}

	@WebMethod
	public CalcModel sub(@WebParam(name = "value1") float value1, @WebParam(name = "value2") float value2) {
		CalcModel tn = new CalcModel();
		tn.setValue1(value1);
		tn.setValue2(value2);
		tn.setRetVal(value1 - value2);
		return tn;
	}

	@WebMethod
	public CalcModel mul(@WebParam(name = "value1") float value1, @WebParam(name = "value2") float value2) {
		CalcModel tn = new CalcModel();
		tn.setValue1(value1);
		tn.setValue2(value2);
		tn.setRetVal(value1*value2);
		return tn;
	}

	@WebMethod
	public CalcModel div(@WebParam(name = "value1") float value1, @WebParam(name = "value2") float value2) {
		CalcModel tn = new CalcModel();
		tn.setValue1(value1);
		tn.setValue2(value2);
		if (value1 == 0){
			tn.setRetVal(0);
		} else {
			tn.setRetVal(value1 / value2);
		}
		return tn;
	}

}
