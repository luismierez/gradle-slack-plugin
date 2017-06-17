package com.luismierez

import org.gradle.api.NamedDomainObjectContainer

/**
 * Created by luismierez on 4/14/17.
 */
//class SlackExtension {
//
//    public static String NAME = "slack"
//    String webHook
//    String text
//
////    Attachment attachment = new Attachment()
//
//    String getBaseUrl() {
//        return baseUrl
//    }
//
//    String getText() {
//        return text
//    }
//
//    void setText(String text) {
//        this.text = text
//    }
//
//    String getWebHook() {
//        return webHook
//    }
//
//    void setWebHook(String webHook) {
//        this.webHook = webHook
//    }
//}

open class SlackExtension(var webHook: String,
                          var text: String) {

    companion object {
        val NAME = "slack"
    }
}
