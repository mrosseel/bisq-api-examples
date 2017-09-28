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
import io.swagger.client.model.Currency;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CurrencyList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T16:38:11.248+02:00")
public class CurrencyList {
  @SerializedName("currencies")
  private List<Currency> currencies = null;

  public CurrencyList currencies(List<Currency> currencies) {
    this.currencies = currencies;
    return this;
  }

  public CurrencyList addCurrenciesItem(Currency currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new ArrayList<Currency>();
    }
    this.currencies.add(currenciesItem);
    return this;
  }

   /**
   * Get currencies
   * @return currencies
  **/
  @ApiModelProperty(value = "")
  public List<Currency> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(List<Currency> currencies) {
    this.currencies = currencies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyList currencyList = (CurrencyList) o;
    return Objects.equals(this.currencies, currencyList.currencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyList {\n");
    
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
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

