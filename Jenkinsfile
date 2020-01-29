pipeline {
     agent any
     stages {
       stage('Pullcode') {
         steps {
             git 'git@github.com:up1/ecommerce-shopping-backend.git'
         }
       }
       stage('Testing') {
          steps {
            sh "./mvnw clean test"
            junit 'target/surefire-reports/*.xml'
          }
        }
        stage('Package') {
          steps {
            sh "./mvnw package -DSkipTests=true"
          }
        }
        stage('Code coverage') {
          steps {
             jacoco()
          }
        }
        stage('Package') {
          steps {
            sh label: '', script: '''docker-compose down
            docker-compose build --no-cache
            docker-compose up -d'''
          }
        }
      }
      post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
      }
}