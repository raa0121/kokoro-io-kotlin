# io.swagger.client - Kotlin client library for kokoro.io API document

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://kokoro.io/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccessTokensApi* | [**deleteV1AccessTokensAccessTokenId**](docs/AccessTokensApi.md#deletev1accesstokensaccesstokenid) | **DELETE** /v1/access_tokens/{access_token_id} | 
*AccessTokensApi* | [**getV1AccessTokens**](docs/AccessTokensApi.md#getv1accesstokens) | **GET** /v1/access_tokens | 
*AccessTokensApi* | [**postV1AccessTokens**](docs/AccessTokensApi.md#postv1accesstokens) | **POST** /v1/access_tokens | 
*BotApi* | [**postV1BotChannelsChannelIdMessages**](docs/BotApi.md#postv1botchannelschannelidmessages) | **POST** /v1/bot/channels/{channel_id}/messages | 
*ChannelsApi* | [**getV1Channels**](docs/ChannelsApi.md#getv1channels) | **GET** /v1/channels | 
*ChannelsApi* | [**getV1ChannelsChannelId**](docs/ChannelsApi.md#getv1channelschannelid) | **GET** /v1/channels/{channel_id} | 
*ChannelsApi* | [**getV1ChannelsChannelIdMemberships**](docs/ChannelsApi.md#getv1channelschannelidmemberships) | **GET** /v1/channels/{channel_id}/memberships | 
*ChannelsApi* | [**getV1ChannelsChannelIdMessages**](docs/ChannelsApi.md#getv1channelschannelidmessages) | **GET** /v1/channels/{channel_id}/messages | 
*ChannelsApi* | [**postV1Channels**](docs/ChannelsApi.md#postv1channels) | **POST** /v1/channels | 
*ChannelsApi* | [**postV1ChannelsChannelIdMessages**](docs/ChannelsApi.md#postv1channelschannelidmessages) | **POST** /v1/channels/{channel_id}/messages | 
*ChannelsApi* | [**postV1ChannelsDirectMessage**](docs/ChannelsApi.md#postv1channelsdirectmessage) | **POST** /v1/channels/direct_message | 
*ChannelsApi* | [**putV1ChannelsChannelId**](docs/ChannelsApi.md#putv1channelschannelid) | **PUT** /v1/channels/{channel_id} | 
*ChannelsApi* | [**putV1ChannelsChannelIdArchive**](docs/ChannelsApi.md#putv1channelschannelidarchive) | **PUT** /v1/channels/{channel_id}/archive | 
*ChannelsApi* | [**putV1ChannelsChannelIdManageMembersMemberId**](docs/ChannelsApi.md#putv1channelschannelidmanagemembersmemberid) | **PUT** /v1/channels/{channel_id}/manage_members/{member_id} | 
*ChannelsApi* | [**putV1ChannelsChannelIdUnarchive**](docs/ChannelsApi.md#putv1channelschannelidunarchive) | **PUT** /v1/channels/{channel_id}/unarchive | 
*DevicesApi* | [**deleteV1DevicesDeviceIdentifier**](docs/DevicesApi.md#deletev1devicesdeviceidentifier) | **DELETE** /v1/devices/{device_identifier} | 
*DevicesApi* | [**getV1Devices**](docs/DevicesApi.md#getv1devices) | **GET** /v1/devices | 
*DevicesApi* | [**postV1Devices**](docs/DevicesApi.md#postv1devices) | **POST** /v1/devices | 
*MembershipsApi* | [**deleteV1MembershipsId**](docs/MembershipsApi.md#deletev1membershipsid) | **DELETE** /v1/memberships/{id} | 
*MembershipsApi* | [**getV1Memberships**](docs/MembershipsApi.md#getv1memberships) | **GET** /v1/memberships | 
*MembershipsApi* | [**postV1Memberships**](docs/MembershipsApi.md#postv1memberships) | **POST** /v1/memberships | 
*MembershipsApi* | [**putV1MembershipsId**](docs/MembershipsApi.md#putv1membershipsid) | **PUT** /v1/memberships/{id} | 
*MembershipsApi* | [**putV1MembershipsIdJoin**](docs/MembershipsApi.md#putv1membershipsidjoin) | **PUT** /v1/memberships/{id}/join | 
*MessagesApi* | [**deleteV1MessagesMessageId**](docs/MessagesApi.md#deletev1messagesmessageid) | **DELETE** /v1/messages/{message_id} | 
*ProfilesApi* | [**getV1Profiles**](docs/ProfilesApi.md#getv1profiles) | **GET** /v1/profiles | 
*ProfilesApi* | [**getV1ProfilesMe**](docs/ProfilesApi.md#getv1profilesme) | **GET** /v1/profiles/me | 
*ProfilesApi* | [**putV1ProfilesMe**](docs/ProfilesApi.md#putv1profilesme) | **PUT** /v1/profiles/me | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.github.raa0121.kokoroio.model.AccessTokenEntity](docs/AccessTokenEntity.md)
 - [com.github.raa0121.kokoroio.model.AvatarEntity](docs/AvatarEntity.md)
 - [com.github.raa0121.kokoroio.model.ChannelEntity](docs/ChannelEntity.md)
 - [com.github.raa0121.kokoroio.model.ChannelWithMembershipsEntity](docs/ChannelWithMembershipsEntity.md)
 - [com.github.raa0121.kokoroio.model.ChannelWithoutMembershipEntity](docs/ChannelWithoutMembershipEntity.md)
 - [com.github.raa0121.kokoroio.model.DeviceEntity](docs/DeviceEntity.md)
 - [com.github.raa0121.kokoroio.model.EmbedContentEntity](docs/EmbedContentEntity.md)
 - [com.github.raa0121.kokoroio.model.EmbedDataEntity](docs/EmbedDataEntity.md)
 - [com.github.raa0121.kokoroio.model.EmbedDataImageInfoEntity](docs/EmbedDataImageInfoEntity.md)
 - [com.github.raa0121.kokoroio.model.EmbedDataMediaEntity](docs/EmbedDataMediaEntity.md)
 - [com.github.raa0121.kokoroio.model.MembershipEntity](docs/MembershipEntity.md)
 - [com.github.raa0121.kokoroio.model.MembershipWithoutChannelEntity](docs/MembershipWithoutChannelEntity.md)
 - [com.github.raa0121.kokoroio.model.MessageEntity](docs/MessageEntity.md)
 - [com.github.raa0121.kokoroio.model.ProfileEntity](docs/ProfileEntity.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
