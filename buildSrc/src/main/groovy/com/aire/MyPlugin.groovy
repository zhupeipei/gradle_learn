package com.aire

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task("dddd") {
            println "Hi from Code4Reference plugin!"
        }
    }
}