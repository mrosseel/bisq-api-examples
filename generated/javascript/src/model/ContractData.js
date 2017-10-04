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
import PaymentAccountPayload from './PaymentAccountPayload';





/**
* The ContractData model module.
* @module model/ContractData
* @version 1
*/
export default class ContractData {
    /**
    * Constructs a new <code>ContractData</code>.
    * @alias module:model/ContractData
    * @class
    */

    constructor() {
        

        
        

        

        
    }

    /**
    * Constructs a <code>ContractData</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ContractData} obj Optional instance to populate.
    * @return {module:model/ContractData} The populated <code>ContractData</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ContractData();

            
            
            

            if (data.hasOwnProperty('contractData')) {
                obj['contractData'] = PaymentAccountPayload.constructFromObject(data['contractData']);
            }
        }
        return obj;
    }

    /**
    * @member {module:model/PaymentAccountPayload} contractData
    */
    contractData = undefined;








}


