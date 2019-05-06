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
import Model.ReportingV3ReportSubscriptionsGet200ResponseSubscriptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportingV3ReportSubscriptionsGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-06T11:51:37.745+05:30")
public class ReportingV3ReportSubscriptionsGet200Response {
  @SerializedName("subscriptions")
  private List<ReportingV3ReportSubscriptionsGet200ResponseSubscriptions> subscriptions = null;

  public ReportingV3ReportSubscriptionsGet200Response subscriptions(List<ReportingV3ReportSubscriptionsGet200ResponseSubscriptions> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public ReportingV3ReportSubscriptionsGet200Response addSubscriptionsItem(ReportingV3ReportSubscriptionsGet200ResponseSubscriptions subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<ReportingV3ReportSubscriptionsGet200ResponseSubscriptions>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @ApiModelProperty(value = "")
  public List<ReportingV3ReportSubscriptionsGet200ResponseSubscriptions> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<ReportingV3ReportSubscriptionsGet200ResponseSubscriptions> subscriptions) {
    this.subscriptions = subscriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ReportSubscriptionsGet200Response reportingV3ReportSubscriptionsGet200Response = (ReportingV3ReportSubscriptionsGet200Response) o;
    return Objects.equals(this.subscriptions, reportingV3ReportSubscriptionsGet200Response.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ReportSubscriptionsGet200Response {\n");
    
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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

