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
import Model.Ptsv2paymentsPaymentInformationBank;
import Model.Ptsv2paymentsPaymentInformationCustomer;
import Model.Ptsv2paymentsidrefundsPaymentInformationCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsidrefundsPaymentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-06T11:51:37.745+05:30")
public class Ptsv2paymentsidrefundsPaymentInformation {
  @SerializedName("card")
  private Ptsv2paymentsidrefundsPaymentInformationCard card = null;

  @SerializedName("bank")
  private Ptsv2paymentsPaymentInformationBank bank = null;

  @SerializedName("customer")
  private Ptsv2paymentsPaymentInformationCustomer customer = null;

  public Ptsv2paymentsidrefundsPaymentInformation card(Ptsv2paymentsidrefundsPaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidrefundsPaymentInformationCard getCard() {
    return card;
  }

  public void setCard(Ptsv2paymentsidrefundsPaymentInformationCard card) {
    this.card = card;
  }

  public Ptsv2paymentsidrefundsPaymentInformation bank(Ptsv2paymentsPaymentInformationBank bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationBank getBank() {
    return bank;
  }

  public void setBank(Ptsv2paymentsPaymentInformationBank bank) {
    this.bank = bank;
  }

  public Ptsv2paymentsidrefundsPaymentInformation customer(Ptsv2paymentsPaymentInformationCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(Ptsv2paymentsPaymentInformationCustomer customer) {
    this.customer = customer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidrefundsPaymentInformation ptsv2paymentsidrefundsPaymentInformation = (Ptsv2paymentsidrefundsPaymentInformation) o;
    return Objects.equals(this.card, ptsv2paymentsidrefundsPaymentInformation.card) &&
        Objects.equals(this.bank, ptsv2paymentsidrefundsPaymentInformation.bank) &&
        Objects.equals(this.customer, ptsv2paymentsidrefundsPaymentInformation.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, bank, customer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidrefundsPaymentInformation {\n");
    
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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

