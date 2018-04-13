
# OfferDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptedBankIds** | **List&lt;String&gt;** |  |  [optional]
**acceptedCountryCodes** | **List&lt;String&gt;** |  |  [optional]
**amount** | **Long** |  |  [optional]
**arbitratorNodeAddresses** | **List&lt;String&gt;** |  |  [optional]
**bankId** | **String** |  |  [optional]
**baseCurrencyCode** | **String** |  |  [optional]
**blockHeightAtOfferCreation** | **Long** |  |  [optional]
**buyerSecurityDeposit** | **Long** |  |  [optional]
**counterCurrencyCode** | **String** |  |  [optional]
**countryCode** | **String** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) |  |  [optional]
**hashOfChallenge** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**isCurrencyForMakerFeeBtc** | **Boolean** |  |  [optional]
**isPrivateOffer** | **Boolean** |  |  [optional]
**lowerClosePrice** | **Long** |  |  [optional]
**makerFee** | **Long** |  |  [optional]
**makerPaymentAccountId** | **String** |  |  [optional]
**marketPriceMargin** | **Double** |  |  [optional]
**maxTradeLimit** | **Long** |  |  [optional]
**maxTradePeriod** | **Long** |  |  [optional]
**minAmount** | **Long** |  |  [optional]
**offerFeePaymentTxId** | **String** |  |  [optional]
**ownerNodeAddress** | **String** |  |  [optional]
**paymentMethodId** | **String** |  |  [optional]
**price** | **Long** |  |  [optional]
**protocolVersion** | **Integer** |  |  [optional]
**sellerSecurityDeposit** | **Long** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**txFee** | **Long** |  |  [optional]
**upperClosePrice** | **Long** |  |  [optional]
**useAutoClose** | **Boolean** |  |  [optional]
**useMarketBasedPrice** | **Boolean** |  |  [optional]
**useReOpenAfterAutoClose** | **Boolean** |  |  [optional]
**versionNr** | **String** |  |  [optional]


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



