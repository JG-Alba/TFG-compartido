package org.nazaret

Void buildContainer(String tag) {
    withDockerRegistry([credentialsId: 'DOCKER_HUB', url: '']) {
        def dockerImage = docker.build("nginx/TFG:${tag}")
        dockerImage.push() 
    }
}

return this
