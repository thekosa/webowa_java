pipeline {
    agent any
    tools {
        maven 'maven_3.9'
    }
    stages {
        stage("pull") {
            steps {
                git url: 'https://github.com/thekosa/webowa_java.git', branch: 'master'
            }
        }
        stage("build") {
            steps {
                // bat 'mvn clean package'
                sh 'mvn clean package'
            }
        }
    }
    post {
        success {
            archiveArtifacts 'target/*.war'
			sh 'cp target/webowa.war /home/kosecki/Desktop/jenkins_test/wildfly-38.0.1.Final/standalone/deployments/'
        }
    }
}