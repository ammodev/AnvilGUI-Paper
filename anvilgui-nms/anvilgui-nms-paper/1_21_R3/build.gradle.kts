/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("net.wesjd.java-conventions")
}

dependencies {
    compileOnly(libs.org.spigotmc.spigot)
    providedCompile(project(":anvilgui-abstraction"))
}

description = "anvilgui-1_21_R3-paper"
