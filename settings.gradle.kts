pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}
/**
 * module-common : 도메인, 공통 컴포넌트 등 
 * module-web : FO, 데이터 확인용 웹
 * module-batch : Batch 개발
 */
rootProject.name = "parent-module"
include("module-web")
include("module-common")
