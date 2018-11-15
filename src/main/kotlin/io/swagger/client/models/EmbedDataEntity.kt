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

import io.swagger.client.models.EmbedDataMediaEntity

/**
 * 
 * @param cache_age Cache age (in seconds)
 * @param medias 
 * @param metadata_image A media which describes the resource
 * @param restriction_policy Restriction policy
 * @param title Title of resource
 * @param type Resource type
 * @param url URL of resource
 */
data class EmbedDataEntity (
    /* Cache age (in seconds) */
    val cache_age: kotlin.Int? = null,
    /*  */
    val medias: kotlin.Array<EmbedDataMediaEntity>? = null,
    /* A media which describes the resource */
    val metadata_image: EmbedDataMediaEntity? = null,
    /* Restriction policy */
    val restriction_policy: EmbedDataEntity.RestrictionPolicy? = null,
    /* Title of resource */
    val title: kotlin.String? = null,
    /* Resource type */
    val type: EmbedDataEntity.Type? = null,
    /* URL of resource */
    val url: kotlin.String? = null
) {

    /**
    * Restriction policy
    * Values: unknown,safe,notSafe
    */
    enum class RestrictionPolicy(val value: kotlin.Any){
    
        unknown("Unknown"),
    
        safe("Safe"),
    
        notSafe("NotSafe");
    
    }

    /**
    * Resource type
    * Values: mixedContent,singleImage,singleVideo,singleAudio
    */
    enum class Type(val value: kotlin.Any){
    
        mixedContent("MixedContent"),
    
        singleImage("SingleImage"),
    
        singleVideo("SingleVideo"),
    
        singleAudio("SingleAudio");
    
    }

}

