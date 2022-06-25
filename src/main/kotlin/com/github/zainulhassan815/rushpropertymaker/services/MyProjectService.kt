package com.github.zainulhassan815.rushpropertymaker.services

import com.intellij.openapi.project.Project
import com.github.zainulhassan815.rushpropertymaker.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
