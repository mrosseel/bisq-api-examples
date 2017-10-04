# TheBisqApi.OfferDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerId** | **String** |  | [optional] 
**direction** | **String** |  | [optional] 
**state** | **String** |  | [optional] 
**created** | **Date** |  | [optional] 
**arbitrators** | **[String]** |  | [optional] 
**offerer** | **String** |  | [optional] 
**btcAmount** | **String** |  | [optional] 
**minBtcAmount** | **String** |  | [optional] 
**otherAmount** | **String** |  | [optional] 
**otherCurrency** | **String** |  | [optional] 
**priceDetail** | [**PriceDetail**](PriceDetail.md) |  | [optional] 


<a name="DirectionEnum"></a>
## Enum: DirectionEnum


* `BUY` (value: `"BUY"`)

* `SELL` (value: `"SELL"`)




<a name="StateEnum"></a>
## Enum: StateEnum


* `UNKNOWN` (value: `"UNKNOWN"`)

* `OFFER_FEE_PAID` (value: `"OFFER_FEE_PAID"`)

* `AVAILABLE` (value: `"AVAILABLE"`)

* `NOT_AVAILABLE` (value: `"NOT_AVAILABLE"`)

* `REMOVED` (value: `"REMOVED"`)

* `MAKER_OFFLINE` (value: `"MAKER_OFFLINE"`)




