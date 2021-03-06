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


package Model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsProcessingInformationBankTransferOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-06T11:51:37.745+05:30")
public class Ptsv2paymentsProcessingInformationBankTransferOptions {
  @SerializedName("declineAvsFlags")
  private String declineAvsFlags = null;

  @SerializedName("secCode")
  private String secCode = null;

  @SerializedName("terminalCity")
  private String terminalCity = null;

  @SerializedName("terminalState")
  private String terminalState = null;

  @SerializedName("effectiveDate")
  private String effectiveDate = null;

  @SerializedName("partialPaymentId")
  private String partialPaymentId = null;

  @SerializedName("customerMemo")
  private String customerMemo = null;

  @SerializedName("paymentCategoryCode")
  private String paymentCategoryCode = null;

  @SerializedName("settlementMethod")
  private String settlementMethod = null;

  @SerializedName("fraudScreeningLevel")
  private String fraudScreeningLevel = null;

  public Ptsv2paymentsProcessingInformationBankTransferOptions declineAvsFlags(String declineAvsFlags) {
    this.declineAvsFlags = declineAvsFlags;
    return this;
  }

   /**
   * List of AVS flags that cause the request to be declined for AVS reasons. Use a space to separate the flags in the list. Important Make sure that you include the value N in the list if you want to receive declines for the AVS code N. 
   * @return declineAvsFlags
  **/
  @ApiModelProperty(value = "List of AVS flags that cause the request to be declined for AVS reasons. Use a space to separate the flags in the list. Important Make sure that you include the value N in the list if you want to receive declines for the AVS code N. ")
  public String getDeclineAvsFlags() {
    return declineAvsFlags;
  }

  public void setDeclineAvsFlags(String declineAvsFlags) {
    this.declineAvsFlags = declineAvsFlags;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions secCode(String secCode) {
    this.secCode = secCode;
    return this;
  }

   /**
   * Authorization method used for the transaction. See \&quot;SEC Codes,\&quot; page 89.  TeleCheck Accepts only the following values: - **PPD** - **TEL** - **WEB** 
   * @return secCode
  **/
  @ApiModelProperty(value = "Authorization method used for the transaction. See \"SEC Codes,\" page 89.  TeleCheck Accepts only the following values: - **PPD** - **TEL** - **WEB** ")
  public String getSecCode() {
    return secCode;
  }

  public void setSecCode(String secCode) {
    this.secCode = secCode;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions terminalCity(String terminalCity) {
    this.terminalCity = terminalCity;
    return this;
  }

   /**
   * City in which the terminal is located. If more than four alphanumeric characters are submitted, the transaction will be declined.  You cannot include any special characters. 
   * @return terminalCity
  **/
  @ApiModelProperty(value = "City in which the terminal is located. If more than four alphanumeric characters are submitted, the transaction will be declined.  You cannot include any special characters. ")
  public String getTerminalCity() {
    return terminalCity;
  }

  public void setTerminalCity(String terminalCity) {
    this.terminalCity = terminalCity;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions terminalState(String terminalState) {
    this.terminalState = terminalState;
    return this;
  }

   /**
   * State in which the terminal is located. If more than two alphanumeric characters are submitted, the transaction will be declined.  You cannot include any special characters. 
   * @return terminalState
  **/
  @ApiModelProperty(value = "State in which the terminal is located. If more than two alphanumeric characters are submitted, the transaction will be declined.  You cannot include any special characters. ")
  public String getTerminalState() {
    return terminalState;
  }

  public void setTerminalState(String terminalState) {
    this.terminalState = terminalState;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Effective date for the transaction. The effective date must be within 45 days of the current day. If you do not include this value, CyberSource sets the effective date to the next business day.  Format: &#x60;MMDDYYYY&#x60;  Supported only for the CyberSource ACH Service. 
   * @return effectiveDate
  **/
  @ApiModelProperty(value = "Effective date for the transaction. The effective date must be within 45 days of the current day. If you do not include this value, CyberSource sets the effective date to the next business day.  Format: `MMDDYYYY`  Supported only for the CyberSource ACH Service. ")
  public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions partialPaymentId(String partialPaymentId) {
    this.partialPaymentId = partialPaymentId;
    return this;
  }

   /**
   * Identifier for a partial payment or partial credit.  The value for each debit request or credit request must be unique within the scope of the order. See \&quot;Multiple Partial Credits,\&quot; page 41. 
   * @return partialPaymentId
  **/
  @ApiModelProperty(value = "Identifier for a partial payment or partial credit.  The value for each debit request or credit request must be unique within the scope of the order. See \"Multiple Partial Credits,\" page 41. ")
  public String getPartialPaymentId() {
    return partialPaymentId;
  }

  public void setPartialPaymentId(String partialPaymentId) {
    this.partialPaymentId = partialPaymentId;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions customerMemo(String customerMemo) {
    this.customerMemo = customerMemo;
    return this;
  }

   /**
   * Payment related information.  This information is included on the customer’s statement. 
   * @return customerMemo
  **/
  @ApiModelProperty(value = "Payment related information.  This information is included on the customer’s statement. ")
  public String getCustomerMemo() {
    return customerMemo;
  }

  public void setCustomerMemo(String customerMemo) {
    this.customerMemo = customerMemo;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions paymentCategoryCode(String paymentCategoryCode) {
    this.paymentCategoryCode = paymentCategoryCode;
    return this;
  }

   /**
   * Flag that indicates whether to process the payment.  Use with deferred payments. See \&quot;Deferred and Partial Payments,\&quot; page 37.  Possible values: - **0**: Standard debit with immediate payment (default). - **1**: For deferred payments, indicates that this is a deferred payment and that you will send a debit request with &#x60;paymentCategoryCode &#x3D; 2&#x60; in the future. - **2**: For deferred payments, indicates notification to initiate payment.  Chase Paymentech Solutions and TeleCheck Use for deferred and partial payments.  CyberSource ACH Service Not used.  RBS WorldPay Atlanta Not used. 
   * @return paymentCategoryCode
  **/
  @ApiModelProperty(value = "Flag that indicates whether to process the payment.  Use with deferred payments. See \"Deferred and Partial Payments,\" page 37.  Possible values: - **0**: Standard debit with immediate payment (default). - **1**: For deferred payments, indicates that this is a deferred payment and that you will send a debit request with `paymentCategoryCode = 2` in the future. - **2**: For deferred payments, indicates notification to initiate payment.  Chase Paymentech Solutions and TeleCheck Use for deferred and partial payments.  CyberSource ACH Service Not used.  RBS WorldPay Atlanta Not used. ")
  public String getPaymentCategoryCode() {
    return paymentCategoryCode;
  }

  public void setPaymentCategoryCode(String paymentCategoryCode) {
    this.paymentCategoryCode = paymentCategoryCode;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions settlementMethod(String settlementMethod) {
    this.settlementMethod = settlementMethod;
    return this;
  }

   /**
   * Method used for settlement.  Possible values: - **A**: Automated Clearing House (default for credits and for transactions using Canadian dollars) - **F**: Facsimile draft (U.S. dollars only) - **B**: Best possible (U.S. dollars only) (default if the field has not already been configured for your merchant ID)  See \&quot;Settlement Delivery Methods,\&quot; page 44. 
   * @return settlementMethod
  **/
  @ApiModelProperty(value = "Method used for settlement.  Possible values: - **A**: Automated Clearing House (default for credits and for transactions using Canadian dollars) - **F**: Facsimile draft (U.S. dollars only) - **B**: Best possible (U.S. dollars only) (default if the field has not already been configured for your merchant ID)  See \"Settlement Delivery Methods,\" page 44. ")
  public String getSettlementMethod() {
    return settlementMethod;
  }

  public void setSettlementMethod(String settlementMethod) {
    this.settlementMethod = settlementMethod;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions fraudScreeningLevel(String fraudScreeningLevel) {
    this.fraudScreeningLevel = fraudScreeningLevel;
    return this;
  }

   /**
   * Level of fraud screening.  Possible values: - **1**: Validation — default if the field has not already been configured for your merchant ID - **2**: Verification  For a description of this feature and a list of supported processors, see \&quot;Verification and Validation,\&quot; page 24. 
   * @return fraudScreeningLevel
  **/
  @ApiModelProperty(value = "Level of fraud screening.  Possible values: - **1**: Validation — default if the field has not already been configured for your merchant ID - **2**: Verification  For a description of this feature and a list of supported processors, see \"Verification and Validation,\" page 24. ")
  public String getFraudScreeningLevel() {
    return fraudScreeningLevel;
  }

  public void setFraudScreeningLevel(String fraudScreeningLevel) {
    this.fraudScreeningLevel = fraudScreeningLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsProcessingInformationBankTransferOptions ptsv2paymentsProcessingInformationBankTransferOptions = (Ptsv2paymentsProcessingInformationBankTransferOptions) o;
    return Objects.equals(this.declineAvsFlags, ptsv2paymentsProcessingInformationBankTransferOptions.declineAvsFlags) &&
        Objects.equals(this.secCode, ptsv2paymentsProcessingInformationBankTransferOptions.secCode) &&
        Objects.equals(this.terminalCity, ptsv2paymentsProcessingInformationBankTransferOptions.terminalCity) &&
        Objects.equals(this.terminalState, ptsv2paymentsProcessingInformationBankTransferOptions.terminalState) &&
        Objects.equals(this.effectiveDate, ptsv2paymentsProcessingInformationBankTransferOptions.effectiveDate) &&
        Objects.equals(this.partialPaymentId, ptsv2paymentsProcessingInformationBankTransferOptions.partialPaymentId) &&
        Objects.equals(this.customerMemo, ptsv2paymentsProcessingInformationBankTransferOptions.customerMemo) &&
        Objects.equals(this.paymentCategoryCode, ptsv2paymentsProcessingInformationBankTransferOptions.paymentCategoryCode) &&
        Objects.equals(this.settlementMethod, ptsv2paymentsProcessingInformationBankTransferOptions.settlementMethod) &&
        Objects.equals(this.fraudScreeningLevel, ptsv2paymentsProcessingInformationBankTransferOptions.fraudScreeningLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(declineAvsFlags, secCode, terminalCity, terminalState, effectiveDate, partialPaymentId, customerMemo, paymentCategoryCode, settlementMethod, fraudScreeningLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsProcessingInformationBankTransferOptions {\n");
    
    sb.append("    declineAvsFlags: ").append(toIndentedString(declineAvsFlags)).append("\n");
    sb.append("    secCode: ").append(toIndentedString(secCode)).append("\n");
    sb.append("    terminalCity: ").append(toIndentedString(terminalCity)).append("\n");
    sb.append("    terminalState: ").append(toIndentedString(terminalState)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    partialPaymentId: ").append(toIndentedString(partialPaymentId)).append("\n");
    sb.append("    customerMemo: ").append(toIndentedString(customerMemo)).append("\n");
    sb.append("    paymentCategoryCode: ").append(toIndentedString(paymentCategoryCode)).append("\n");
    sb.append("    settlementMethod: ").append(toIndentedString(settlementMethod)).append("\n");
    sb.append("    fraudScreeningLevel: ").append(toIndentedString(fraudScreeningLevel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

