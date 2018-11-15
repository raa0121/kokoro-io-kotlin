# MessagesApi

All URIs are relative to *https://kokoro.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteV1MessagesMessageId**](MessagesApi.md#deleteV1MessagesMessageId) | **DELETE** /v1/messages/{message_id} | 


<a name="deleteV1MessagesMessageId"></a>
# **deleteV1MessagesMessageId**
> MessageEntity deleteV1MessagesMessageId(messageId)



Delete a message.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = MessagesApi()
val messageId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : MessageEntity = apiInstance.deleteV1MessagesMessageId(messageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#deleteV1MessagesMessageId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#deleteV1MessagesMessageId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **kotlin.Int**|  |

### Return type

[**MessageEntity**](MessageEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

