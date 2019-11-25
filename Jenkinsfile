pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building..'
      }
    }

    stage('Test') {
      steps {
        echo 'Testing..'
      }
    }

    stage('Deploy') {
      parallel {
        stage('Deploy') {
          steps {
            echo 'Deploying....'
          }
        }

        stage('mvn') {
          steps {
            sh '/opt/maven/bin/mvn compile&&/opt/maven/bin/mvn package'
          }
        }

      }
    }

  }
}
