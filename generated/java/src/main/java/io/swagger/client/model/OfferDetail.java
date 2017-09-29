/*
 * The Bisq API
 * API for the Bisq exchange
 *
 * OpenAPI spec version: 1
 * Contact: Use the Bisq's project support channels
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
import io.swagger.client.model.PriceDetail;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * OfferDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-29T09:08:19.328Z")
public class OfferDetail {
  @SerializedName("offer_id")
  private String offerId = null;

  /**
   * Gets or Sets direction
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    BUY("BUY"),
    
    SELL("SELL");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("direction")
  private DirectionEnum direction = null;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    UNKNOWN("UNKNOWN"),
    
    OFFER_FEE_PAID("OFFER_FEE_PAID"),
    
    AVAILABLE("AVAILABLE"),
    
    NOT_AVAILABLE("NOT_AVAILABLE"),
    
    REMOVED("REMOVED"),
    
    MAKER_OFFLINE("MAKER_OFFLINE");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("arbitrators")
  private List<String> arbitrators = null;

  @SerializedName("offerer")
  private String offerer = null;

  @SerializedName("btc_amount")
  private String btcAmount = null;

  @SerializedName("min_btc_amount")
  private String minBtcAmount = null;

  @SerializedName("other_amount")
  private String otherAmount = null;

  @SerializedName("other_currency")
  private String otherCurrency = null;

  @SerializedName("price_detail")
  private PriceDetail priceDetail = null;

  public OfferDetail offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Get offerId
   * @return offerId
  **/
  @ApiModelProperty(value = "")
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public OfferDetail direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @ApiModelProperty(value = "")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public OfferDetail state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public OfferDetail created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public OfferDetail arbitrators(List<String> arbitrators) {
    this.arbitrators = arbitrators;
    return this;
  }

  public OfferDetail addArbitratorsItem(String arbitratorsItem) {
    if (this.arbitrators == null) {
      this.arbitrators = new ArrayList<String>();
    }
    this.arbitrators.add(arbitratorsItem);
    return this;
  }

   /**
   * Get arbitrators
   * @return arbitrators
  **/
  @ApiModelProperty(value = "")
  public List<String> getArbitrators() {
    return arbitrators;
  }

  public void setArbitrators(List<String> arbitrators) {
    this.arbitrators = arbitrators;
  }

  public OfferDetail offerer(String offerer) {
    this.offerer = offerer;
    return this;
  }

   /**
   * Get offerer
   * @return offerer
  **/
  @ApiModelProperty(value = "")
  public String getOfferer() {
    return offerer;
  }

  public void setOfferer(String offerer) {
    this.offerer = offerer;
  }

  public OfferDetail btcAmount(String btcAmount) {
    this.btcAmount = btcAmount;
    return this;
  }

   /**
   * Get btcAmount
   * @return btcAmount
  **/
  @ApiModelProperty(value = "")
  public String getBtcAmount() {
    return btcAmount;
  }

  public void setBtcAmount(String btcAmount) {
    this.btcAmount = btcAmount;
  }

  public OfferDetail minBtcAmount(String minBtcAmount) {
    this.minBtcAmount = minBtcAmount;
    return this;
  }

   /**
   * Get minBtcAmount
   * @return minBtcAmount
  **/
  @ApiModelProperty(value = "")
  public String getMinBtcAmount() {
    return minBtcAmount;
  }

  public void setMinBtcAmount(String minBtcAmount) {
    this.minBtcAmount = minBtcAmount;
  }

  public OfferDetail otherAmount(String otherAmount) {
    this.otherAmount = otherAmount;
    return this;
  }

   /**
   * Get otherAmount
   * @return otherAmount
  **/
  @ApiModelProperty(value = "")
  public String getOtherAmount() {
    return otherAmount;
  }

  public void setOtherAmount(String otherAmount) {
    this.otherAmount = otherAmount;
  }

  public OfferDetail otherCurrency(String otherCurrency) {
    this.otherCurrency = otherCurrency;
    return this;
  }

   /**
   * Get otherCurrency
   * @return otherCurrency
  **/
  @ApiModelProperty(value = "")
  public String getOtherCurrency() {
    return otherCurrency;
  }

  public void setOtherCurrency(String otherCurrency) {
    this.otherCurrency = otherCurrency;
  }

  public OfferDetail priceDetail(PriceDetail priceDetail) {
    this.priceDetail = priceDetail;
    return this;
  }

   /**
   * Get priceDetail
   * @return priceDetail
  **/
  @ApiModelProperty(value = "")
  public PriceDetail getPriceDetail() {
    return priceDetail;
  }

  public void setPriceDetail(PriceDetail priceDetail) {
    this.priceDetail = priceDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferDetail offerDetail = (OfferDetail) o;
    return Objects.equals(this.offerId, offerDetail.offerId) &&
        Objects.equals(this.direction, offerDetail.direction) &&
        Objects.equals(this.state, offerDetail.state) &&
        Objects.equals(this.created, offerDetail.created) &&
        Objects.equals(this.arbitrators, offerDetail.arbitrators) &&
        Objects.equals(this.offerer, offerDetail.offerer) &&
        Objects.equals(this.btcAmount, offerDetail.btcAmount) &&
        Objects.equals(this.minBtcAmount, offerDetail.minBtcAmount) &&
        Objects.equals(this.otherAmount, offerDetail.otherAmount) &&
        Objects.equals(this.otherCurrency, offerDetail.otherCurrency) &&
        Objects.equals(this.priceDetail, offerDetail.priceDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, direction, state, created, arbitrators, offerer, btcAmount, minBtcAmount, otherAmount, otherCurrency, priceDetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferDetail {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    arbitrators: ").append(toIndentedString(arbitrators)).append("\n");
    sb.append("    offerer: ").append(toIndentedString(offerer)).append("\n");
    sb.append("    btcAmount: ").append(toIndentedString(btcAmount)).append("\n");
    sb.append("    minBtcAmount: ").append(toIndentedString(minBtcAmount)).append("\n");
    sb.append("    otherAmount: ").append(toIndentedString(otherAmount)).append("\n");
    sb.append("    otherCurrency: ").append(toIndentedString(otherCurrency)).append("\n");
    sb.append("    priceDetail: ").append(toIndentedString(priceDetail)).append("\n");
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

