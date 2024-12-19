plugins {
    `java-conventions`
}

dependencies {
    compileOnly("org.spigotmc:spigot:1.8-R0.1-SNAPSHOT")
}

dependencies {
    compileOnly(project(":anvilgui-abstraction"))

    compileOnly("org.spigotmc:spigot:1.8-R0.1-SNAPSHOT")
    compileOnly(libs.geyser)

    compileOnly(project(":anvilgui-nms:anvilgui-nms-spigot:anvilgui-1_7_R4-spigot"))
}

description = "anvilgui"
