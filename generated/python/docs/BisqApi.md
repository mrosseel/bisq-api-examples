# swagger_client.BisqApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**account_list**](BisqApi.md#account_list) | **GET** /api/v1/account_list | 
[**currency_list**](BisqApi.md#currency_list) | **GET** /api/v1/currency_list | 
[**market_list**](BisqApi.md#market_list) | **GET** /api/v1/market_list | 
[**move_funds_to_bisq_wallet**](BisqApi.md#move_funds_to_bisq_wallet) | **GET** /api/v1/move_funds_to_bisq_wallet | 
[**offer_cancel**](BisqApi.md#offer_cancel) | **DELETE** /api/v1/offer_cancel | 
[**offer_detail**](BisqApi.md#offer_detail) | **GET** /api/v1/offer_detail | 
[**offer_list**](BisqApi.md#offer_list) | **GET** /api/v1/offer_list | 
[**offer_make**](BisqApi.md#offer_make) | **GET** /api/v1/offer_make | 
[**offer_take**](BisqApi.md#offer_take) | **GET** /api/v1/offer_take | 
[**payment_received**](BisqApi.md#payment_received) | **GET** /api/v1/payment_received | 
[**payment_started**](BisqApi.md#payment_started) | **GET** /api/v1/payment_started | 
[**trade_detail**](BisqApi.md#trade_detail) | **GET** /api/v1/trade_detail | 
[**trade_list**](BisqApi.md#trade_list) | **GET** /api/v1/trade_list | 
[**wallet_addresses**](BisqApi.md#wallet_addresses) | **GET** /api/v1/wallet_addresses | 
[**wallet_detail**](BisqApi.md#wallet_detail) | **GET** /api/v1/wallet_detail | 
[**wallet_transaction_list**](BisqApi.md#wallet_transaction_list) | **GET** /api/v1/wallet_tx_list | 


# **account_list**
> AccountList account_list()



### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BisqApi()

try: 
    api_response = api_instance.account_list()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BisqApi->account_list: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **currency_list**
> CurrencyList currency_list()



### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BisqApi()

try: 
    api_response = api_instance.currency_list()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BisqApi->currency_list: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **market_list**
> MarketList market_list()



### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BisqApi()

try: 
    api_response = api_instance.market_list()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BisqApi->market_list: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_funds_to_bisq_wallet**
> bool move_funds_to_bisq_wallet(trade_id=trade_id)



### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BisqApi()
trade_id = 'trade_id_example' # str |  (optional)

try: 
    api_response = api_instance.move_funds_to_bisq_wallet(trade_id=trade_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BisqApi->move_funds_to_bisq_wallet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trade_id** | **str**|  | [optional] 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **offer_cancel**
> bool offer_cancel(offer_id=offer_id)



### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BisqApi()
offer_id = 'offer_id_example' # str |  (optional)

try: 
    api_response = api_instance.offer_cancel(offer_id=offer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BisqApi->offer_cancel: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offer_id** | **str**|  | [optional] 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **offer_detail**
> OfferDetail offer_detail(offer_id=offer_id)



### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BisqApi()
offer_id = 'offer_id_example' # str |  (optional)

try: 
    api_response = api_instance.offer_detail(offer_id=offer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BisqApi->offer_detail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offer_id** | **str**|  | [optional] 

### Return type

[**OfferDetail**](OfferDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **offer_list**
> list[OfferDetail] offer_list(market=market, status=status, whose=whose, start=start, end=end, limit=limit)



### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BisqApi()
market = 'all' # str |  (optional) (default to all)
status = 'all' # str |  (optional) (default to all)
whose = 'all' # str |  (optional) (default to all)
start = 0 # int |  (optional) (default to 0)
end = 789 # int |  (optional)
limit = 100 # int |  (optional) (default to 100)

try: 
    api_response = api_instance.offer_list(market=market, status=status, whose=whose, start=start, end=end, limit=limit)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BisqApi->offer_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **str**|  | [optional] [default to all]
 **status** | **str**|  | [optional] [default to all]
 **whose** | **str**|  | [optional] [default to all]
 **start** | **int**|  | [optional] [default to 0]
 **end** | **int**|  | [optional] 
 **limit** | **int**|  | [optional] [default to 100]

### Return type

[**list[OfferDetail]**](OfferDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **offer_make**
> bool offer_make(direction, price_type, market_pair, amount, min_amount, payment_account_id=payment_account_id, percentage_from_market_price=percentage_from_market_price, fixed_price=fixed_price)



### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BisqApi()
direction = 'direction_example' # str | 
price_type = 'FIXED' # str |  (default to FIXED)
market_pair = 'market_pair_example' # str | 
amount = 3.4 # float | 
min_amount = 3.4 # float | 
payment_account_id = 'payment_account_id_example' # str |  (optional)
percentage_from_market_price = 0.0 # float |  (optional) (default to 0.0)
fixed_price = '0' # str |  (optional) (default to 0)

try: 
    api_response = api_instance.offer_make(direction, price_type, market_pair, amount, min_amount, payment_account_id=payment_account_id, percentage_from_market_price=percentage_from_market_price, fixed_price=fixed_price)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BisqApi->offer_make: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **direction** | **str**|  | 
 **price_type** | **str**|  | [default to FIXED]
 **market_pair** | **str**|  | 
 **amount** | **float**|  | 
 **min_amount** | **float**|  | 
 **payment_account_id** | **str**|  | [optional] 
 **percentage_from_market_price** | **float**|  | [optional] [default to 0.0]
 **fixed_price** | **str**|  | [optional] [default to 0]

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **offer_take**
> bool offer_take(offer_id=offer_id, payment_account_id=payment_account_id, amount=amount)



### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BisqApi()
offer_id = 'offer_id_example' # str |  (optional)
payment_account_id = 'payment_account_id_example' # str |  (optional)
amount = 'amount_example' # str |  (optional)

try: 
    api_response = api_instance.offer_take(offer_id=offer_id, payment_account_id=payment_account_id, amount=amount)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BisqApi->offer_take: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offer_id** | **str**|  | [optional] 
 **payment_account_id** | **str**|  | [optional] 
 **amount** | **str**|  | [optional] 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **payment_received**
> bool payment_received(trade_id=trade_id)



### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BisqApi()
trade_id = 'trade_id_example' # str |  (optional)

try: 
    api_response = api_instance.payment_received(trade_id=trade_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BisqApi->payment_received: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trade_id** | **str**|  | [optional] 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **payment_started**
> bool payment_started(trade_id=trade_id)



### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BisqApi()
trade_id = 'trade_id_example' # str |  (optional)

try: 
    api_response = api_instance.payment_started(trade_id=trade_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BisqApi->payment_started: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trade_id** | **str**|  | [optional] 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trade_detail**
> str trade_detail(trade_id=trade_id)



### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BisqApi()
trade_id = 'trade_id_example' # str |  (optional)

try: 
    api_response = api_instance.trade_detail(trade_id=trade_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BisqApi->trade_detail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trade_id** | **str**|  | [optional] 

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trade_list**
> str trade_list()



### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BisqApi()

try: 
    api_response = api_instance.trade_list()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BisqApi->trade_list: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **wallet_addresses**
> list[WalletAddress] wallet_addresses(status=status, start=start, limit=limit)



### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BisqApi()
status = 'BOTH' # str |  (optional) (default to BOTH)
start = 0 # int |  (optional) (default to 0)
limit = 100 # int |  (optional) (default to 100)

try: 
    api_response = api_instance.wallet_addresses(status=status, start=start, limit=limit)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BisqApi->wallet_addresses: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **str**|  | [optional] [default to BOTH]
 **start** | **int**|  | [optional] [default to 0]
 **limit** | **int**|  | [optional] [default to 100]

### Return type

[**list[WalletAddress]**](WalletAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **wallet_detail**
> WalletDetails wallet_detail()



### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BisqApi()

try: 
    api_response = api_instance.wallet_detail()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BisqApi->wallet_detail: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **wallet_transaction_list**
> WalletTransactions wallet_transaction_list(start=start, end=end, limit=limit)



### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BisqApi()
start = 0 # int |  (optional) (default to 0)
end = 2147483647 # int |  (optional) (default to 2147483647)
limit = 100 # int |  (optional) (default to 100)

try: 
    api_response = api_instance.wallet_transaction_list(start=start, end=end, limit=limit)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BisqApi->wallet_transaction_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **int**|  | [optional] [default to 0]
 **end** | **int**|  | [optional] [default to 2147483647]
 **limit** | **int**|  | [optional] [default to 100]

### Return type

[**WalletTransactions**](WalletTransactions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

