package com.luismierez

import org.gradle.api.NamedDomainObjectContainer

/**
 * Created by luismierez on 4/14/17.
 */
class SlackExtension {

    String webHook
    String text
    NamedDomainObjectContainer<Attachment> attachments

    String getBaseUrl() {
        return baseUrl
    }

    String getText() {
        return text
    }

    void setText(String text) {
        this.text = text
    }

    Attachment[] getAttachments() {
        return attachments
    }

//    void setAttachments(Attachment[] attachments) {
//        this.attachments = attachments
//  }

    def attachments(final Closure configureClosure) {
        attachments.configure(configureClosure)
    }

    String getWebHook() {
        return webHook
    }

    void setWebHook(String webHook) {
        this.webHook = webHook
    }
}
