node {
  checkout scm
  stage('Package') {
      sh 'mvn clean package -DskipTests'
  }
  stage('Create Docker Image') {
    dir('webapp') {
      docker.build("msingh1984/mrt-hibernate-app:${env.BUILD_NUMBER}")
    }
  }

  stage ('Run Application') {
    try {
      dir ('webapp') {
        sh 'mvn exec:java -DskipTests'
      }
    } catch (error) {
    } finally {
      // Stop and remove database container here
      //sh 'docker-compose stop db'
      //sh 'docker-compose rm db'
    }
  }

  stage('Run Tests') {
    try {
      dir('webapp') {
        sh "mvn test"
        docker.build("msingh1984/mrt-hibernate-app:${env.BUILD_NUMBER}").push()
      }
    } catch (error) {

    } finally {
      junit '**/target/surefire-reports/*.xml'
    }
  }
}