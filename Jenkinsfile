pipeline {
    agent any

    stages {
        stage('Update Apache Configuration') {
            steps {
                script {
                    // Copiar el archivo actualizado index.html al directorio raíz de apache
                    sh 'sudo docker cp /var/jenkins_home/workspace/apache/index.html cpagina:/var/www/html/'

                    // Verificar si el archivo se ha copiado correctamente
                    sh 'docker exec cpagina ls -la /var/www/html/'

                    // Mostrar el contenido del archivo copiado para verificar que es el correcto
                    sh 'docker exec cpagina cat /var/www/html/index.html'

                    // Reiniciar apache para aplicar los cambios
                    sh 'docker exec -u root cpagina service apache2 restart'

                    // Verificar el estado del servicio Apache
                    sh 'docker exec -u root cpagina service apache2 status'
                }
            }
        }
    }
}
