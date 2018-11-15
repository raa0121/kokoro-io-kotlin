# MembershipsApi

All URIs are relative to *https://kokoro.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteV1MembershipsId**](MembershipsApi.md#deleteV1MembershipsId) | **DELETE** /v1/memberships/{id} | 
[**getV1Memberships**](MembershipsApi.md#getV1Memberships) | **GET** /v1/memberships | 
[**postV1Memberships**](MembershipsApi.md#postV1Memberships) | **POST** /v1/memberships | 
[**putV1MembershipsId**](MembershipsApi.md#putV1MembershipsId) | **PUT** /v1/memberships/{id} | 
[**putV1MembershipsIdJoin**](MembershipsApi.md#putV1MembershipsIdJoin) | **PUT** /v1/memberships/{id}/join | 


<a name="deleteV1MembershipsId"></a>
# **deleteV1MembershipsId**
> MembershipEntity deleteV1MembershipsId(id)



Delete a membership.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = MembershipsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : MembershipEntity = apiInstance.deleteV1MembershipsId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MembershipsApi#deleteV1MembershipsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MembershipsApi#deleteV1MembershipsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**MembershipEntity**](MembershipEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getV1Memberships"></a>
# **getV1Memberships**
> MembershipEntity getV1Memberships(archived, authority)



Returns user&#39;s memberships.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = MembershipsApi()
val archived : kotlin.Boolean = true // kotlin.Boolean | 
val authority : kotlin.String = authority_example // kotlin.String | 
try {
    val result : MembershipEntity = apiInstance.getV1Memberships(archived, authority)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MembershipsApi#getV1Memberships")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MembershipsApi#getV1Memberships")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **archived** | **kotlin.Boolean**|  | [optional]
 **authority** | **kotlin.String**|  | [optional] [enum: administrator, maintainer, member, invited]

### Return type

[**MembershipEntity**](MembershipEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postV1Memberships"></a>
# **postV1Memberships**
> MembershipEntity postV1Memberships(channelId, notificationPolicy, readStateTrackingPolicy, visible, muted)



Creates a new membership.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = MembershipsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
val notificationPolicy : kotlin.String = notificationPolicy_example // kotlin.String | 
val readStateTrackingPolicy : kotlin.String = readStateTrackingPolicy_example // kotlin.String | 
val visible : kotlin.Boolean = true // kotlin.Boolean | 
val muted : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : MembershipEntity = apiInstance.postV1Memberships(channelId, notificationPolicy, readStateTrackingPolicy, visible, muted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MembershipsApi#postV1Memberships")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MembershipsApi#postV1Memberships")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**|  |
 **notificationPolicy** | **kotlin.String**|  | [optional] [enum: all_messages, only_mentions, nothing]
 **readStateTrackingPolicy** | **kotlin.String**|  | [optional] [enum: keep_latest, consume_last, consume_latest]
 **visible** | **kotlin.Boolean**|  | [optional]
 **muted** | **kotlin.Boolean**|  | [optional]

### Return type

[**MembershipEntity**](MembershipEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putV1MembershipsId"></a>
# **putV1MembershipsId**
> MembershipEntity putV1MembershipsId(id, notificationPolicy, readStateTrackingPolicy, visible, muted, latestReadMessageId)



Updates a membership.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = MembershipsApi()
val id : kotlin.String = id_example // kotlin.String | 
val notificationPolicy : kotlin.String = notificationPolicy_example // kotlin.String | 
val readStateTrackingPolicy : kotlin.String = readStateTrackingPolicy_example // kotlin.String | 
val visible : kotlin.Boolean = true // kotlin.Boolean | 
val muted : kotlin.Boolean = true // kotlin.Boolean | 
val latestReadMessageId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : MembershipEntity = apiInstance.putV1MembershipsId(id, notificationPolicy, readStateTrackingPolicy, visible, muted, latestReadMessageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MembershipsApi#putV1MembershipsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MembershipsApi#putV1MembershipsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **notificationPolicy** | **kotlin.String**|  | [optional] [enum: all_messages, only_mentions, nothing]
 **readStateTrackingPolicy** | **kotlin.String**|  | [optional] [enum: keep_latest, consume_last, consume_latest]
 **visible** | **kotlin.Boolean**|  | [optional]
 **muted** | **kotlin.Boolean**|  | [optional]
 **latestReadMessageId** | **kotlin.Int**|  | [optional]

### Return type

[**MembershipEntity**](MembershipEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putV1MembershipsIdJoin"></a>
# **putV1MembershipsIdJoin**
> MembershipEntity putV1MembershipsIdJoin(id)



Join to invited room

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = MembershipsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : MembershipEntity = apiInstance.putV1MembershipsIdJoin(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MembershipsApi#putV1MembershipsIdJoin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MembershipsApi#putV1MembershipsIdJoin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**MembershipEntity**](MembershipEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

