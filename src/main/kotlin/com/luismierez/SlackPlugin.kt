package com.luismierez

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionContainer
import java.security.cert.Extension

/**
 * Created by luismierez on 4/14/17.
 */
//class SlackPlugin implements Plugin<Project> {
//
//    @Override
//    void apply(Project project) {
//        setupExtension(project)
//        project.task("postToSlack", type: SlackTask)
//    }
//
//    private void setupExtension(final Project project) {
//        project.extensions.create(SlackExtension.NAME, SlackExtension)
//        project.slack.extensions.create(Attachment.NAME, Attachment)
//    }
//}

open class SlackPlugin: Plugin<Project> {

    lateinit var project: Project

    override fun apply(target: Project?) {
        target?.let {
            project = target
            project.logger.info("SlackPlugin")
            project.extensions.create(SlackExtension.NAME, SlackExtension::class.java)

            project.tasks?.create("postToSlack", SlackTask::class.java)

            project.logger.info("Created postToSlack Task")

        }
    }

}
