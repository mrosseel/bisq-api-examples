/**
 * The Bisq API
 * API for the Bisq exchange
 *
 * OpenAPI spec version: 1
 * Contact: Use the Bisq's project support channels
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */


import ApiClient from '../ApiClient';





/**
* The PriceDetail model module.
* @module model/PriceDetail
* @version 1
*/
export default class PriceDetail {
    /**
    * Constructs a new <code>PriceDetail</code>.
    * @alias module:model/PriceDetail
    * @class
    */

    constructor() {
        

        
        

        

        
    }

    /**
    * Constructs a <code>PriceDetail</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PriceDetail} obj Optional instance to populate.
    * @return {module:model/PriceDetail} The populated <code>PriceDetail</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PriceDetail();

            
            
            

            if (data.hasOwnProperty('use_market_price')) {
                obj['use_market_price'] = ApiClient.convertToType(data['use_market_price'], 'Boolean');
            }
            if (data.hasOwnProperty('market_price_margin')) {
                obj['market_price_margin'] = ApiClient.convertToType(data['market_price_margin'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} use_market_price
    */
    use_market_price = undefined;
    /**
    * @member {Number} market_price_margin
    */
    market_price_margin = undefined;








}

