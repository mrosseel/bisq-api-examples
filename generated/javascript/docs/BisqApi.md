# TheBisqApi.BisqApi

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
```javascript
import TheBisqApi from 'the_bisq_api';

let apiInstance = new TheBisqApi.BisqApi();

apiInstance.accountList((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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
```javascript
import TheBisqApi from 'the_bisq_api';

let apiInstance = new TheBisqApi.BisqApi();

apiInstance.currencyList((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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
```javascript
import TheBisqApi from 'the_bisq_api';

let apiInstance = new TheBisqApi.BisqApi();

apiInstance.marketList((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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
> &#39;Boolean&#39; moveFundsToBisqWallet(opts)



### Example
```javascript
import TheBisqApi from 'the_bisq_api';

let apiInstance = new TheBisqApi.BisqApi();

let opts = { 
  'tradeId': "tradeId_example" // String | 
};

apiInstance.moveFundsToBisqWallet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tradeId** | **String**|  | [optional] 

### Return type

**&#39;Boolean&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="offerCancel"></a>
# **offerCancel**
> &#39;Boolean&#39; offerCancel(opts)



### Example
```javascript
import TheBisqApi from 'the_bisq_api';

let apiInstance = new TheBisqApi.BisqApi();

let opts = { 
  'offerId': "offerId_example" // String | 
};

apiInstance.offerCancel(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **String**|  | [optional] 

### Return type

**&#39;Boolean&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="offerDetail"></a>
# **offerDetail**
> OfferDetail offerDetail(opts)



### Example
```javascript
import TheBisqApi from 'the_bisq_api';

let apiInstance = new TheBisqApi.BisqApi();

let opts = { 
  'offerId': "offerId_example" // String | 
};

apiInstance.offerDetail(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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
> [OfferDetail] offerList(opts)



### Example
```javascript
import TheBisqApi from 'the_bisq_api';

let apiInstance = new TheBisqApi.BisqApi();

let opts = { 
  'market': "all", // String | 
  'status': "all", // String | 
  'whose': "all", // String | 
  'start': 0, // Number | 
  'end': 789, // Number | 
  'limit': 100 // Number | 
};

apiInstance.offerList(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **String**|  | [optional] [default to all]
 **status** | **String**|  | [optional] [default to all]
 **whose** | **String**|  | [optional] [default to all]
 **start** | **Number**|  | [optional] [default to 0]
 **end** | **Number**|  | [optional] 
 **limit** | **Number**|  | [optional] [default to 100]

### Return type

[**[OfferDetail]**](OfferDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="offerMake"></a>
# **offerMake**
> &#39;Boolean&#39; offerMake(direction, priceType, marketPair, amount, minAmount, opts)



### Example
```javascript
import TheBisqApi from 'the_bisq_api';

let apiInstance = new TheBisqApi.BisqApi();

let direction = "direction_example"; // String | 

let priceType = "FIXED"; // String | 

let marketPair = "marketPair_example"; // String | 

let amount = 3.4; // Number | 

let minAmount = 3.4; // Number | 

let opts = { 
  'paymentAccountId': "paymentAccountId_example", // String | 
  'percentageFromMarketPrice': 0.0, // Number | 
  'fixedPrice': "0" // String | 
};

apiInstance.offerMake(direction, priceType, marketPair, amount, minAmount, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **direction** | **String**|  | 
 **priceType** | **String**|  | [default to FIXED]
 **marketPair** | **String**|  | 
 **amount** | **Number**|  | 
 **minAmount** | **Number**|  | 
 **paymentAccountId** | **String**|  | [optional] 
 **percentageFromMarketPrice** | **Number**|  | [optional] [default to 0.0]
 **fixedPrice** | **String**|  | [optional] [default to 0]

### Return type

**&#39;Boolean&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="offerTake"></a>
# **offerTake**
> &#39;Boolean&#39; offerTake(opts)



### Example
```javascript
import TheBisqApi from 'the_bisq_api';

let apiInstance = new TheBisqApi.BisqApi();

let opts = { 
  'offerId': "offerId_example", // String | 
  'paymentAccountId': "paymentAccountId_example", // String | 
  'amount': "amount_example" // String | 
};

apiInstance.offerTake(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **String**|  | [optional] 
 **paymentAccountId** | **String**|  | [optional] 
 **amount** | **String**|  | [optional] 

### Return type

**&#39;Boolean&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentReceived"></a>
# **paymentReceived**
> &#39;Boolean&#39; paymentReceived(opts)



### Example
```javascript
import TheBisqApi from 'the_bisq_api';

let apiInstance = new TheBisqApi.BisqApi();

let opts = { 
  'tradeId': "tradeId_example" // String | 
};

apiInstance.paymentReceived(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tradeId** | **String**|  | [optional] 

### Return type

**&#39;Boolean&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentStarted"></a>
# **paymentStarted**
> &#39;Boolean&#39; paymentStarted(opts)



### Example
```javascript
import TheBisqApi from 'the_bisq_api';

let apiInstance = new TheBisqApi.BisqApi();

let opts = { 
  'tradeId': "tradeId_example" // String | 
};

apiInstance.paymentStarted(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tradeId** | **String**|  | [optional] 

### Return type

**&#39;Boolean&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tradeDetail"></a>
# **tradeDetail**
> &#39;String&#39; tradeDetail(opts)



### Example
```javascript
import TheBisqApi from 'the_bisq_api';

let apiInstance = new TheBisqApi.BisqApi();

let opts = { 
  'tradeId': "tradeId_example" // String | 
};

apiInstance.tradeDetail(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tradeId** | **String**|  | [optional] 

### Return type

**&#39;String&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tradeList"></a>
# **tradeList**
> &#39;String&#39; tradeList()



### Example
```javascript
import TheBisqApi from 'the_bisq_api';

let apiInstance = new TheBisqApi.BisqApi();

apiInstance.tradeList((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters
This endpoint does not need any parameter.

### Return type

**&#39;String&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="walletAddresses"></a>
# **walletAddresses**
> [WalletAddress] walletAddresses(opts)



### Example
```javascript
import TheBisqApi from 'the_bisq_api';

let apiInstance = new TheBisqApi.BisqApi();

let opts = { 
  'status': "BOTH", // String | 
  'start': 0, // Number | 
  'limit': 100 // Number | 
};

apiInstance.walletAddresses(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**|  | [optional] [default to BOTH]
 **start** | **Number**|  | [optional] [default to 0]
 **limit** | **Number**|  | [optional] [default to 100]

### Return type

[**[WalletAddress]**](WalletAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="walletDetail"></a>
# **walletDetail**
> WalletDetails walletDetail()



### Example
```javascript
import TheBisqApi from 'the_bisq_api';

let apiInstance = new TheBisqApi.BisqApi();

apiInstance.walletDetail((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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
> WalletTransactions walletTransactionList(opts)



### Example
```javascript
import TheBisqApi from 'the_bisq_api';

let apiInstance = new TheBisqApi.BisqApi();

let opts = { 
  'start': 0, // Number | 
  'end': 2147483647, // Number | 
  'limit': 100 // Number | 
};

apiInstance.walletTransactionList(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Number**|  | [optional] [default to 0]
 **end** | **Number**|  | [optional] [default to 2147483647]
 **limit** | **Number**|  | [optional] [default to 100]

### Return type

[**WalletTransactions**](WalletTransactions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

