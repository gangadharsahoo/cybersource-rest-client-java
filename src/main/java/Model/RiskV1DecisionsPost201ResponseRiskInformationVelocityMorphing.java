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
 * RiskV1DecisionsPost201ResponseRiskInformationVelocityMorphing
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-06T11:51:37.745+05:30")
public class RiskV1DecisionsPost201ResponseRiskInformationVelocityMorphing {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("fieldName")
  private String fieldName = null;

  @SerializedName("informationCode")
  private String informationCode = null;

  public RiskV1DecisionsPost201ResponseRiskInformationVelocityMorphing count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Morphing count. Note The count is not returned for the initial transaction.
   * @return count
  **/
  @ApiModelProperty(value = "Morphing count. Note The count is not returned for the initial transaction.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationVelocityMorphing fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Field name of the morphing element. specified by the setting that you chose in the Velocity Editor. For all possible values, Please refer to Simple Order API Developer Guide  on [CyberSource Business Center](https://ebc2.cybersource.com/ebc2/) - Look for &#39;Reply Fields&#39;: \&quot;decisionReply_morphingElement_#_fieldName\&quot;. 
   * @return fieldName
  **/
  @ApiModelProperty(value = "Field name of the morphing element. specified by the setting that you chose in the Velocity Editor. For all possible values, Please refer to Simple Order API Developer Guide  on [CyberSource Business Center](https://ebc2.cybersource.com/ebc2/) - Look for 'Reply Fields': \"decisionReply_morphingElement_#_fieldName\". ")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationVelocityMorphing informationCode(String informationCode) {
    this.informationCode = informationCode;
    return this;
  }

   /**
   * Identifier that CYBS assigned to the velocity rule specified by the number.
   * @return informationCode
  **/
  @ApiModelProperty(value = "Identifier that CYBS assigned to the velocity rule specified by the number.")
  public String getInformationCode() {
    return informationCode;
  }

  public void setInformationCode(String informationCode) {
    this.informationCode = informationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1DecisionsPost201ResponseRiskInformationVelocityMorphing riskV1DecisionsPost201ResponseRiskInformationVelocityMorphing = (RiskV1DecisionsPost201ResponseRiskInformationVelocityMorphing) o;
    return Objects.equals(this.count, riskV1DecisionsPost201ResponseRiskInformationVelocityMorphing.count) &&
        Objects.equals(this.fieldName, riskV1DecisionsPost201ResponseRiskInformationVelocityMorphing.fieldName) &&
        Objects.equals(this.informationCode, riskV1DecisionsPost201ResponseRiskInformationVelocityMorphing.informationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, fieldName, informationCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1DecisionsPost201ResponseRiskInformationVelocityMorphing {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    informationCode: ").append(toIndentedString(informationCode)).append("\n");
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

