/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("net.wesjd.java-conventions")
}

dependencies {
    compileOnly(libs.org.spigotmc.spigot.x19)
    providedCompile(project(":anvilgui-abstraction"))
}

description = "anvilgui-1_16_R3-paper"
