/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("net.wesjd.java-conventions")
}

dependencies {
    compileOnly(libs.org.bukkit.craftbukkit)
    providedCompile(project(":anvilgui-abstraction"))
}

description = "anvilgui-1_7_R4-spigot"
