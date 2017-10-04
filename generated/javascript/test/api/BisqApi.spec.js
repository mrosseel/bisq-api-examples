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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.TheBisqApi);
  }
}(this, function(expect, TheBisqApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new TheBisqApi.BisqApi();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('BisqApi', function() {
    describe('accountList', function() {
      it('should call accountList successfully', function(done) {
        //uncomment below and update the code to test accountList
        //instance.accountList(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('currencyList', function() {
      it('should call currencyList successfully', function(done) {
        //uncomment below and update the code to test currencyList
        //instance.currencyList(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('marketList', function() {
      it('should call marketList successfully', function(done) {
        //uncomment below and update the code to test marketList
        //instance.marketList(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('moveFundsToBisqWallet', function() {
      it('should call moveFundsToBisqWallet successfully', function(done) {
        //uncomment below and update the code to test moveFundsToBisqWallet
        //instance.moveFundsToBisqWallet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('offerCancel', function() {
      it('should call offerCancel successfully', function(done) {
        //uncomment below and update the code to test offerCancel
        //instance.offerCancel(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('offerDetail', function() {
      it('should call offerDetail successfully', function(done) {
        //uncomment below and update the code to test offerDetail
        //instance.offerDetail(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('offerList', function() {
      it('should call offerList successfully', function(done) {
        //uncomment below and update the code to test offerList
        //instance.offerList(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('offerMake', function() {
      it('should call offerMake successfully', function(done) {
        //uncomment below and update the code to test offerMake
        //instance.offerMake(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('offerTake', function() {
      it('should call offerTake successfully', function(done) {
        //uncomment below and update the code to test offerTake
        //instance.offerTake(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('paymentReceived', function() {
      it('should call paymentReceived successfully', function(done) {
        //uncomment below and update the code to test paymentReceived
        //instance.paymentReceived(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('paymentStarted', function() {
      it('should call paymentStarted successfully', function(done) {
        //uncomment below and update the code to test paymentStarted
        //instance.paymentStarted(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('tradeDetail', function() {
      it('should call tradeDetail successfully', function(done) {
        //uncomment below and update the code to test tradeDetail
        //instance.tradeDetail(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('tradeList', function() {
      it('should call tradeList successfully', function(done) {
        //uncomment below and update the code to test tradeList
        //instance.tradeList(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('walletAddresses', function() {
      it('should call walletAddresses successfully', function(done) {
        //uncomment below and update the code to test walletAddresses
        //instance.walletAddresses(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('walletDetail', function() {
      it('should call walletDetail successfully', function(done) {
        //uncomment below and update the code to test walletDetail
        //instance.walletDetail(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('walletTransactionList', function() {
      it('should call walletTransactionList successfully', function(done) {
        //uncomment below and update the code to test walletTransactionList
        //instance.walletTransactionList(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
