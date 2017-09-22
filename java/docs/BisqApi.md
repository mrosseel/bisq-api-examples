# BisqApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountList**](BisqApi.md#accountList) | **GET** /api/v1/account_list | 
[**currencyList**](BisqApi.md#currencyList) | **GET** /api/v1/currency_list | 
[**marketList**](BisqApi.md#marketList) | **GET** /api/v1/market_list | 
[**moveFundsToBisqWallet**](BisqApi.md#moveFundsToBisqWallet) | **GET** /api/v1/move_funds_to_bisq_wallet | 
[**offerCancel**](BisqApi.md#offerCancel) | **DELETE** /api/v1/offer_cancel | 
[**offerDetail**](BisqApi.md#offerDetail) | **GET** /api/v1/offer_detail | 
[**offerList**](BisqApi.md#offerList) | **GET** /api/v1/offer_list | 
[**offerMake**](BisqApi.md#offerMake) | **GET** /api/v1/offer_make | 
[**offerTake**](BisqApi.md#offerTake) | **GET** /api/v1/offer_take | 
[**paymentReceived**](BisqApi.md#paymentReceived) | **GET** /api/v1/payment_received | 
[**paymentStarted**](BisqApi.md#paymentStarted) | **GET** /api/v1/payment_started | 
[**tradeDetail**](BisqApi.md#tradeDetail) | **GET** /api/v1/trade_detail | 
[**tradeList**](BisqApi.md#tradeList) | **GET** /api/v1/trade_list | 
[**walletAddresses**](BisqApi.md#walletAddresses) | **GET** /api/v1/wallet_addresses | 
[**walletDetail**](BisqApi.md#walletDetail) | **GET** /api/v1/wallet_detail | 
[**walletTransactionList**](BisqApi.md#walletTransactionList) | **GET** /api/v1/wallet_tx_list | 


<a name="accountList"></a>
# **accountList**
> AccountList accountList()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BisqApi;


BisqApi apiInstance = new BisqApi();
try {
    AccountList result = apiInstance.accountList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BisqApi#accountList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountList**](AccountList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="currencyList"></a>
# **currencyList**
> CurrencyList currencyList()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BisqApi;


BisqApi apiInstance = new BisqApi();
try {
    CurrencyList result = apiInstance.currencyList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BisqApi#currencyList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrencyList**](CurrencyList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="marketList"></a>
# **marketList**
> MarketList marketList()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BisqApi;


BisqApi apiInstance = new BisqApi();
try {
    MarketList result = apiInstance.marketList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BisqApi#marketList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MarketList**](MarketList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="moveFundsToBisqWallet"></a>
# **moveFundsToBisqWallet**
> Boolean moveFundsToBisqWallet(tradeId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BisqApi;


BisqApi apiInstance = new BisqApi();
String tradeId = "tradeId_example"; // String | 
try {
    Boolean result = apiInstance.moveFundsToBisqWallet(tradeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BisqApi#moveFundsToBisqWallet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tradeId** | **String**|  | [optional]

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="offerCancel"></a>
# **offerCancel**
> Boolean offerCancel(offerId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BisqApi;


BisqApi apiInstance = new BisqApi();
String offerId = "offerId_example"; // String | 
try {
    Boolean result = apiInstance.offerCancel(offerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BisqApi#offerCancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **String**|  | [optional]

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="offerDetail"></a>
# **offerDetail**
> OfferDetail offerDetail(offerId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BisqApi;


BisqApi apiInstance = new BisqApi();
String offerId = "offerId_example"; // String | 
try {
    OfferDetail result = apiInstance.offerDetail(offerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BisqApi#offerDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **String**|  | [optional]

### Return type

[**OfferDetail**](OfferDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="offerList"></a>
# **offerList**
> List&lt;OfferDetail&gt; offerList(market, status, whose, start, end, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BisqApi;


BisqApi apiInstance = new BisqApi();
String market = "all"; // String | 
String status = "all"; // String | 
String whose = "all"; // String | 
Long start = 0L; // Long | 
Long end = 789L; // Long | 
Integer limit = 100; // Integer | 
try {
    List<OfferDetail> result = apiInstance.offerList(market, status, whose, start, end, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BisqApi#offerList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **String**|  | [optional] [default to all]
 **status** | **String**|  | [optional] [default to all]
 **whose** | **String**|  | [optional] [default to all]
 **start** | **Long**|  | [optional] [default to 0]
 **end** | **Long**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 100]

### Return type

[**List&lt;OfferDetail&gt;**](OfferDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="offerMake"></a>
# **offerMake**
> Boolean offerMake(direction, priceType, marketPair, amount, minAmount, paymentAccountId, percentageFromMarketPrice, fixedPrice)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BisqApi;


BisqApi apiInstance = new BisqApi();
String direction = "direction_example"; // String | 
String priceType = "FIXED"; // String | 
String marketPair = "marketPair_example"; // String | 
BigDecimal amount = new BigDecimal(); // BigDecimal | 
BigDecimal minAmount = new BigDecimal(); // BigDecimal | 
String paymentAccountId = "paymentAccountId_example"; // String | 
Double percentageFromMarketPrice = 3.4D; // Double | 
String fixedPrice = "0"; // String | 
try {
    Boolean result = apiInstance.offerMake(direction, priceType, marketPair, amount, minAmount, paymentAccountId, percentageFromMarketPrice, fixedPrice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BisqApi#offerMake");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **direction** | **String**|  | [enum: BUY, SELL]
 **priceType** | **String**|  | [default to FIXED] [enum: FIXED, PERCENTAGE]
 **marketPair** | **String**|  |
 **amount** | **BigDecimal**|  |
 **minAmount** | **BigDecimal**|  |
 **paymentAccountId** | **String**|  | [optional]
 **percentageFromMarketPrice** | **Double**|  | [optional] [default to 0.0]
 **fixedPrice** | **String**|  | [optional] [default to 0]

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="offerTake"></a>
# **offerTake**
> Boolean offerTake(offerId, paymentAccountId, amount)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BisqApi;


BisqApi apiInstance = new BisqApi();
String offerId = "offerId_example"; // String | 
String paymentAccountId = "paymentAccountId_example"; // String | 
String amount = "amount_example"; // String | 
try {
    Boolean result = apiInstance.offerTake(offerId, paymentAccountId, amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BisqApi#offerTake");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **String**|  | [optional]
 **paymentAccountId** | **String**|  | [optional]
 **amount** | **String**|  | [optional]

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentReceived"></a>
# **paymentReceived**
> Boolean paymentReceived(tradeId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BisqApi;


BisqApi apiInstance = new BisqApi();
String tradeId = "tradeId_example"; // String | 
try {
    Boolean result = apiInstance.paymentReceived(tradeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BisqApi#paymentReceived");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tradeId** | **String**|  | [optional]

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentStarted"></a>
# **paymentStarted**
> Boolean paymentStarted(tradeId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BisqApi;


BisqApi apiInstance = new BisqApi();
String tradeId = "tradeId_example"; // String | 
try {
    Boolean result = apiInstance.paymentStarted(tradeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BisqApi#paymentStarted");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tradeId** | **String**|  | [optional]

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tradeDetail"></a>
# **tradeDetail**
> String tradeDetail(tradeId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BisqApi;


BisqApi apiInstance = new BisqApi();
String tradeId = "tradeId_example"; // String | 
try {
    String result = apiInstance.tradeDetail(tradeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BisqApi#tradeDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tradeId** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tradeList"></a>
# **tradeList**
> String tradeList()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BisqApi;


BisqApi apiInstance = new BisqApi();
try {
    String result = apiInstance.tradeList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BisqApi#tradeList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="walletAddresses"></a>
# **walletAddresses**
> List&lt;WalletAddress&gt; walletAddresses(status, start, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BisqApi;


BisqApi apiInstance = new BisqApi();
String status = "BOTH"; // String | 
Integer start = 0; // Integer | 
Integer limit = 100; // Integer | 
try {
    List<WalletAddress> result = apiInstance.walletAddresses(status, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BisqApi#walletAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**|  | [optional] [default to BOTH]
 **start** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional] [default to 100]

### Return type

[**List&lt;WalletAddress&gt;**](WalletAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="walletDetail"></a>
# **walletDetail**
> WalletDetails walletDetail()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BisqApi;


BisqApi apiInstance = new BisqApi();
try {
    WalletDetails result = apiInstance.walletDetail();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BisqApi#walletDetail");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WalletDetails**](WalletDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="walletTransactionList"></a>
# **walletTransactionList**
> WalletTransactions walletTransactionList(start, end, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BisqApi;


BisqApi apiInstance = new BisqApi();
Integer start = 0; // Integer | 
Integer end = 2147483647; // Integer | 
Integer limit = 100; // Integer | 
try {
    WalletTransactions result = apiInstance.walletTransactionList(start, end, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BisqApi#walletTransactionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**|  | [optional] [default to 0]
 **end** | **Integer**|  | [optional] [default to 2147483647]
 **limit** | **Integer**|  | [optional] [default to 100]

### Return type

[**WalletTransactions**](WalletTransactions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

