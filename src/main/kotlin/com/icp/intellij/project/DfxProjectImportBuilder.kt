package com.icp.intellij.project

import com.intellij.openapi.externalSystem.model.DataNode
import com.intellij.openapi.externalSystem.model.project.ProjectData
import com.intellij.openapi.externalSystem.service.project.manage.ProjectDataManager
import com.intellij.openapi.project.Project
import java.io.File

class DfxProjectImportBuilder(projectDataManager: ProjectDataManager) : AbstractExternalProjectImportBuilder<DfxProjectImportBuilder>(projectDataManager) {
    override fun getName(): String = "DFX Project"
    
    override fun getExternalProjectConfigToUse(file: File): File = file
    
    override fun doPrepare(wizardContext: WizardContext) {
        // No additional preparation needed
    }
    
    override fun beforeCommit(dataNode: DataNode<ProjectData>, project: Project) {
        // No pre-commit actions needed
    }
    
    override fun applyExtraSettings(wizardContext: WizardContext) {
        // No extra settings to apply
    }
} 