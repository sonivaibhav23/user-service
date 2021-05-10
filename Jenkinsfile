pipeline {
    agent any

    stages {
        stage('One') {
            steps {
                echo 'Hi, this is Vaibhav'
            }
        }

        stage('Two') {
            steps {
                input('Do you want to proceed?')
            }
        }

        stage('Build') {
            steps{
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Four') {
            steps {
                echo 'Finished'
            }
        }
    }
}