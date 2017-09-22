# \BisqApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AccountList**](BisqApi.md#AccountList) | **Get** /api/v1/account_list | 
[**CurrencyList**](BisqApi.md#CurrencyList) | **Get** /api/v1/currency_list | 
[**MarketList**](BisqApi.md#MarketList) | **Get** /api/v1/market_list | 
[**MoveFundsToBisqWallet**](BisqApi.md#MoveFundsToBisqWallet) | **Get** /api/v1/move_funds_to_bisq_wallet | 
[**OfferCancel**](BisqApi.md#OfferCancel) | **Delete** /api/v1/offer_cancel | 
[**OfferDetail**](BisqApi.md#OfferDetail) | **Get** /api/v1/offer_detail | 
[**OfferList**](BisqApi.md#OfferList) | **Get** /api/v1/offer_list | 
[**OfferMake**](BisqApi.md#OfferMake) | **Get** /api/v1/offer_make | 
[**OfferTake**](BisqApi.md#OfferTake) | **Get** /api/v1/offer_take | 
[**PaymentReceived**](BisqApi.md#PaymentReceived) | **Get** /api/v1/payment_received | 
[**PaymentStarted**](BisqApi.md#PaymentStarted) | **Get** /api/v1/payment_started | 
[**TradeDetail**](BisqApi.md#TradeDetail) | **Get** /api/v1/trade_detail | 
[**TradeList**](BisqApi.md#TradeList) | **Get** /api/v1/trade_list | 
[**WalletAddresses**](BisqApi.md#WalletAddresses) | **Get** /api/v1/wallet_addresses | 
[**WalletDetail**](BisqApi.md#WalletDetail) | **Get** /api/v1/wallet_detail | 
[**WalletTransactionList**](BisqApi.md#WalletTransactionList) | **Get** /api/v1/wallet_tx_list | 


# **AccountList**
> AccountList AccountList()


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**AccountList**](AccountList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CurrencyList**
> CurrencyList CurrencyList()


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**CurrencyList**](CurrencyList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MarketList**
> MarketList MarketList()


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**MarketList**](MarketList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MoveFundsToBisqWallet**
> bool MoveFundsToBisqWallet(optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tradeId** | **string**|  | 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OfferCancel**
> bool OfferCancel(optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **string**|  | 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OfferDetail**
> OfferDetail OfferDetail(optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **string**|  | 

### Return type

[**OfferDetail**](OfferDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OfferList**
> []OfferDetail OfferList(optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **string**|  | [default to all]
 **status** | **string**|  | [default to all]
 **whose** | **string**|  | [default to all]
 **start** | **int64**|  | [default to 0]
 **end** | **int64**|  | 
 **limit** | **int32**|  | [default to 100]

### Return type

[**[]OfferDetail**](OfferDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OfferMake**
> bool OfferMake(direction, priceType, marketPair, amount, minAmount, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **direction** | **string**|  | 
  **priceType** | **string**|  | [default to FIXED]
  **marketPair** | **string**|  | 
  **amount** | **float32**|  | 
  **minAmount** | **float32**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **direction** | **string**|  | 
 **priceType** | **string**|  | [default to FIXED]
 **marketPair** | **string**|  | 
 **amount** | **float32**|  | 
 **minAmount** | **float32**|  | 
 **paymentAccountId** | **string**|  | 
 **percentageFromMarketPrice** | **float64**|  | [default to 0.0]
 **fixedPrice** | **string**|  | [default to 0]

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OfferTake**
> bool OfferTake(optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **string**|  | 
 **paymentAccountId** | **string**|  | 
 **amount** | **string**|  | 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PaymentReceived**
> bool PaymentReceived(optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tradeId** | **string**|  | 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PaymentStarted**
> bool PaymentStarted(optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tradeId** | **string**|  | 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TradeDetail**
> string TradeDetail(optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tradeId** | **string**|  | 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TradeList**
> string TradeList()


### Required Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WalletAddresses**
> []WalletAddress WalletAddresses(optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **string**|  | [default to BOTH]
 **start** | **int32**|  | [default to 0]
 **limit** | **int32**|  | [default to 100]

### Return type

[**[]WalletAddress**](WalletAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WalletDetail**
> WalletDetails WalletDetail()


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**WalletDetails**](WalletDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WalletTransactionList**
> WalletTransactions WalletTransactionList(optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **int32**|  | [default to 0]
 **end** | **int32**|  | [default to 2147483647]
 **limit** | **int32**|  | [default to 100]

### Return type

[**WalletTransactions**](WalletTransactions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

