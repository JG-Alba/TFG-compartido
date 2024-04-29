pipeline {
    agent any

    stages {
        stage('Update Nginx Configuration') {
            steps {
                script {
                    // Copiar el archivo actualizado index.nginx-debian.html al directorio raíz de Nginx
                    sh 'sudo cp /var/jenkins_home/workspace/cambios\ nginx/index.nginx-debian.html /var/www/html/'

                    // Reiniciar Nginx para aplicar los cambios
                    sh 'sudo systemctl restart nginx'
                }
            }
        }
    }

    post {
        success {
            echo 'Configuración de Nginx actualizada exitosamente!'
        }
        failure {
            echo 'Error al actualizar la configuración de Nginx.'
        }
    }
}
