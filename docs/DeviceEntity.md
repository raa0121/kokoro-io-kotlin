
# DeviceEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | デバイス名 |  [optional]
**kind** | [**inline**](#KindEnum) | デバイス種別 |  [optional]
**device_identifier** | **kotlin.String** | デバイスを特定するための任意の一意の文字列 |  [optional]
**notification_identifier** | **kotlin.String** | プッシュ通知を送るためのidentifier |  [optional]
**subscribe_notification** | **kotlin.Boolean** | プッシュ通知を受け取りたいか |  [optional]
**last_activity_at** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | 最後にデバイスを使用した日時 |  [optional]
**push_registered** | **kotlin.Boolean** | プッシュ通知サービスに登録されているかどうか |  [optional]
**access_token** | [**AccessTokenEntity**](AccessTokenEntity.md) | デバイス用アクセストークン |  [optional]


<a name="KindEnum"></a>
## Enum: kind
Name | Value
---- | -----
kind | unknown, ios, android, uwp, chrome, firefox, official_web



