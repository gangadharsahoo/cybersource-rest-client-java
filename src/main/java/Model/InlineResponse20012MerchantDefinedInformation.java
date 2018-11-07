/*
 * CyberSource Flex API
 * Simple PAN tokenization service
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
 * InlineResponse20012MerchantDefinedInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T18:13:53.731+05:30")
public class InlineResponse20012MerchantDefinedInformation {
  @SerializedName("key")
  private String key = null;

  @SerializedName("value")
  private String value = null;

  public InlineResponse20012MerchantDefinedInformation key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return key
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public InlineResponse20012MerchantDefinedInformation value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return value
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012MerchantDefinedInformation inlineResponse20012MerchantDefinedInformation = (InlineResponse20012MerchantDefinedInformation) o;
    return Objects.equals(this.key, inlineResponse20012MerchantDefinedInformation.key) &&
        Objects.equals(this.value, inlineResponse20012MerchantDefinedInformation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012MerchantDefinedInformation {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
