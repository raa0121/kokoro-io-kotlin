
# MessageEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | メッセージID |  [optional]
**idempotent_key** | **kotlin.String** | 冪等性ID(Version 4 UUID) |  [optional]
**display_name** | **kotlin.String** | 発言時の表示名 |  [optional]
**avatar** | **kotlin.String** | 発言時のアバターURL |  [optional]
**expand_embed_contents** | **kotlin.Boolean** | URLが表すコンテンツを展開するかどうか |  [optional]
**avatars** | [**kotlin.Array&lt;AvatarEntity&gt;**](AvatarEntity.md) |  |  [optional]
**status** | [**inline**](#StatusEnum) | 発言の状態 |  [optional]
**content** | **kotlin.String** | 発言内容(Deprecated. Use &#39;html_content&#39; property instead of this.) |  [optional]
**html_content** | **kotlin.String** | 発言内容 |  [optional]
**plaintext_content** | **kotlin.String** | プレインテキスト形式に変換した発言内容 |  [optional]
**raw_content** | **kotlin.String** | 発言内容（プレインテキスト） |  [optional]
**embedded_urls** | **kotlin.Array&lt;kotlin.String&gt;** | 埋め込みURL |  [optional]
**embed_contents** | [**kotlin.Array&lt;EmbedContentEntity&gt;**](EmbedContentEntity.md) | 埋め込みコンテンツ |  [optional]
**published_at** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | 発言日時 |  [optional]
**nsfw** | **kotlin.Boolean** | NSFW(Not suitable for work)かどうか |  [optional]
**channel** | [**ChannelEntity**](ChannelEntity.md) | 発言があったチャンネル |  [optional]
**profile** | [**ProfileEntity**](ProfileEntity.md) | 発言者情報 |  [optional]


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | active, deleted_by_publisher, deleted_by_another_member



