pipeline {
    agent any

    stages {
        stage('Update Apache Configuration') {
            steps {
                script {
                    // Copiar el archivo index.html actualizado al directorio raíz de Apache
                    sh 'docker cp /var/jenkins_home/workspace/apache/index.html cpagina:/var/www/html/'
                }
            }
        }
    }
}
