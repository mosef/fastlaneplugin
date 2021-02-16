package com.github.mosef.fastlaneplugin.services

import com.github.mosef.fastlaneplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
