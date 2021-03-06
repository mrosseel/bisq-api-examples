# Go API client for swagger

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)

## Overview
This API client was generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project.  By using the [swagger-spec](https://github.com/swagger-api/swagger-spec) from a remote server, you can easily generate an API client.

- API version: 1.0.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.languages.GoClientCodegen

## Installation
Put the package under your project folder and add the following in import:
```golang
import "./swagger"
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ArbitratorsApi* | [**DeselectArbitrator**](docs/ArbitratorsApi.md#deselectarbitrator) | **Post** /api/v1/arbitrators/{address}/deselect | Deselect arbitrator
*ArbitratorsApi* | [**Find**](docs/ArbitratorsApi.md#find) | **Get** /api/v1/arbitrators | Find available arbitrators
*ArbitratorsApi* | [**Register**](docs/ArbitratorsApi.md#register) | **Post** /api/v1/arbitrators | Register yourself as arbitrator
*ArbitratorsApi* | [**SelectArbitrator**](docs/ArbitratorsApi.md#selectarbitrator) | **Post** /api/v1/arbitrators/{address}/select | Select arbitrator
*ArbitratorsApi* | [**Unregister**](docs/ArbitratorsApi.md#unregister) | **Delete** /api/v1/arbitrators | Unregister yourself as arbitrator
*CurrenciesApi* | [**Find**](docs/CurrenciesApi.md#find) | **Get** /api/v1/currencies | List available currencies
*MarketsApi* | [**Find**](docs/MarketsApi.md#find) | **Get** /api/v1/markets | List markets
*NetworkApi* | [**GetBitcoinNetworkStatus**](docs/NetworkApi.md#getbitcoinnetworkstatus) | **Get** /api/v1/network/bitcoin/status | Get Bitcoin network status
*NetworkApi* | [**GetP2PNetworkStatus**](docs/NetworkApi.md#getp2pnetworkstatus) | **Get** /api/v1/network/p2p/status | Get P2P network status
*OffersApi* | [**CancelOffer**](docs/OffersApi.md#canceloffer) | **Delete** /api/v1/offers/{id} | Cancel offer
*OffersApi* | [**CreateOffer**](docs/OffersApi.md#createoffer) | **Post** /api/v1/offers | Create offer
*OffersApi* | [**Find**](docs/OffersApi.md#find) | **Get** /api/v1/offers | Find offers
*OffersApi* | [**GetOfferById**](docs/OffersApi.md#getofferbyid) | **Get** /api/v1/offers/{id} | Get offer details
*OffersApi* | [**TakeOffer**](docs/OffersApi.md#takeoffer) | **Post** /api/v1/offers/{id}/take | Take offer
*PaymentAccountsApi* | [**Create**](docs/PaymentAccountsApi.md#create) | **Post** /api/v1/payment-accounts | Create payment account
*PaymentAccountsApi* | [**Find**](docs/PaymentAccountsApi.md#find) | **Get** /api/v1/payment-accounts | Get existing payment accounts
*PaymentAccountsApi* | [**RemoveById**](docs/PaymentAccountsApi.md#removebyid) | **Delete** /api/v1/payment-accounts/{id} | Remove payment account
*PreferencesApi* | [**GetPreferences**](docs/PreferencesApi.md#getpreferences) | **Get** /api/v1/preferences | Get preferences
*PreferencesApi* | [**GetPreferencesAvailableValues**](docs/PreferencesApi.md#getpreferencesavailablevalues) | **Get** /api/v1/preferences/available-values | Get available preferences values
*PreferencesApi* | [**SetPreferences**](docs/PreferencesApi.md#setpreferences) | **Put** /api/v1/preferences | Set preferences
*TradesApi* | [**Find**](docs/TradesApi.md#find) | **Get** /api/v1/trades | List trades
*TradesApi* | [**GetById**](docs/TradesApi.md#getbyid) | **Get** /api/v1/trades/{id} | Get trade details
*TradesApi* | [**MoveFundsToBisqWallet**](docs/TradesApi.md#movefundstobisqwallet) | **Post** /api/v1/trades/{id}/move-funds-to-bisq-wallet | Move funds to Bisq wallet
*TradesApi* | [**PaymentReceived**](docs/TradesApi.md#paymentreceived) | **Post** /api/v1/trades/{id}/payment-received | Confirm payment has been received
*TradesApi* | [**PaymentStarted**](docs/TradesApi.md#paymentstarted) | **Post** /api/v1/trades/{id}/payment-started | Confirm payment has started
*WalletApi* | [**GetAddresses**](docs/WalletApi.md#getaddresses) | **Get** /api/v1/wallet/addresses | Get wallet addresses
*WalletApi* | [**GetOrCreateAvailableUnusedWalletAddresses**](docs/WalletApi.md#getorcreateavailableunusedwalletaddresses) | **Post** /api/v1/wallet/addresses | Get or create wallet address
*WalletApi* | [**GetTransactions**](docs/WalletApi.md#gettransactions) | **Get** /api/v1/wallet/transactions | Get wallet transactions
*WalletApi* | [**GetWalletDetails**](docs/WalletApi.md#getwalletdetails) | **Get** /api/v1/wallet | Get wallet details
*WalletApi* | [**WithdrawFunds**](docs/WalletApi.md#withdrawfunds) | **Post** /api/v1/wallet/withdraw | Withdraw funds


## Documentation For Models

 - [Arbitrator](docs/Arbitrator.md)
 - [ArbitratorList](docs/ArbitratorList.md)
 - [ArbitratorRegistration](docs/ArbitratorRegistration.md)
 - [BitcoinNetworkStatus](docs/BitcoinNetworkStatus.md)
 - [Currency](docs/Currency.md)
 - [CurrencyList](docs/CurrencyList.md)
 - [Market](docs/Market.md)
 - [MarketList](docs/MarketList.md)
 - [OfferDetail](docs/OfferDetail.md)
 - [OfferList](docs/OfferList.md)
 - [OfferToCreate](docs/OfferToCreate.md)
 - [P2PNetworkConnection](docs/P2PNetworkConnection.md)
 - [P2PNetworkStatus](docs/P2PNetworkStatus.md)
 - [PaymentAccount](docs/PaymentAccount.md)
 - [PaymentAccountList](docs/PaymentAccountList.md)
 - [Preferences](docs/Preferences.md)
 - [PreferencesAvailableValues](docs/PreferencesAvailableValues.md)
 - [TakeOffer](docs/TakeOffer.md)
 - [TradeDetails](docs/TradeDetails.md)
 - [TradeList](docs/TradeList.md)
 - [WalletAddress](docs/WalletAddress.md)
 - [WalletAddressList](docs/WalletAddressList.md)
 - [WalletDetails](docs/WalletDetails.md)
 - [WalletTransaction](docs/WalletTransaction.md)
 - [WalletTransactionList](docs/WalletTransactionList.md)
 - [WithdrawFundsForm](docs/WithdrawFundsForm.md)
 - [AliPayPaymentAccount](docs/AliPayPaymentAccount.md)
 - [CashAppPaymentAccount](docs/CashAppPaymentAccount.md)
 - [CashDepositPaymentAccount](docs/CashDepositPaymentAccount.md)
 - [ChaseQuickPayPaymentAccount](docs/ChaseQuickPayPaymentAccount.md)
 - [ClearXchangePaymentAccount](docs/ClearXchangePaymentAccount.md)
 - [CryptoCurrencyPaymentAccount](docs/CryptoCurrencyPaymentAccount.md)
 - [FasterPaymentsPaymentAccount](docs/FasterPaymentsPaymentAccount.md)
 - [InteracETransferPaymentAccount](docs/InteracETransferPaymentAccount.md)
 - [MoneyBeamPaymentAccount](docs/MoneyBeamPaymentAccount.md)
 - [NationalBankAccountPaymentAccount](docs/NationalBankAccountPaymentAccount.md)
 - [OkPayPaymentAccount](docs/OkPayPaymentAccount.md)
 - [PerfectMoneyPaymentAccount](docs/PerfectMoneyPaymentAccount.md)
 - [PopmoneyPaymentAccount](docs/PopmoneyPaymentAccount.md)
 - [RevolutPaymentAccount](docs/RevolutPaymentAccount.md)
 - [SameBankAccountPaymentAccount](docs/SameBankAccountPaymentAccount.md)
 - [SepaInstantPaymentAccount](docs/SepaInstantPaymentAccount.md)
 - [SepaPaymentAccount](docs/SepaPaymentAccount.md)
 - [SpecificBanksAccountPaymentAccount](docs/SpecificBanksAccountPaymentAccount.md)
 - [SwishPaymentAccount](docs/SwishPaymentAccount.md)
 - [UpholdPaymentAccount](docs/UpholdPaymentAccount.md)
 - [UsPostalMoneyOrderPaymentAccount](docs/UsPostalMoneyOrderPaymentAccount.md)
 - [VenmoPaymentAccount](docs/VenmoPaymentAccount.md)
 - [WesternUnionPaymentAccount](docs/WesternUnionPaymentAccount.md)


## Documentation For Authorization
 Endpoints do not require authorization.


## Author



