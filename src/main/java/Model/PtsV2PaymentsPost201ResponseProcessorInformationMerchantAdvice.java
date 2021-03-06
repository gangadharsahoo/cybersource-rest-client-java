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
 * PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-06T11:51:37.745+05:30")
public class PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice {
  @SerializedName("code")
  private String code = null;

  @SerializedName("codeRaw")
  private String codeRaw = null;

  public PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Reason the recurring payment transaction was declined. For some processors, this field is used only for Mastercard. For other processors, this field is used for Visa and Mastercard. And for other processors, this field is not implemented.  Possible values:   - **00**: Response not provided.  - **01**: New account information is available. Obtain the new information.  - **02**: Try again later.  - **03**: Do not try again. Obtain another type of payment from the customer.  - **04**: Problem with a token or a partial shipment indicator.  - **21**: Recurring payment cancellation service.  - **99**: An unknown value was returned from the processor. 
   * @return code
  **/
  @ApiModelProperty(value = "Reason the recurring payment transaction was declined. For some processors, this field is used only for Mastercard. For other processors, this field is used for Visa and Mastercard. And for other processors, this field is not implemented.  Possible values:   - **00**: Response not provided.  - **01**: New account information is available. Obtain the new information.  - **02**: Try again later.  - **03**: Do not try again. Obtain another type of payment from the customer.  - **04**: Problem with a token or a partial shipment indicator.  - **21**: Recurring payment cancellation service.  - **99**: An unknown value was returned from the processor. ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice codeRaw(String codeRaw) {
    this.codeRaw = codeRaw;
    return this;
  }

   /**
   * Raw merchant advice code sent directly from the processor. This field is used only for Mastercard.  For processor-specific information, see the auth_merchant_advice_code_raw field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return codeRaw
  **/
  @ApiModelProperty(value = "Raw merchant advice code sent directly from the processor. This field is used only for Mastercard.  For processor-specific information, see the auth_merchant_advice_code_raw field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getCodeRaw() {
    return codeRaw;
  }

  public void setCodeRaw(String codeRaw) {
    this.codeRaw = codeRaw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice ptsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice = (PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice) o;
    return Objects.equals(this.code, ptsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice.code) &&
        Objects.equals(this.codeRaw, ptsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice.codeRaw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, codeRaw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeRaw: ").append(toIndentedString(codeRaw)).append("\n");
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

