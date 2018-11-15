# AccessTokensApi

All URIs are relative to *https://kokoro.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteV1AccessTokensAccessTokenId**](AccessTokensApi.md#deleteV1AccessTokensAccessTokenId) | **DELETE** /v1/access_tokens/{access_token_id} | 
[**getV1AccessTokens**](AccessTokensApi.md#getV1AccessTokens) | **GET** /v1/access_tokens | 
[**postV1AccessTokens**](AccessTokensApi.md#postV1AccessTokens) | **POST** /v1/access_tokens | 


<a name="deleteV1AccessTokensAccessTokenId"></a>
# **deleteV1AccessTokensAccessTokenId**
> AccessTokenEntity deleteV1AccessTokensAccessTokenId(accessTokenId)



Delete a access_token

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AccessTokensApi()
val accessTokenId : kotlin.String = accessTokenId_example // kotlin.String | 
try {
    val result : AccessTokenEntity = apiInstance.deleteV1AccessTokensAccessTokenId(accessTokenId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccessTokensApi#deleteV1AccessTokensAccessTokenId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccessTokensApi#deleteV1AccessTokensAccessTokenId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessTokenId** | **kotlin.String**|  |

### Return type

[**AccessTokenEntity**](AccessTokenEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getV1AccessTokens"></a>
# **getV1AccessTokens**
> AccessTokenEntity getV1AccessTokens()



Returns user&#39;s access tokens

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AccessTokensApi()
try {
    val result : AccessTokenEntity = apiInstance.getV1AccessTokens()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccessTokensApi#getV1AccessTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccessTokensApi#getV1AccessTokens")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccessTokenEntity**](AccessTokenEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postV1AccessTokens"></a>
# **postV1AccessTokens**
> AccessTokenEntity postV1AccessTokens(name)



Creates new access token

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AccessTokensApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : AccessTokenEntity = apiInstance.postV1AccessTokens(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccessTokensApi#postV1AccessTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccessTokensApi#postV1AccessTokens")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |

### Return type

[**AccessTokenEntity**](AccessTokenEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

