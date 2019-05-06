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
 * Tmsv1instrumentidentifiersCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-06T11:51:37.745+05:30")
public class Tmsv1instrumentidentifiersCard {
  @SerializedName("number")
  private String number = null;

  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  @SerializedName("securityCode")
  private String securityCode = null;

  public Tmsv1instrumentidentifiersCard number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Credit card number (PAN).
   * @return number
  **/
  @ApiModelProperty(example = "4622943127013705", value = "Credit card number (PAN).")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Tmsv1instrumentidentifiersCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Card expiration month.  Format: &#x60;MM&#x60;. Possible values: &#x60;01&#x60; through &#x60;12&#x60;. 
   * @return expirationMonth
  **/
  @ApiModelProperty(example = "12", value = "Card expiration month.  Format: `MM`. Possible values: `01` through `12`. ")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public Tmsv1instrumentidentifiersCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Card expiration year.  Format: &#x60;YYYY&#x60;. Possible values: &#x60;1900&#x60; through &#x60;2099&#x60;. 
   * @return expirationYear
  **/
  @ApiModelProperty(example = "2022", value = "Card expiration year.  Format: `YYYY`. Possible values: `1900` through `2099`. ")
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  public Tmsv1instrumentidentifiersCard securityCode(String securityCode) {
    this.securityCode = securityCode;
    return this;
  }

   /**
   * Card security code.
   * @return securityCode
  **/
  @ApiModelProperty(example = "838", value = "Card security code.")
  public String getSecurityCode() {
    return securityCode;
  }

  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv1instrumentidentifiersCard tmsv1instrumentidentifiersCard = (Tmsv1instrumentidentifiersCard) o;
    return Objects.equals(this.number, tmsv1instrumentidentifiersCard.number) &&
        Objects.equals(this.expirationMonth, tmsv1instrumentidentifiersCard.expirationMonth) &&
        Objects.equals(this.expirationYear, tmsv1instrumentidentifiersCard.expirationYear) &&
        Objects.equals(this.securityCode, tmsv1instrumentidentifiersCard.securityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, expirationMonth, expirationYear, securityCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv1instrumentidentifiersCard {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
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

