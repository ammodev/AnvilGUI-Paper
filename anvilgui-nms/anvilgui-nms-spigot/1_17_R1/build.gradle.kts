/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("net.wesjd.java-conventions")
}

dependencies {
    compileOnly(libs.org.spigotmc.spigot.x29)
    compileOnly(libs.net.wesjd.anvilgui.v1.v17.v1.r1)
    providedCompile(project(":anvilgui-abstraction"))
}

description = "anvilgui-1_17_R1-spigot"
