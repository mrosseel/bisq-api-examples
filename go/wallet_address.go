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

type WalletAddress struct {

	Id string `json:"id,omitempty"`

	PaymentMethod string `json:"paymentMethod,omitempty"`

	Address string `json:"address,omitempty"`
}