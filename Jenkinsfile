pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                // Checkout the code from your GitHub repository
                git 'https://ghp_ce8OxDHbfdn4bH4YpvxxKx7IM5GwON0iANbl@github.com/JG-Alba/TFG.git'
            }
        }

        stage('Update Nginx Configuration') {
            steps {
                script {
                    // Copy the updated index.nginx-debian.html file to the Nginx document root
                    sh 'sudo cp /var/jenkins_home/workspace/TFG/index.nginx-debian.html /var/www/html/'

                    // Restart Nginx to apply the changes
                    sh 'sudo systemctl restart nginx'
                }
            }
        }
    }

    post {
        success {
            echo 'Nginx configuration updated successfully!'
        }
        failure {
            echo 'Failed to update Nginx configuration.'
        }
    }
}
