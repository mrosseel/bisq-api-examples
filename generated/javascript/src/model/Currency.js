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
* The Currency model module.
* @module model/Currency
* @version 1
*/
export default class Currency {
    /**
    * Constructs a new <code>Currency</code>.
    * @alias module:model/Currency
    * @class
    */

    constructor() {
        

        
        

        

        
    }

    /**
    * Constructs a <code>Currency</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/Currency} obj Optional instance to populate.
    * @return {module:model/Currency} The populated <code>Currency</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Currency();

            
            
            

            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} symbol
    */
    symbol = undefined;
    /**
    * @member {String} name
    */
    name = undefined;
    /**
    * @member {String} type
    */
    type = undefined;








}


