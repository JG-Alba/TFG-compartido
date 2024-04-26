package org.nazaret

Void buildContainer(String tag) {
    withDockerRegistry([credentialsId: 'DOCKER_HUB', url: 'https://index.docker.io/v1/']) {
        def dockerImage = docker.build("nginx:${tag}")
        dockerImage.push() 
    }
}

return this
