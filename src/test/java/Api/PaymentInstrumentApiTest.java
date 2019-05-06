/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiException;
import Model.CreatePaymentInstrumentRequest;
import Model.InlineResponse4001;
import Model.TmsV1PaymentinstrumentsPatch200Response;
import Model.UpdatePaymentInstrumentRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentInstrumentApi
 */
@Ignore
public class PaymentInstrumentApiTest {

    private final PaymentInstrumentApi api = new PaymentInstrumentApi();

    
    /**
     * Create a Payment Instrument
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentInstrumentTest() throws ApiException {
        String profileId = null;
        String vCMerchantId = null;
        String vCCorrelationId = null;
        CreatePaymentInstrumentRequest createPaymentInstrumentRequest = null;
        String clientApplication = null;
        TmsV1PaymentinstrumentsPatch200Response response = api.createPaymentInstrument(profileId, vCMerchantId, vCCorrelationId, createPaymentInstrumentRequest, clientApplication);

        // TODO: test validations
    }
    
    /**
     * Delete a Payment Instrument
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePaymentInstrumentTest() throws ApiException {
        String profileId = null;
        String vCMerchantId = null;
        String vCCorrelationId = null;
        String tokenId = null;
        String clientApplication = null;
        api.deletePaymentInstrument(profileId, vCMerchantId, vCCorrelationId, tokenId, clientApplication);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Payment Instrument
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentInstrumentTest() throws ApiException {
        String profileId = null;
        String vCMerchantId = null;
        String vCCorrelationId = null;
        String tokenId = null;
        String clientApplication = null;
        TmsV1PaymentinstrumentsPatch200Response response = api.getPaymentInstrument(profileId, vCMerchantId, vCCorrelationId, tokenId, clientApplication);

        // TODO: test validations
    }
    
    /**
     * Update a Payment Instrument
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePaymentInstrumentTest() throws ApiException {
        String profileId = null;
        String vCMerchantId = null;
        String vCCorrelationId = null;
        String tokenId = null;
        UpdatePaymentInstrumentRequest updatePaymentInstrumentRequest = null;
        String clientApplication = null;
        TmsV1PaymentinstrumentsPatch200Response response = api.updatePaymentInstrument(profileId, vCMerchantId, vCCorrelationId, tokenId, updatePaymentInstrumentRequest, clientApplication);

        // TODO: test validations
    }
    
}