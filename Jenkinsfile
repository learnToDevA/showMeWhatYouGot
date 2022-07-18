pipeline {
  agent any
  stages {
    stage('Main') {
      agent any
      environment {
        zmienna = 'mojazmienna'
      }
      steps {
        sh 'echo $zmienna'
      }
    }

  }
}