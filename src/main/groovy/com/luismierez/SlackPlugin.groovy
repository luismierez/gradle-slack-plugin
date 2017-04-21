package com.luismierez

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by luismierez on 4/14/17.
 */
class SlackPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        setupExtension(project)
//        project.extensions.create("slack", SlackExtension)
        project.task("postToSlack", type: SlackTask)
    }

    private void setupExtension(final Project project) {

        final NamedDomainObjectContainer<SlackExtension> extensions =
                project.container(SlackExtension)

        extensions.all {
            attachments = project.container(Attachment)
        }
        project.extensions.create("slack", SlackExtension)
    }

//    private void createSlackTask(final Project project) {
//        def slack = project.extensions.getByName("slack")
//
//        slack.all {
//            def slackInfo = delegate
//            attachments.all {
//                def attachmentsInfo = delegate
//
//            }
//        }
//    }
}
