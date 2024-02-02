package com.soap.service;

import com.soap.client.SoapClient;
import com.soap.wsdl.AddResponse;
import com.soap.wsdl.MultiplyResponse;
import com.soap.wsdl.DivideResponse;
import com.soap.wsdl.SubtractResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Represents the manager of the application.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */

@Service
public class Services {
    @Autowired
    private SoapClient soapClient;

    /**
     * Get AddResponse.
     *
     * @param numberA representing an Integer.
     * @param numberB representing an Integer.
     * @return a AddResponse object.
     */
    public AddResponse addResponse(int numberA, int numberB) {
        return soapClient.getAddResponse(numberA, numberB);
    }

    /**
     * Get SubtractResponse.
     *
     * @param numberA representing an Integer.
     * @param numberB representing an Integer.
     * @return a SubtractResponse object.
     */
    public SubtractResponse subtractResponse(int numberA, int numberB) {
        return soapClient.getSubstractResponse(numberA, numberB);
    }
    /**
     * Get MultiplyResponse.
     *
     * @param numberA representing an Integer.
     * @param numberB representing an Integer.
     * @return a MultiplyResponse object.
     */
    public MultiplyResponse multiplyResponse(int numberA, int numberB) {
        return soapClient.getMultiplyResponse(numberA, numberB);
    }

    /**
     * Get DivideResponse.
     *
     * @param numberA representing an Integer.
     * @param numberB representing an Integer.
     * @return a DivideResponse object.
     */
    public DivideResponse divideResponse(int numberA, int numberB) {
        return soapClient.getDivideResponse(numberA, numberB);
    }
}