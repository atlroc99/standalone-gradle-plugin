package com.plugin.test

import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginTest implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task("copyToS3") {
            println("copying files to s3...")
        }

        project.task("deployToEC2") {
            println("deploying stuff to EC2 instance")
        }
    }
}
