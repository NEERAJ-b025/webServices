package com.neeraj.ws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CalcModel implements Serializable {

	private static final long serialVersionUID = -7846083786214239318L;
	private float value1;
	private float value2;
	private float retVal;

	public CalcModel() {
		super();
	}

	public float getValue1() {
		return value1;
	}

	public void setValue1(float value1) {
		this.value1 = value1;
	}

	public float getValue2() {
		return value2;
	}

	public void setValue2(float value2) {
		this.value2 = value2;
	}

	public float getRetVal() { return retVal; }

	public void setRetVal(float retVal) { this.retVal = retVal;}

}
