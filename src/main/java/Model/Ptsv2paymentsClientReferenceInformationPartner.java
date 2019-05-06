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
 * Ptsv2paymentsClientReferenceInformationPartner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-06T11:51:37.745+05:30")
public class Ptsv2paymentsClientReferenceInformationPartner {
  @SerializedName("originalTransactionId")
  private String originalTransactionId = null;

  @SerializedName("developerId")
  private String developerId = null;

  @SerializedName("solutionId")
  private String solutionId = null;

  public Ptsv2paymentsClientReferenceInformationPartner originalTransactionId(String originalTransactionId) {
    this.originalTransactionId = originalTransactionId;
    return this;
  }

   /**
   * Value that links the previous transaction to the current follow-on request. This value is assigned by the client software that is installed on the POS terminal, which makes it available to the terminal’s software and to CyberSource. Therefore, you can use this value to reconcile transactions between CyberSource and the terminal’s software.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX. 
   * @return originalTransactionId
  **/
  @ApiModelProperty(value = "Value that links the previous transaction to the current follow-on request. This value is assigned by the client software that is installed on the POS terminal, which makes it available to the terminal’s software and to CyberSource. Therefore, you can use this value to reconcile transactions between CyberSource and the terminal’s software.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX. ")
  public String getOriginalTransactionId() {
    return originalTransactionId;
  }

  public void setOriginalTransactionId(String originalTransactionId) {
    this.originalTransactionId = originalTransactionId;
  }

  public Ptsv2paymentsClientReferenceInformationPartner developerId(String developerId) {
    this.developerId = developerId;
    return this;
  }

   /**
   * Identifier for the developer that helped integrate a partner solution to CyberSource.  Send this value in all requests that are sent through the partner solutions built by that developer. CyberSource assigns the ID to the developer.  Note When you see a developer ID of 999 in reports, the developer ID that was submitted is incorrect. 
   * @return developerId
  **/
  @ApiModelProperty(value = "Identifier for the developer that helped integrate a partner solution to CyberSource.  Send this value in all requests that are sent through the partner solutions built by that developer. CyberSource assigns the ID to the developer.  Note When you see a developer ID of 999 in reports, the developer ID that was submitted is incorrect. ")
  public String getDeveloperId() {
    return developerId;
  }

  public void setDeveloperId(String developerId) {
    this.developerId = developerId;
  }

  public Ptsv2paymentsClientReferenceInformationPartner solutionId(String solutionId) {
    this.solutionId = solutionId;
    return this;
  }

   /**
   * Identifier for the partner that is integrated to CyberSource.  Send this value in all requests that are sent through the partner solution. CyberSource assigns the ID to the partner.  Note When you see a partner ID of 999 in reports, the partner ID that was submitted is incorrect. 
   * @return solutionId
  **/
  @ApiModelProperty(value = "Identifier for the partner that is integrated to CyberSource.  Send this value in all requests that are sent through the partner solution. CyberSource assigns the ID to the partner.  Note When you see a partner ID of 999 in reports, the partner ID that was submitted is incorrect. ")
  public String getSolutionId() {
    return solutionId;
  }

  public void setSolutionId(String solutionId) {
    this.solutionId = solutionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsClientReferenceInformationPartner ptsv2paymentsClientReferenceInformationPartner = (Ptsv2paymentsClientReferenceInformationPartner) o;
    return Objects.equals(this.originalTransactionId, ptsv2paymentsClientReferenceInformationPartner.originalTransactionId) &&
        Objects.equals(this.developerId, ptsv2paymentsClientReferenceInformationPartner.developerId) &&
        Objects.equals(this.solutionId, ptsv2paymentsClientReferenceInformationPartner.solutionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalTransactionId, developerId, solutionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsClientReferenceInformationPartner {\n");
    
    sb.append("    originalTransactionId: ").append(toIndentedString(originalTransactionId)).append("\n");
    sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
    sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
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

