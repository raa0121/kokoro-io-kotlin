# BotApi

All URIs are relative to *https://kokoro.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postV1BotChannelsChannelIdMessages**](BotApi.md#postV1BotChannelsChannelIdMessages) | **POST** /v1/bot/channels/{channel_id}/messages | 


<a name="postV1BotChannelsChannelIdMessages"></a>
# **postV1BotChannelsChannelIdMessages**
> MessageEntity postV1BotChannelsChannelIdMessages(channelId, message, displayName, nsfw, expandEmbedContents)



Creates a new message.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = BotApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
val message : kotlin.String = message_example // kotlin.String | 
val displayName : kotlin.String = displayName_example // kotlin.String | 
val nsfw : kotlin.Boolean = true // kotlin.Boolean | 
val expandEmbedContents : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : MessageEntity = apiInstance.postV1BotChannelsChannelIdMessages(channelId, message, displayName, nsfw, expandEmbedContents)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BotApi#postV1BotChannelsChannelIdMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BotApi#postV1BotChannelsChannelIdMessages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**|  |
 **message** | **kotlin.String**|  |
 **displayName** | **kotlin.String**|  | [optional]
 **nsfw** | **kotlin.Boolean**|  | [optional]
 **expandEmbedContents** | **kotlin.Boolean**|  | [optional]

### Return type

[**MessageEntity**](MessageEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

