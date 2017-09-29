# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.BisqApi;

import java.io.File;
import java.util.*;

public class BisqApiExample {

    public static void main(String[] args) {
        
        BisqApi apiInstance = new BisqApi();
        try {
            AccountList result = apiInstance.accountList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BisqApi#accountList");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BisqApi* | [**accountList**](docs/BisqApi.md#accountList) | **GET** /api/v1/account_list | 
*BisqApi* | [**currencyList**](docs/BisqApi.md#currencyList) | **GET** /api/v1/currency_list | 
*BisqApi* | [**marketList**](docs/BisqApi.md#marketList) | **GET** /api/v1/market_list | 
*BisqApi* | [**moveFundsToBisqWallet**](docs/BisqApi.md#moveFundsToBisqWallet) | **GET** /api/v1/move_funds_to_bisq_wallet | 
*BisqApi* | [**offerCancel**](docs/BisqApi.md#offerCancel) | **DELETE** /api/v1/offer_cancel | 
*BisqApi* | [**offerDetail**](docs/BisqApi.md#offerDetail) | **GET** /api/v1/offer_detail | 
*BisqApi* | [**offerList**](docs/BisqApi.md#offerList) | **GET** /api/v1/offer_list | 
*BisqApi* | [**offerMake**](docs/BisqApi.md#offerMake) | **GET** /api/v1/offer_make | 
*BisqApi* | [**offerTake**](docs/BisqApi.md#offerTake) | **GET** /api/v1/offer_take | 
*BisqApi* | [**paymentReceived**](docs/BisqApi.md#paymentReceived) | **GET** /api/v1/payment_received | 
*BisqApi* | [**paymentStarted**](docs/BisqApi.md#paymentStarted) | **GET** /api/v1/payment_started | 
*BisqApi* | [**tradeDetail**](docs/BisqApi.md#tradeDetail) | **GET** /api/v1/trade_detail | 
*BisqApi* | [**tradeList**](docs/BisqApi.md#tradeList) | **GET** /api/v1/trade_list | 
*BisqApi* | [**walletAddresses**](docs/BisqApi.md#walletAddresses) | **GET** /api/v1/wallet_addresses | 
*BisqApi* | [**walletDetail**](docs/BisqApi.md#walletDetail) | **GET** /api/v1/wallet_detail | 
*BisqApi* | [**walletTransactionList**](docs/BisqApi.md#walletTransactionList) | **GET** /api/v1/wallet_tx_list | 


## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountList](docs/AccountList.md)
 - [ContractData](docs/ContractData.md)
 - [Currency](docs/Currency.md)
 - [CurrencyList](docs/CurrencyList.md)
 - [Market](docs/Market.md)
 - [MarketList](docs/MarketList.md)
 - [OfferDetail](docs/OfferDetail.md)
 - [PaymentAccountPayload](docs/PaymentAccountPayload.md)
 - [PriceDetail](docs/PriceDetail.md)
 - [WalletAddress](docs/WalletAddress.md)
 - [WalletDetails](docs/WalletDetails.md)
 - [WalletTransactions](docs/WalletTransactions.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



