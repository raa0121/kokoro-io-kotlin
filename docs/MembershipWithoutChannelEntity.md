
# MembershipWithoutChannelEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | メンバーシップID |  [optional]
**authority** | [**inline**](#AuthorityEnum) | 権限 |  [optional]
**disable_notification** | **kotlin.Boolean** | 通知をオフにしているか（deprecated: use \&quot;notification_policy\&quot; instead.） |  [optional]
**notification_policy** | [**inline**](#Notification_policyEnum) | 通知ポリシー |  [optional]
**read_state_tracking_policy** | [**inline**](#Read_state_tracking_policyEnum) | 未読メッセージ表示ポリシー |  [optional]
**latest_read_message_id** | **kotlin.Int** | 一番新しい既読メッセージ |  [optional]
**unread_count** | **kotlin.Int** | 未読数（WIP） |  [optional]
**visible** | **kotlin.Boolean** | チャット画面のチャンネル一覧ペインに表示する |  [optional]
**muted** | **kotlin.Boolean** | チャット画面のチャンネル一覧ペインにて未読数表示をオフにし、表示を薄くする |  [optional]
**profile** | [**ProfileEntity**](ProfileEntity.md) | プロフィール情報 |  [optional]


<a name="AuthorityEnum"></a>
## Enum: authority
Name | Value
---- | -----
authority | administrator, maintainer, member, invited


<a name="Notification_policyEnum"></a>
## Enum: notification_policy
Name | Value
---- | -----
notification_policy | all_messages, only_mentions, nothing


<a name="Read_state_tracking_policyEnum"></a>
## Enum: read_state_tracking_policy
Name | Value
---- | -----
read_state_tracking_policy | keep_latest, consume_last, consume_latest



