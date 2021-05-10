pipeline {
    agent none

    stages {
        stage('Maven Build') {
            steps {
                container('java') {
                    mvnBuild(
                        junitTestReportsEnabled: false
                    )
                }
                // sh 'mvn clean install -DskipTests'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}