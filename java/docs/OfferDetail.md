
# OfferDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerId** | **String** |  |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**arbitrators** | **List&lt;String&gt;** |  |  [optional]
**offerer** | **String** |  |  [optional]
**btcAmount** | **String** |  |  [optional]
**minBtcAmount** | **String** |  |  [optional]
**otherAmount** | **String** |  |  [optional]
**otherCurrency** | **String** |  |  [optional]
**priceDetail** | [**PriceDetail**](PriceDetail.md) |  |  [optional]


<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
BUY | &quot;BUY&quot;
SELL | &quot;SELL&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
OFFER_FEE_PAID | &quot;OFFER_FEE_PAID&quot;
AVAILABLE | &quot;AVAILABLE&quot;
NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot;
REMOVED | &quot;REMOVED&quot;
MAKER_OFFLINE | &quot;MAKER_OFFLINE&quot;



