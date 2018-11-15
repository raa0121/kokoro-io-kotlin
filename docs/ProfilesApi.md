# ProfilesApi

All URIs are relative to *https://kokoro.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getV1Profiles**](ProfilesApi.md#getV1Profiles) | **GET** /v1/profiles | 
[**getV1ProfilesMe**](ProfilesApi.md#getV1ProfilesMe) | **GET** /v1/profiles/me | 
[**putV1ProfilesMe**](ProfilesApi.md#putV1ProfilesMe) | **PUT** /v1/profiles/me | 


<a name="getV1Profiles"></a>
# **getV1Profiles**
> ProfileEntity getV1Profiles()



Returns all user&#39;s profile except yours

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ProfilesApi()
try {
    val result : ProfileEntity = apiInstance.getV1Profiles()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#getV1Profiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#getV1Profiles")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProfileEntity**](ProfileEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getV1ProfilesMe"></a>
# **getV1ProfilesMe**
> ProfileEntity getV1ProfilesMe()



Returns current logged-in user&#39;s profile

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ProfilesApi()
try {
    val result : ProfileEntity = apiInstance.getV1ProfilesMe()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#getV1ProfilesMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#getV1ProfilesMe")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProfileEntity**](ProfileEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putV1ProfilesMe"></a>
# **putV1ProfilesMe**
> ProfileEntity putV1ProfilesMe(screenName, displayName, avatar)



Updates your profile.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ProfilesApi()
val screenName : kotlin.String = screenName_example // kotlin.String | 
val displayName : kotlin.String = displayName_example // kotlin.String | 
val avatar : java.io.File = /path/to/file.txt // java.io.File | 
try {
    val result : ProfileEntity = apiInstance.putV1ProfilesMe(screenName, displayName, avatar)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#putV1ProfilesMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#putV1ProfilesMe")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenName** | **kotlin.String**|  | [optional]
 **displayName** | **kotlin.String**|  | [optional]
 **avatar** | **java.io.File**|  | [optional]

### Return type

[**ProfileEntity**](ProfileEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

