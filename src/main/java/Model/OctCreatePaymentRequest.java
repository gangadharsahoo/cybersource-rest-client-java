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
import Model.Ptsv2payoutsClientReferenceInformation;
import Model.Ptsv2payoutsMerchantInformation;
import Model.Ptsv2payoutsOrderInformation;
import Model.Ptsv2payoutsPaymentInformation;
import Model.Ptsv2payoutsProcessingInformation;
import Model.Ptsv2payoutsRecipientInformation;
import Model.Ptsv2payoutsSenderInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OctCreatePaymentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-06T11:51:37.745+05:30")
public class OctCreatePaymentRequest {
  @SerializedName("clientReferenceInformation")
  private Ptsv2payoutsClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("orderInformation")
  private Ptsv2payoutsOrderInformation orderInformation = null;

  @SerializedName("merchantInformation")
  private Ptsv2payoutsMerchantInformation merchantInformation = null;

  @SerializedName("recipientInformation")
  private Ptsv2payoutsRecipientInformation recipientInformation = null;

  @SerializedName("senderInformation")
  private Ptsv2payoutsSenderInformation senderInformation = null;

  @SerializedName("processingInformation")
  private Ptsv2payoutsProcessingInformation processingInformation = null;

  @SerializedName("paymentInformation")
  private Ptsv2payoutsPaymentInformation paymentInformation = null;

  public OctCreatePaymentRequest clientReferenceInformation(Ptsv2payoutsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2payoutsClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Ptsv2payoutsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public OctCreatePaymentRequest orderInformation(Ptsv2payoutsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2payoutsOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Ptsv2payoutsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public OctCreatePaymentRequest merchantInformation(Ptsv2payoutsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2payoutsMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(Ptsv2payoutsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public OctCreatePaymentRequest recipientInformation(Ptsv2payoutsRecipientInformation recipientInformation) {
    this.recipientInformation = recipientInformation;
    return this;
  }

   /**
   * Get recipientInformation
   * @return recipientInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2payoutsRecipientInformation getRecipientInformation() {
    return recipientInformation;
  }

  public void setRecipientInformation(Ptsv2payoutsRecipientInformation recipientInformation) {
    this.recipientInformation = recipientInformation;
  }

  public OctCreatePaymentRequest senderInformation(Ptsv2payoutsSenderInformation senderInformation) {
    this.senderInformation = senderInformation;
    return this;
  }

   /**
   * Get senderInformation
   * @return senderInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2payoutsSenderInformation getSenderInformation() {
    return senderInformation;
  }

  public void setSenderInformation(Ptsv2payoutsSenderInformation senderInformation) {
    this.senderInformation = senderInformation;
  }

  public OctCreatePaymentRequest processingInformation(Ptsv2payoutsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2payoutsProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Ptsv2payoutsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public OctCreatePaymentRequest paymentInformation(Ptsv2payoutsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2payoutsPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(Ptsv2payoutsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OctCreatePaymentRequest octCreatePaymentRequest = (OctCreatePaymentRequest) o;
    return Objects.equals(this.clientReferenceInformation, octCreatePaymentRequest.clientReferenceInformation) &&
        Objects.equals(this.orderInformation, octCreatePaymentRequest.orderInformation) &&
        Objects.equals(this.merchantInformation, octCreatePaymentRequest.merchantInformation) &&
        Objects.equals(this.recipientInformation, octCreatePaymentRequest.recipientInformation) &&
        Objects.equals(this.senderInformation, octCreatePaymentRequest.senderInformation) &&
        Objects.equals(this.processingInformation, octCreatePaymentRequest.processingInformation) &&
        Objects.equals(this.paymentInformation, octCreatePaymentRequest.paymentInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, orderInformation, merchantInformation, recipientInformation, senderInformation, processingInformation, paymentInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OctCreatePaymentRequest {\n");
    
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    recipientInformation: ").append(toIndentedString(recipientInformation)).append("\n");
    sb.append("    senderInformation: ").append(toIndentedString(senderInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
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
