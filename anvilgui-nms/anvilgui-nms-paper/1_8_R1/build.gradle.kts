/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("net.wesjd.java-conventions")
}

dependencies {
    compileOnly(libs.org.spigotmc.spigot.x4)
    providedCompile(project(":anvilgui-abstraction"))
}

description = "anvilgui-1_8_R1-paper"
