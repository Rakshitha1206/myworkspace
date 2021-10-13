
package com.training;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherService", targetNamespace = "http://ifaces.training.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface WeatherService {


    /**
     * 
     * @param city
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "conditioncurrent", partName = "conditioncurrent")
    @Action(input = "http://ifaces.training.com/WeatherService/getWeatherRequest", output = "http://ifaces.training.com/WeatherService/getWeatherResponse")
    public String getWeather(
        @WebParam(name = "City", partName = "City")
        String city);

}