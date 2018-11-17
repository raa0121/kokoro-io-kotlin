# DevicesApi

All URIs are relative to *https://kokoro.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteV1DevicesDeviceIdentifier**](DevicesApi.md#deleteV1DevicesDeviceIdentifier) | **DELETE** /v1/devices/{device_identifier} | 
[**getV1Devices**](DevicesApi.md#getV1Devices) | **GET** /v1/devices | 
[**postV1Devices**](DevicesApi.md#postV1Devices) | **POST** /v1/devices | 


<a name="deleteV1DevicesDeviceIdentifier"></a>
# **deleteV1DevicesDeviceIdentifier**
> DeviceEntity deleteV1DevicesDeviceIdentifier(deviceIdentifier)



Delete a device

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.github.raa0121.kokoroio.model.*

val apiInstance = DevicesApi()
val deviceIdentifier : kotlin.String = deviceIdentifier_example // kotlin.String | 
try {
    val result : DeviceEntity = apiInstance.deleteV1DevicesDeviceIdentifier(deviceIdentifier)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DevicesApi#deleteV1DevicesDeviceIdentifier")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevicesApi#deleteV1DevicesDeviceIdentifier")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceIdentifier** | **kotlin.String**|  |

### Return type

[**DeviceEntity**](DeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getV1Devices"></a>
# **getV1Devices**
> DeviceEntity getV1Devices()



Returns user&#39;s devices

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.github.raa0121.kokoroio.model.*

val apiInstance = DevicesApi()
try {
    val result : DeviceEntity = apiInstance.getV1Devices()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DevicesApi#getV1Devices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevicesApi#getV1Devices")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DeviceEntity**](DeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postV1Devices"></a>
# **postV1Devices**
> DeviceEntity postV1Devices(name, kind, deviceIdentifier, notificationIdentifier, subscribeNotification)



Creates new device

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.github.raa0121.kokoroio.model.*

val apiInstance = DevicesApi()
val name : kotlin.String = name_example // kotlin.String | 
val kind : kotlin.String = kind_example // kotlin.String | 
val deviceIdentifier : kotlin.String = deviceIdentifier_example // kotlin.String | 
val notificationIdentifier : kotlin.String = notificationIdentifier_example // kotlin.String | 
val subscribeNotification : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : DeviceEntity = apiInstance.postV1Devices(name, kind, deviceIdentifier, notificationIdentifier, subscribeNotification)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DevicesApi#postV1Devices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevicesApi#postV1Devices")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **kind** | **kotlin.String**|  | [default to chrome] [enum: unknown, ios, android, uwp, chrome, firefox, official_web]
 **deviceIdentifier** | **kotlin.String**|  |
 **notificationIdentifier** | **kotlin.String**|  | [optional]
 **subscribeNotification** | **kotlin.Boolean**|  | [optional]

### Return type

[**DeviceEntity**](DeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

