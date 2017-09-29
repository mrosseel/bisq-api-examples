/*
 * The Bisq API
 * API for the bisq exchange
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PaymentAccountPayload;
import java.io.IOException;

/**
 * ContractData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-29T08:03:36.756Z")
public class ContractData {
  @SerializedName("contractData")
  private PaymentAccountPayload contractData = null;

  public ContractData contractData(PaymentAccountPayload contractData) {
    this.contractData = contractData;
    return this;
  }

   /**
   * Get contractData
   * @return contractData
  **/
  @ApiModelProperty(value = "")
  public PaymentAccountPayload getContractData() {
    return contractData;
  }

  public void setContractData(PaymentAccountPayload contractData) {
    this.contractData = contractData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractData contractData = (ContractData) o;
    return Objects.equals(this.contractData, contractData.contractData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractData {\n");
    
    sb.append("    contractData: ").append(toIndentedString(contractData)).append("\n");
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
