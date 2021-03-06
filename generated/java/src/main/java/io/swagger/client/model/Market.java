/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Market
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T08:37:33.189Z")
public class Market {
  @SerializedName("pair")
  private String pair = null;

  @SerializedName("lsymbol")
  private String lsymbol = null;

  @SerializedName("rsymbol")
  private String rsymbol = null;

   /**
   * Get pair
   * @return pair
  **/
  @ApiModelProperty(value = "")
  public String getPair() {
    return pair;
  }

   /**
   * Get lsymbol
   * @return lsymbol
  **/
  @ApiModelProperty(value = "")
  public String getLsymbol() {
    return lsymbol;
  }

   /**
   * Get rsymbol
   * @return rsymbol
  **/
  @ApiModelProperty(value = "")
  public String getRsymbol() {
    return rsymbol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Market market = (Market) o;
    return Objects.equals(this.pair, market.pair) &&
        Objects.equals(this.lsymbol, market.lsymbol) &&
        Objects.equals(this.rsymbol, market.rsymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pair, lsymbol, rsymbol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Market {\n");
    
    sb.append("    pair: ").append(toIndentedString(pair)).append("\n");
    sb.append("    lsymbol: ").append(toIndentedString(lsymbol)).append("\n");
    sb.append("    rsymbol: ").append(toIndentedString(rsymbol)).append("\n");
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

