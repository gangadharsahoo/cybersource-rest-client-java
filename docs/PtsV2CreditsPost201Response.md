
# PtsV2CreditsPost201Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**PtsV2PaymentsRefundPost201ResponseLinks**](PtsV2PaymentsRefundPost201ResponseLinks.md) |  |  [optional]
**id** | **String** | An unique identification number assigned by CyberSource to identify the submitted request. It is also appended to the endpoint of the resource. |  [optional]
**submitTimeUtc** | **String** | Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; Example &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the submitted transaction.  Possible values:  - PENDING  |  [optional]
**reconciliationId** | **String** | The reconciliation id for the submitted transaction. This value is not returned for all processors.  |  [optional]
**clientReferenceInformation** | [**PtsV2PaymentsPost201ResponseClientReferenceInformation**](PtsV2PaymentsPost201ResponseClientReferenceInformation.md) |  |  [optional]
**creditAmountDetails** | [**PtsV2CreditsPost201ResponseCreditAmountDetails**](PtsV2CreditsPost201ResponseCreditAmountDetails.md) |  |  [optional]
**processingInformation** | [**PtsV2CreditsPost201ResponseProcessingInformation**](PtsV2CreditsPost201ResponseProcessingInformation.md) |  |  [optional]
**processorInformation** | [**PtsV2PaymentsRefundPost201ResponseProcessorInformation**](PtsV2PaymentsRefundPost201ResponseProcessorInformation.md) |  |  [optional]
**paymentInformation** | [**PtsV2CreditsPost201ResponsePaymentInformation**](PtsV2CreditsPost201ResponsePaymentInformation.md) |  |  [optional]
**orderInformation** | [**PtsV2PaymentsRefundPost201ResponseOrderInformation**](PtsV2PaymentsRefundPost201ResponseOrderInformation.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;



