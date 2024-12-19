plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.codemc.org/repository/nms/")
    }

    maven {
        url = uri("https://repo.opencollab.dev/main/")
    }

    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

group = "net.wesjd"
version = "1.10.4-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}
