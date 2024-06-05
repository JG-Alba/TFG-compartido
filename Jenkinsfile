pipeline {
    agent any

    stages {
        stage('Update Apache Configuration') {
            steps {
                script {
                    // Copiar el archivo actualizado index.html al directorio raíz de apache
                    sh 'sudo docker cp /var/jenkins_home/workspace/apache/index.html cpagina:/var/www/html/'
                }
            }
        }
    }
