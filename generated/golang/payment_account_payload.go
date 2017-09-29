/* 
 * The Bisq API
 *
 * API for the Bisq exchange
 *
 * OpenAPI spec version: 1
 * Contact: Use the Bisq's project support channels
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package swagger

type PaymentAccountPayload struct {

	PaymentMethodId string `json:"paymentMethodId,omitempty"`

	Id string `json:"id,omitempty"`

	MaxTradePeriod int64 `json:"maxTradePeriod,omitempty"`

	PaymentDetails string `json:"paymentDetails,omitempty"`

	PaymentDetailsForTradePopup string `json:"paymentDetailsForTradePopup,omitempty"`
}
