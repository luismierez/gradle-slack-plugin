package com.luismierez


import com.google.common.net.MediaType
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by luismierez on 4/14/17.
 */
//class SlackTask extends DefaultTask {
//
//    @TaskAction
//    public post() {
//        def baseUrl = project.slack.getWebHook()
//
//        def http = new HTTPBuilder(baseUrl)
//
////        def jsonBuilder = new JsonBuilder(project.slack)
//        def jsonBuilder = new JsonBuilder()
//
//        jsonBuilder { }
//
//
//        http.request(Method.POST) {
//            requestContentType = ContentType.JSON
//            body = jsonBuilder.toString()
//
//            headers.'User-Agent' = 'gradle-slack-plugin'
//            headers.'Content-type' = 'application/json'
//
//            def postLogMessage = "POST ${uri.path}\n" +
//                    " > User-Agent: ${headers['User-Agent']}\n" +
//                    " > body: $body\n"
//            logger.debug "$postLogMessage"
//
//            response.success = { resp, json ->
//                logger.debug "< $resp.statusLine"
//                logger.debug "< $json"
//            }
//        }
//
//
//    }
//}

open class SlackTask: DefaultTask() {

    @TaskAction
    fun post() {
        val slackExtension = project.extensions.getByType(SlackExtension::class.java)
        val baseUrl = slackExtension.webHook

        logger.debug(slackExtension.toString())

    }
}
