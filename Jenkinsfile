#!groovy
pipeline {
    agent any    
    stages {
        stage('Build') {
            steps {                 
                withMaven()  {
                    sh 'mvn compile -f tippspiel-arch-test/pom.xml'
                }
            }
        }
        stage('Test') {
            steps {
                withMaven()  {
                    sh 'mvn test -f tippspiel-arch-test/pom.xml'
                }
            }
            post {
                always {
                    junit 'target/test-reports/*.xml'
                }
            }
        }
    }
}
