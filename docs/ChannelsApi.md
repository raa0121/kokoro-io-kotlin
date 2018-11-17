# ChannelsApi

All URIs are relative to *https://kokoro.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getV1Channels**](ChannelsApi.md#getV1Channels) | **GET** /v1/channels | 
[**getV1ChannelsChannelId**](ChannelsApi.md#getV1ChannelsChannelId) | **GET** /v1/channels/{channel_id} | 
[**getV1ChannelsChannelIdMemberships**](ChannelsApi.md#getV1ChannelsChannelIdMemberships) | **GET** /v1/channels/{channel_id}/memberships | 
[**getV1ChannelsChannelIdMessages**](ChannelsApi.md#getV1ChannelsChannelIdMessages) | **GET** /v1/channels/{channel_id}/messages | 
[**postV1Channels**](ChannelsApi.md#postV1Channels) | **POST** /v1/channels | 
[**postV1ChannelsChannelIdMessages**](ChannelsApi.md#postV1ChannelsChannelIdMessages) | **POST** /v1/channels/{channel_id}/messages | 
[**postV1ChannelsDirectMessage**](ChannelsApi.md#postV1ChannelsDirectMessage) | **POST** /v1/channels/direct_message | 
[**putV1ChannelsChannelId**](ChannelsApi.md#putV1ChannelsChannelId) | **PUT** /v1/channels/{channel_id} | 
[**putV1ChannelsChannelIdArchive**](ChannelsApi.md#putV1ChannelsChannelIdArchive) | **PUT** /v1/channels/{channel_id}/archive | 
[**putV1ChannelsChannelIdManageMembersMemberId**](ChannelsApi.md#putV1ChannelsChannelIdManageMembersMemberId) | **PUT** /v1/channels/{channel_id}/manage_members/{member_id} | 
[**putV1ChannelsChannelIdUnarchive**](ChannelsApi.md#putV1ChannelsChannelIdUnarchive) | **PUT** /v1/channels/{channel_id}/unarchive | 


<a name="getV1Channels"></a>
# **getV1Channels**
> ChannelEntity getV1Channels(archived)



Returns public channels.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.github.raa0121.kokoroio.model.*

val apiInstance = ChannelsApi()
val archived : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : ChannelEntity = apiInstance.getV1Channels(archived)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#getV1Channels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#getV1Channels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **archived** | **kotlin.Boolean**|  | [optional]

### Return type

[**ChannelEntity**](ChannelEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getV1ChannelsChannelId"></a>
# **getV1ChannelsChannelId**
> ChannelWithMembershipsEntity getV1ChannelsChannelId(channelId)



Returns a channel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.github.raa0121.kokoroio.model.*

val apiInstance = ChannelsApi()
val channelId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ChannelWithMembershipsEntity = apiInstance.getV1ChannelsChannelId(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#getV1ChannelsChannelId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#getV1ChannelsChannelId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.Int**|  |

### Return type

[**ChannelWithMembershipsEntity**](ChannelWithMembershipsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getV1ChannelsChannelIdMemberships"></a>
# **getV1ChannelsChannelIdMemberships**
> ChannelWithMembershipsEntity getV1ChannelsChannelIdMemberships(channelId)



Returns all of members in this channel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.github.raa0121.kokoroio.model.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
try {
    val result : ChannelWithMembershipsEntity = apiInstance.getV1ChannelsChannelIdMemberships(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#getV1ChannelsChannelIdMemberships")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#getV1ChannelsChannelIdMemberships")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**|  |

### Return type

[**ChannelWithMembershipsEntity**](ChannelWithMembershipsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getV1ChannelsChannelIdMessages"></a>
# **getV1ChannelsChannelIdMessages**
> MessageEntity getV1ChannelsChannelIdMessages(channelId, limit, beforeId, afterId)



Returns recent messages in the channel.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.github.raa0121.kokoroio.model.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val beforeId : kotlin.Int = 56 // kotlin.Int | 
val afterId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : MessageEntity = apiInstance.getV1ChannelsChannelIdMessages(channelId, limit, beforeId, afterId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#getV1ChannelsChannelIdMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#getV1ChannelsChannelIdMessages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**|  |
 **limit** | **kotlin.Int**|  | [optional] [default to 30]
 **beforeId** | **kotlin.Int**|  | [optional]
 **afterId** | **kotlin.Int**|  | [optional]

### Return type

[**MessageEntity**](MessageEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postV1Channels"></a>
# **postV1Channels**
> ChannelEntity postV1Channels(channel[channelName], channel[description], channel[kind])



Creates a new channel.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.github.raa0121.kokoroio.model.*

val apiInstance = ChannelsApi()
val channel[channelName] : kotlin.String = channel[channelName]_example // kotlin.String | 
val channel[description] : kotlin.String = channel[description]_example // kotlin.String | 
val channel[kind] : kotlin.String = channel[kind]_example // kotlin.String | 
try {
    val result : ChannelEntity = apiInstance.postV1Channels(channel[channelName], channel[description], channel[kind])
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#postV1Channels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#postV1Channels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel[channelName]** | **kotlin.String**|  |
 **channel[description]** | **kotlin.String**|  |
 **channel[kind]** | **kotlin.String**|  | [optional] [default to public_channel] [enum: public_channel, private_channel]

### Return type

[**ChannelEntity**](ChannelEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postV1ChannelsChannelIdMessages"></a>
# **postV1ChannelsChannelIdMessages**
> MessageEntity postV1ChannelsChannelIdMessages(channelId, message, nsfw, idempotentKey, expandEmbedContents)



Creates a new message.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.github.raa0121.kokoroio.model.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
val message : kotlin.String = message_example // kotlin.String | 
val nsfw : kotlin.Boolean = true // kotlin.Boolean | 
val idempotentKey : kotlin.String = idempotentKey_example // kotlin.String | 
val expandEmbedContents : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : MessageEntity = apiInstance.postV1ChannelsChannelIdMessages(channelId, message, nsfw, idempotentKey, expandEmbedContents)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#postV1ChannelsChannelIdMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#postV1ChannelsChannelIdMessages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**|  |
 **message** | **kotlin.String**|  |
 **nsfw** | **kotlin.Boolean**|  | [optional]
 **idempotentKey** | **kotlin.String**|  | [optional]
 **expandEmbedContents** | **kotlin.Boolean**|  | [optional]

### Return type

[**MessageEntity**](MessageEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postV1ChannelsDirectMessage"></a>
# **postV1ChannelsDirectMessage**
> ChannelEntity postV1ChannelsDirectMessage(targetUserProfileId)



Creates a new direct message.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.github.raa0121.kokoroio.model.*

val apiInstance = ChannelsApi()
val targetUserProfileId : kotlin.String = targetUserProfileId_example // kotlin.String | 
try {
    val result : ChannelEntity = apiInstance.postV1ChannelsDirectMessage(targetUserProfileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#postV1ChannelsDirectMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#postV1ChannelsDirectMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetUserProfileId** | **kotlin.String**|  |

### Return type

[**ChannelEntity**](ChannelEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putV1ChannelsChannelId"></a>
# **putV1ChannelsChannelId**
> ChannelEntity putV1ChannelsChannelId(channelId, channel[channelName], channel[description])



Updates a channel.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.github.raa0121.kokoroio.model.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
val channel[channelName] : kotlin.String = channel[channelName]_example // kotlin.String | 
val channel[description] : kotlin.String = channel[description]_example // kotlin.String | 
try {
    val result : ChannelEntity = apiInstance.putV1ChannelsChannelId(channelId, channel[channelName], channel[description])
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#putV1ChannelsChannelId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#putV1ChannelsChannelId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**|  |
 **channel[channelName]** | **kotlin.String**|  | [optional]
 **channel[description]** | **kotlin.String**|  | [optional]

### Return type

[**ChannelEntity**](ChannelEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putV1ChannelsChannelIdArchive"></a>
# **putV1ChannelsChannelIdArchive**
> ChannelEntity putV1ChannelsChannelIdArchive(channelId)



Archive a channel.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.github.raa0121.kokoroio.model.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
try {
    val result : ChannelEntity = apiInstance.putV1ChannelsChannelIdArchive(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#putV1ChannelsChannelIdArchive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#putV1ChannelsChannelIdArchive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**|  |

### Return type

[**ChannelEntity**](ChannelEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putV1ChannelsChannelIdManageMembersMemberId"></a>
# **putV1ChannelsChannelIdManageMembersMemberId**
> putV1ChannelsChannelIdManageMembersMemberId(channelId, memberId, authority)



Changes the authority of member

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.github.raa0121.kokoroio.model.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
val memberId : kotlin.Int = 56 // kotlin.Int | 
val authority : kotlin.String = authority_example // kotlin.String | 
try {
    apiInstance.putV1ChannelsChannelIdManageMembersMemberId(channelId, memberId, authority)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#putV1ChannelsChannelIdManageMembersMemberId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#putV1ChannelsChannelIdManageMembersMemberId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**|  |
 **memberId** | **kotlin.Int**|  |
 **authority** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putV1ChannelsChannelIdUnarchive"></a>
# **putV1ChannelsChannelIdUnarchive**
> ChannelEntity putV1ChannelsChannelIdUnarchive(channelId)



Unarchive a channel.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.github.raa0121.kokoroio.model.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
try {
    val result : ChannelEntity = apiInstance.putV1ChannelsChannelIdUnarchive(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#putV1ChannelsChannelIdUnarchive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#putV1ChannelsChannelIdUnarchive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**|  |

### Return type

[**ChannelEntity**](ChannelEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

