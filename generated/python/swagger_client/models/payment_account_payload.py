# coding: utf-8

"""
    The Bisq API

    API for the Bisq exchange

    OpenAPI spec version: 1
    Contact: Use the Bisq's project support channels
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class PaymentAccountPayload(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """


    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'payment_method_id': 'str',
        'id': 'str',
        'max_trade_period': 'int',
        'payment_details': 'str',
        'payment_details_for_trade_popup': 'str'
    }

    attribute_map = {
        'payment_method_id': 'paymentMethodId',
        'id': 'id',
        'max_trade_period': 'maxTradePeriod',
        'payment_details': 'paymentDetails',
        'payment_details_for_trade_popup': 'paymentDetailsForTradePopup'
    }

    def __init__(self, payment_method_id=None, id=None, max_trade_period=None, payment_details=None, payment_details_for_trade_popup=None):
        """
        PaymentAccountPayload - a model defined in Swagger
        """

        self._payment_method_id = None
        self._id = None
        self._max_trade_period = None
        self._payment_details = None
        self._payment_details_for_trade_popup = None
        self.discriminator = None

        if payment_method_id is not None:
          self.payment_method_id = payment_method_id
        if id is not None:
          self.id = id
        if max_trade_period is not None:
          self.max_trade_period = max_trade_period
        if payment_details is not None:
          self.payment_details = payment_details
        if payment_details_for_trade_popup is not None:
          self.payment_details_for_trade_popup = payment_details_for_trade_popup

    @property
    def payment_method_id(self):
        """
        Gets the payment_method_id of this PaymentAccountPayload.

        :return: The payment_method_id of this PaymentAccountPayload.
        :rtype: str
        """
        return self._payment_method_id

    @payment_method_id.setter
    def payment_method_id(self, payment_method_id):
        """
        Sets the payment_method_id of this PaymentAccountPayload.

        :param payment_method_id: The payment_method_id of this PaymentAccountPayload.
        :type: str
        """

        self._payment_method_id = payment_method_id

    @property
    def id(self):
        """
        Gets the id of this PaymentAccountPayload.

        :return: The id of this PaymentAccountPayload.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this PaymentAccountPayload.

        :param id: The id of this PaymentAccountPayload.
        :type: str
        """

        self._id = id

    @property
    def max_trade_period(self):
        """
        Gets the max_trade_period of this PaymentAccountPayload.

        :return: The max_trade_period of this PaymentAccountPayload.
        :rtype: int
        """
        return self._max_trade_period

    @max_trade_period.setter
    def max_trade_period(self, max_trade_period):
        """
        Sets the max_trade_period of this PaymentAccountPayload.

        :param max_trade_period: The max_trade_period of this PaymentAccountPayload.
        :type: int
        """

        self._max_trade_period = max_trade_period

    @property
    def payment_details(self):
        """
        Gets the payment_details of this PaymentAccountPayload.

        :return: The payment_details of this PaymentAccountPayload.
        :rtype: str
        """
        return self._payment_details

    @payment_details.setter
    def payment_details(self, payment_details):
        """
        Sets the payment_details of this PaymentAccountPayload.

        :param payment_details: The payment_details of this PaymentAccountPayload.
        :type: str
        """

        self._payment_details = payment_details

    @property
    def payment_details_for_trade_popup(self):
        """
        Gets the payment_details_for_trade_popup of this PaymentAccountPayload.

        :return: The payment_details_for_trade_popup of this PaymentAccountPayload.
        :rtype: str
        """
        return self._payment_details_for_trade_popup

    @payment_details_for_trade_popup.setter
    def payment_details_for_trade_popup(self, payment_details_for_trade_popup):
        """
        Sets the payment_details_for_trade_popup of this PaymentAccountPayload.

        :param payment_details_for_trade_popup: The payment_details_for_trade_popup of this PaymentAccountPayload.
        :type: str
        """

        self._payment_details_for_trade_popup = payment_details_for_trade_popup

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        if not isinstance(other, PaymentAccountPayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
