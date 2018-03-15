node {
  checkout scm
  stage('Package') {
      sh 'mvn clean package -DskipTests'
  }
  stage('Create Docker Image') {
      docker.build("msingh1984/mrt-hibernate-app:${env.BUILD_NUMBER}")
   }
  stage ('Run Application') {
    try {
       echo 'application is running in docker'
      //  sh 'mvn exec:java -DskipTests'
    } catch (error) {
    } finally {
      // Stop and remove database container here
      //sh 'docker-compose stop db'
      //sh 'docker-compose rm db'
    }
  }

  stage('Run Tests') {
    try {
       echo 'Runnign test'
      //  sh "mvn test"
      //  docker.build("msingh1984/mrt-hibernate-app:${env.BUILD_NUMBER}").push()
     } catch (error) {

    } finally {
      //junit '**/target/surefire-reports/*.xml'
    }
  }
}