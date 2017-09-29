# Swagger\Client\BisqApi

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


# **accountList**
> \Swagger\Client\Model\AccountList accountList()



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi(new \Http\Adapter\Guzzle6\Client());

try {
    $result = $api_instance->accountList();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->accountList: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\AccountList**](../Model/AccountList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **currencyList**
> \Swagger\Client\Model\CurrencyList currencyList()



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi(new \Http\Adapter\Guzzle6\Client());

try {
    $result = $api_instance->currencyList();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->currencyList: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\CurrencyList**](../Model/CurrencyList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **marketList**
> \Swagger\Client\Model\MarketList marketList()



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi(new \Http\Adapter\Guzzle6\Client());

try {
    $result = $api_instance->marketList();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->marketList: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\MarketList**](../Model/MarketList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **moveFundsToBisqWallet**
> bool moveFundsToBisqWallet($trade_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi(new \Http\Adapter\Guzzle6\Client());
$trade_id = "trade_id_example"; // string | 

try {
    $result = $api_instance->moveFundsToBisqWallet($trade_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->moveFundsToBisqWallet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trade_id** | **string**|  | [optional]

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **offerCancel**
> bool offerCancel($offer_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi(new \Http\Adapter\Guzzle6\Client());
$offer_id = "offer_id_example"; // string | 

try {
    $result = $api_instance->offerCancel($offer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->offerCancel: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offer_id** | **string**|  | [optional]

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **offerDetail**
> \Swagger\Client\Model\OfferDetail offerDetail($offer_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi(new \Http\Adapter\Guzzle6\Client());
$offer_id = "offer_id_example"; // string | 

try {
    $result = $api_instance->offerDetail($offer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->offerDetail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offer_id** | **string**|  | [optional]

### Return type

[**\Swagger\Client\Model\OfferDetail**](../Model/OfferDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **offerList**
> \Swagger\Client\Model\OfferDetail[] offerList($market, $status, $whose, $start, $end, $limit)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi(new \Http\Adapter\Guzzle6\Client());
$market = "all"; // string | 
$status = "all"; // string | 
$whose = "all"; // string | 
$start = 0; // int | 
$end = 789; // int | 
$limit = 100; // int | 

try {
    $result = $api_instance->offerList($market, $status, $whose, $start, $end, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->offerList: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **string**|  | [optional] [default to all]
 **status** | **string**|  | [optional] [default to all]
 **whose** | **string**|  | [optional] [default to all]
 **start** | **int**|  | [optional] [default to 0]
 **end** | **int**|  | [optional]
 **limit** | **int**|  | [optional] [default to 100]

### Return type

[**\Swagger\Client\Model\OfferDetail[]**](../Model/OfferDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **offerMake**
> bool offerMake($direction, $price_type, $market_pair, $amount, $min_amount, $payment_account_id, $percentage_from_market_price, $fixed_price)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi(new \Http\Adapter\Guzzle6\Client());
$direction = "direction_example"; // string | 
$price_type = "FIXED"; // string | 
$market_pair = "market_pair_example"; // string | 
$amount = 3.4; // float | 
$min_amount = 3.4; // float | 
$payment_account_id = "payment_account_id_example"; // string | 
$percentage_from_market_price = 0.0; // double | 
$fixed_price = "0"; // string | 

try {
    $result = $api_instance->offerMake($direction, $price_type, $market_pair, $amount, $min_amount, $payment_account_id, $percentage_from_market_price, $fixed_price);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->offerMake: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **direction** | **string**|  |
 **price_type** | **string**|  | [default to FIXED]
 **market_pair** | **string**|  |
 **amount** | **float**|  |
 **min_amount** | **float**|  |
 **payment_account_id** | **string**|  | [optional]
 **percentage_from_market_price** | **double**|  | [optional] [default to 0.0]
 **fixed_price** | **string**|  | [optional] [default to 0]

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **offerTake**
> bool offerTake($offer_id, $payment_account_id, $amount)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi(new \Http\Adapter\Guzzle6\Client());
$offer_id = "offer_id_example"; // string | 
$payment_account_id = "payment_account_id_example"; // string | 
$amount = "amount_example"; // string | 

try {
    $result = $api_instance->offerTake($offer_id, $payment_account_id, $amount);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->offerTake: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offer_id** | **string**|  | [optional]
 **payment_account_id** | **string**|  | [optional]
 **amount** | **string**|  | [optional]

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **paymentReceived**
> bool paymentReceived($trade_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi(new \Http\Adapter\Guzzle6\Client());
$trade_id = "trade_id_example"; // string | 

try {
    $result = $api_instance->paymentReceived($trade_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->paymentReceived: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trade_id** | **string**|  | [optional]

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **paymentStarted**
> bool paymentStarted($trade_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi(new \Http\Adapter\Guzzle6\Client());
$trade_id = "trade_id_example"; // string | 

try {
    $result = $api_instance->paymentStarted($trade_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->paymentStarted: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trade_id** | **string**|  | [optional]

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **tradeDetail**
> string tradeDetail($trade_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi(new \Http\Adapter\Guzzle6\Client());
$trade_id = "trade_id_example"; // string | 

try {
    $result = $api_instance->tradeDetail($trade_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->tradeDetail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trade_id** | **string**|  | [optional]

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **tradeList**
> string tradeList()



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi(new \Http\Adapter\Guzzle6\Client());

try {
    $result = $api_instance->tradeList();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->tradeList: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **walletAddresses**
> \Swagger\Client\Model\WalletAddress[] walletAddresses($status, $start, $limit)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi(new \Http\Adapter\Guzzle6\Client());
$status = "BOTH"; // string | 
$start = 0; // int | 
$limit = 100; // int | 

try {
    $result = $api_instance->walletAddresses($status, $start, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->walletAddresses: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **string**|  | [optional] [default to BOTH]
 **start** | **int**|  | [optional] [default to 0]
 **limit** | **int**|  | [optional] [default to 100]

### Return type

[**\Swagger\Client\Model\WalletAddress[]**](../Model/WalletAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **walletDetail**
> \Swagger\Client\Model\WalletDetails walletDetail()



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi(new \Http\Adapter\Guzzle6\Client());

try {
    $result = $api_instance->walletDetail();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->walletDetail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\WalletDetails**](../Model/WalletDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **walletTransactionList**
> \Swagger\Client\Model\WalletTransactions walletTransactionList($start, $end, $limit)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi(new \Http\Adapter\Guzzle6\Client());
$start = 0; // int | 
$end = 2147483647; // int | 
$limit = 100; // int | 

try {
    $result = $api_instance->walletTransactionList($start, $end, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->walletTransactionList: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **int**|  | [optional] [default to 0]
 **end** | **int**|  | [optional] [default to 2147483647]
 **limit** | **int**|  | [optional] [default to 100]

### Return type

[**\Swagger\Client\Model\WalletTransactions**](../Model/WalletTransactions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

