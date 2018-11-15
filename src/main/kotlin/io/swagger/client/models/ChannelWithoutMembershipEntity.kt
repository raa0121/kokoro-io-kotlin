/**
* kokoro.io API document
* X-Access-Token ヘッダーにあなたのアカウントのAPIトークンを含めることでAPIへのアクセスを行うことが出来ます。APIトークンはウェブ管理画面の右上メニュー「アカウント情報 > API情報」から確認可能です。  ただし、 POST /api/v1/devices/ APIへのリクエスト時のみ、APIトークンではなくあなたのアカウント情報を用いて認証を行うことが出来ます。この場合、X-Access-TokenではなくX-Account-Token ヘッダーを使用し、その値にはアカウントのメールアドレスとパスワードをコロンで連結した文字列 \"[email]:[password]\" を Base64 エンコードしたものを指定してください。  また、このページ右上の「Your API token here」の欄にAPIトークンを入力し「Explore」ボタンをクリックすることで、このページの各API説明部分にある「Try it out!」ボタンから実際にAPIを呼び出すことが可能になります。この時、通常のAPI呼び出しと同様、アカウントへの操作が実際に行われますのでご注意ください。 
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.models


/**
 * 
 * @param id チャンネルID
 * @param channel_name チャンネル名
 * @param kind チャンネルタイプ
 * @param archived アーカイブ済か
 * @param description チャンネル説明
 * @param latest_message_id 最新メッセージ
 * @param latest_message_published_at 最新メッセージ投稿日時
 * @param messages_count メッセージ数
 */
data class ChannelWithoutMembershipEntity (
    /* チャンネルID */
    val id: kotlin.String? = null,
    /* チャンネル名 */
    val channel_name: kotlin.String? = null,
    /* チャンネルタイプ */
    val kind: ChannelWithoutMembershipEntity.Kind? = null,
    /* アーカイブ済か */
    val archived: kotlin.Boolean? = null,
    /* チャンネル説明 */
    val description: kotlin.String? = null,
    /* 最新メッセージ */
    val latest_message_id: kotlin.Int? = null,
    /* 最新メッセージ投稿日時 */
    val latest_message_published_at: java.time.LocalDateTime? = null,
    /* メッセージ数 */
    val messages_count: kotlin.Int? = null
) {

    /**
    * チャンネルタイプ
    * Values: publicChannel,privateChannel,directMessage
    */
    enum class Kind(val value: kotlin.Any){
    
        publicChannel("public_channel"),
    
        privateChannel("private_channel"),
    
        directMessage("direct_message");
    
    }

}

