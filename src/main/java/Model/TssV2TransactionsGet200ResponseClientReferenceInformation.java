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
 * TssV2TransactionsGet200ResponseClientReferenceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-06T11:51:37.745+05:30")
public class TssV2TransactionsGet200ResponseClientReferenceInformation {
  @SerializedName("code")
  private String code = null;

  @SerializedName("applicationVersion")
  private String applicationVersion = null;

  @SerializedName("applicationName")
  private String applicationName = null;

  @SerializedName("applicationUser")
  private String applicationUser = null;

  @SerializedName("comments")
  private String comments = null;

  public TssV2TransactionsGet200ResponseClientReferenceInformation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Client-generated order reference or tracking number. CyberSource recommends that you send a unique value for each transaction so that you can perform meaningful searches for the transaction.  For information about tracking orders, see [Getting Started with CyberSource Advanced for the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/Getting_Started_SCMP/html/wwhelp/wwhimpl/js/html/wwhelp.htm).  **FDC Nashville Global**\\ Certain circumstances can cause the processor to truncate this value to 15 or 17 characters for Level II and Level III processing, which can cause a discrepancy between the value you submit and the value included in some processor reports. 
   * @return code
  **/
  @ApiModelProperty(value = "Client-generated order reference or tracking number. CyberSource recommends that you send a unique value for each transaction so that you can perform meaningful searches for the transaction.  For information about tracking orders, see [Getting Started with CyberSource Advanced for the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/Getting_Started_SCMP/html/wwhelp/wwhimpl/js/html/wwhelp.htm).  **FDC Nashville Global**\\ Certain circumstances can cause the processor to truncate this value to 15 or 17 characters for Level II and Level III processing, which can cause a discrepancy between the value you submit and the value included in some processor reports. ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TssV2TransactionsGet200ResponseClientReferenceInformation applicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return applicationVersion
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getApplicationVersion() {
    return applicationVersion;
  }

  public void setApplicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
  }

  public TssV2TransactionsGet200ResponseClientReferenceInformation applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * The application name of client which is used to submit the request.
   * @return applicationName
  **/
  @ApiModelProperty(value = "The application name of client which is used to submit the request.")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public TssV2TransactionsGet200ResponseClientReferenceInformation applicationUser(String applicationUser) {
    this.applicationUser = applicationUser;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return applicationUser
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getApplicationUser() {
    return applicationUser;
  }

  public void setApplicationUser(String applicationUser) {
    this.applicationUser = applicationUser;
  }

  public TssV2TransactionsGet200ResponseClientReferenceInformation comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Brief description of the order or any comment you wish to add to the order.
   * @return comments
  **/
  @ApiModelProperty(value = "Brief description of the order or any comment you wish to add to the order.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseClientReferenceInformation tssV2TransactionsGet200ResponseClientReferenceInformation = (TssV2TransactionsGet200ResponseClientReferenceInformation) o;
    return Objects.equals(this.code, tssV2TransactionsGet200ResponseClientReferenceInformation.code) &&
        Objects.equals(this.applicationVersion, tssV2TransactionsGet200ResponseClientReferenceInformation.applicationVersion) &&
        Objects.equals(this.applicationName, tssV2TransactionsGet200ResponseClientReferenceInformation.applicationName) &&
        Objects.equals(this.applicationUser, tssV2TransactionsGet200ResponseClientReferenceInformation.applicationUser) &&
        Objects.equals(this.comments, tssV2TransactionsGet200ResponseClientReferenceInformation.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, applicationVersion, applicationName, applicationUser, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseClientReferenceInformation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    applicationUser: ").append(toIndentedString(applicationUser)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

