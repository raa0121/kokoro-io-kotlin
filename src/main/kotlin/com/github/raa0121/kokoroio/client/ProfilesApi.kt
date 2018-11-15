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
package com.github.raa0121.kokoroio.client

import io.swagger.client.models.ProfileEntity

import io.swagger.client.infrastructure.*

class ProfilesApi(basePath: kotlin.String = "https://kokoro.io/api") : ApiClient(basePath) {

    /**
    * 
    * Returns all user&#39;s profile except yours
    * @return ProfileEntity
    */
    @Suppress("UNCHECKED_CAST")
    fun getV1Profiles() : ProfileEntity {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/v1/profiles",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<ProfileEntity>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ProfileEntity
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Returns current logged-in user&#39;s profile
    * @return ProfileEntity
    */
    @Suppress("UNCHECKED_CAST")
    fun getV1ProfilesMe() : ProfileEntity {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/v1/profiles/me",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<ProfileEntity>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ProfileEntity
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Updates your profile.
    * @param screenName  (optional)
    * @param displayName  (optional)
    * @param avatar  (optional)
    * @return ProfileEntity
    */
    @Suppress("UNCHECKED_CAST")
    fun putV1ProfilesMe(screenName: kotlin.String, displayName: kotlin.String, avatar: java.io.File) : ProfileEntity {
        val localVariableBody: kotlin.Any? = mapOf("screen_name" to "$screenName", "display_name" to "$displayName", "avatar" to "$avatar")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/v1/profiles/me",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<ProfileEntity>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ProfileEntity
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
