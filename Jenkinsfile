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
            catchError {
              sh "./mvnw clean test"
            }
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
        stage('Deploy') {
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
        success {
            build 'sound-success'
        }
        failure {
            build 'sound-fail'
        }
      }
}