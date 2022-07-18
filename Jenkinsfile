pipeline {
  agent any
  stages {
    stage('MainStage') {
      parallel {
        stage('MainStage') {
          environment {
            zmienna = 'moja2zmienna'
          }
          steps {
            sh 'echo $zmienna'
          }
        }

        stage('Sec') {
          steps {
            sh 'pwd'
          }
        }

      }
    }

  }
  environment {
    zmienna = 'testowaZmienna'
  }
}