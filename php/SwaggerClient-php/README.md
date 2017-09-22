# SwaggerClient-php
API for the bisq exchange

This PHP package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1
- Build package: io.swagger.codegen.languages.PhpClientCodegen

## Requirements

PHP 5.5 and later

## Installation & Usage
### Composer

To install the bindings via [Composer](http://getcomposer.org/), add the following to `composer.json`:

```
{
  "repositories": [
    {
      "type": "git",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
    require_once('/path/to/SwaggerClient-php/vendor/autoload.php');
```

## Tests

To run the unit tests:

```
composer install
./vendor/bin/phpunit
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BisqApi();

try {
    $result = $api_instance->accountList();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BisqApi->accountList: ', $e->getMessage(), PHP_EOL;
}

?>
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BisqApi* | [**accountList**](docs/Api/BisqApi.md#accountlist) | **GET** /api/v1/account_list | 
*BisqApi* | [**currencyList**](docs/Api/BisqApi.md#currencylist) | **GET** /api/v1/currency_list | 
*BisqApi* | [**marketList**](docs/Api/BisqApi.md#marketlist) | **GET** /api/v1/market_list | 
*BisqApi* | [**moveFundsToBisqWallet**](docs/Api/BisqApi.md#movefundstobisqwallet) | **GET** /api/v1/move_funds_to_bisq_wallet | 
*BisqApi* | [**offerCancel**](docs/Api/BisqApi.md#offercancel) | **DELETE** /api/v1/offer_cancel | 
*BisqApi* | [**offerDetail**](docs/Api/BisqApi.md#offerdetail) | **GET** /api/v1/offer_detail | 
*BisqApi* | [**offerList**](docs/Api/BisqApi.md#offerlist) | **GET** /api/v1/offer_list | 
*BisqApi* | [**offerMake**](docs/Api/BisqApi.md#offermake) | **GET** /api/v1/offer_make | 
*BisqApi* | [**offerTake**](docs/Api/BisqApi.md#offertake) | **GET** /api/v1/offer_take | 
*BisqApi* | [**paymentReceived**](docs/Api/BisqApi.md#paymentreceived) | **GET** /api/v1/payment_received | 
*BisqApi* | [**paymentStarted**](docs/Api/BisqApi.md#paymentstarted) | **GET** /api/v1/payment_started | 
*BisqApi* | [**tradeDetail**](docs/Api/BisqApi.md#tradedetail) | **GET** /api/v1/trade_detail | 
*BisqApi* | [**tradeList**](docs/Api/BisqApi.md#tradelist) | **GET** /api/v1/trade_list | 
*BisqApi* | [**walletAddresses**](docs/Api/BisqApi.md#walletaddresses) | **GET** /api/v1/wallet_addresses | 
*BisqApi* | [**walletDetail**](docs/Api/BisqApi.md#walletdetail) | **GET** /api/v1/wallet_detail | 
*BisqApi* | [**walletTransactionList**](docs/Api/BisqApi.md#wallettransactionlist) | **GET** /api/v1/wallet_tx_list | 


## Documentation For Models

 - [Account](docs/Model/Account.md)
 - [AccountList](docs/Model/AccountList.md)
 - [ContractData](docs/Model/ContractData.md)
 - [Currency](docs/Model/Currency.md)
 - [CurrencyList](docs/Model/CurrencyList.md)
 - [Market](docs/Model/Market.md)
 - [MarketList](docs/Model/MarketList.md)
 - [OfferDetail](docs/Model/OfferDetail.md)
 - [PaymentAccountPayload](docs/Model/PaymentAccountPayload.md)
 - [PriceDetail](docs/Model/PriceDetail.md)
 - [WalletAddress](docs/Model/WalletAddress.md)
 - [WalletDetails](docs/Model/WalletDetails.md)
 - [WalletTransactions](docs/Model/WalletTransactions.md)


## Documentation For Authorization

 All endpoints do not require authorization.


## Author



