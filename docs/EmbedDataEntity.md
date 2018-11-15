
# EmbedDataEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cache_age** | **kotlin.Int** | Cache age (in seconds) |  [optional]
**medias** | [**kotlin.Array&lt;EmbedDataMediaEntity&gt;**](EmbedDataMediaEntity.md) |  |  [optional]
**metadata_image** | [**EmbedDataMediaEntity**](EmbedDataMediaEntity.md) | A media which describes the resource |  [optional]
**restriction_policy** | [**inline**](#Restriction_policyEnum) | Restriction policy |  [optional]
**title** | **kotlin.String** | Title of resource |  [optional]
**type** | [**inline**](#TypeEnum) | Resource type |  [optional]
**url** | **kotlin.String** | URL of resource |  [optional]


<a name="Restriction_policyEnum"></a>
## Enum: restriction_policy
Name | Value
---- | -----
restriction_policy | Unknown, Safe, NotSafe


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | MixedContent, SingleImage, SingleVideo, SingleAudio



