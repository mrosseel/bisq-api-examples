/* 
 * The Bisq API
 *
 * API for the bisq exchange
 *
 * OpenAPI spec version: 1
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package swagger

type Account struct {

	PaymentAccountId string `json:"payment_account_id,omitempty"`

	Created int64 `json:"created,omitempty"`

	AccountName string `json:"account_name,omitempty"`

	TradeCurrencies []string `json:"trade_currencies,omitempty"`

	PaymentAccountPayload string `json:"paymentAccountPayload,omitempty"`

	PaymentMethodDetails *ContractData `json:"payment_method_details,omitempty"`
}
