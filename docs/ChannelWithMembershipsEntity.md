
# ChannelWithMembershipsEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | チャンネルID |  [optional]
**channel_name** | **kotlin.String** | チャンネル名 |  [optional]
**kind** | [**inline**](#KindEnum) | チャンネルタイプ |  [optional]
**archived** | **kotlin.Boolean** | アーカイブ済か |  [optional]
**description** | **kotlin.String** | チャンネル説明 |  [optional]
**latest_message_id** | **kotlin.Int** | 最新メッセージ |  [optional]
**latest_message_published_at** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | 最新メッセージ投稿日時 |  [optional]
**messages_count** | **kotlin.Int** | メッセージ数 |  [optional]
**membership** | [**MembershipEntity**](MembershipEntity.md) | メンバーシップ情報 |  [optional]
**memberships** | [**MembershipWithoutChannelEntity**](MembershipWithoutChannelEntity.md) |  |  [optional]


<a name="KindEnum"></a>
## Enum: kind
Name | Value
---- | -----
kind | public_channel, private_channel, direct_message



