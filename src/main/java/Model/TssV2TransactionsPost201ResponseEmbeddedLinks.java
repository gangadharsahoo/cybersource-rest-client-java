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
import Model.PtsV2PaymentsPost201ResponseLinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsPost201ResponseEmbeddedLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-06T11:51:37.745+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedLinks {
  @SerializedName("transactionDetail")
  private PtsV2PaymentsPost201ResponseLinksSelf transactionDetail = null;

  public TssV2TransactionsPost201ResponseEmbeddedLinks transactionDetail(PtsV2PaymentsPost201ResponseLinksSelf transactionDetail) {
    this.transactionDetail = transactionDetail;
    return this;
  }

   /**
   * Get transactionDetail
   * @return transactionDetail
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getTransactionDetail() {
    return transactionDetail;
  }

  public void setTransactionDetail(PtsV2PaymentsPost201ResponseLinksSelf transactionDetail) {
    this.transactionDetail = transactionDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedLinks tssV2TransactionsPost201ResponseEmbeddedLinks = (TssV2TransactionsPost201ResponseEmbeddedLinks) o;
    return Objects.equals(this.transactionDetail, tssV2TransactionsPost201ResponseEmbeddedLinks.transactionDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionDetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedLinks {\n");
    
    sb.append("    transactionDetail: ").append(toIndentedString(transactionDetail)).append("\n");
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

