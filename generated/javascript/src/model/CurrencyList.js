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
import Currency from './Currency';





/**
* The CurrencyList model module.
* @module model/CurrencyList
* @version 1
*/
export default class CurrencyList {
    /**
    * Constructs a new <code>CurrencyList</code>.
    * @alias module:model/CurrencyList
    * @class
    */

    constructor() {
        

        
        

        

        
    }

    /**
    * Constructs a <code>CurrencyList</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/CurrencyList} obj Optional instance to populate.
    * @return {module:model/CurrencyList} The populated <code>CurrencyList</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CurrencyList();

            
            
            

            if (data.hasOwnProperty('currencies')) {
                obj['currencies'] = ApiClient.convertToType(data['currencies'], [Currency]);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/Currency>} currencies
    */
    currencies = undefined;








}

