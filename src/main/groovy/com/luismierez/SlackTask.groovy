package com.luismierez

import groovy.json.JsonBuilder
import groovy.json.JsonOutput
import groovyx.net.http.ContentType
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.Method
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by luismierez on 4/14/17.
 */
class SlackTask extends DefaultTask {

    @TaskAction
    public post() {
        def baseUrl = project.slack.getWebHook()

        def http = new HTTPBuilder(baseUrl)

        def jsonBuilder = new JsonBuilder(project.slack)
//        jsonBuilder {
//            text project.slack.getText()
//            attachments project.slack.getAttachments().collect {
//                [
//                        text : it
//                ]
//            }
//        }

        http.request(Method.POST) {
            requestContentType = ContentType.JSON
            body = jsonBuilder.toString()

            headers.'User-Agent' = 'gradle-slack-plugin'
            headers.'Content-type' = 'application/json'

            def postLogMessage = "POST ${uri.path}\n" +
                    " > User-Agent: ${headers['User-Agent']}\n" +
                    " > body: $body\n"
            logger.debug "$postLogMessage"

            response.success = { resp, json ->
                logger.debug "< $resp.statusLine"
                logger.debug "< $json"
            }
        }


    }
}
