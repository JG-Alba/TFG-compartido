pipeline {
    agent any

    stages {
        stage('Update apache Configuration') {
            steps {
                script {
                    // Copiar el archivo actualizado index.html al directorio raíz de apache
                    sh 'docker cp /var/jenkins_home/workspace/apache/index.html cpagina:/var/www/html/'

                    // Reiniciar apache para aplicar los cambios
                    sh 'docker exec -it -u root cpagina service apache2 restart'
                }
            }
        }
    }

    post {
        success {
            echo 'Configuración de apache actualizada exitosamente!'
        }
        failure {
            echo 'Error al actualizar la configuración de apache.'
        }
    }
}
