node('master')
{
  stage('checkout') {
    checkout scm
  }
  
  stage('build simple') {
    dir('simple-multi') {
      sh "mvn clean build"
    }
  }
  
  stage('build extended') {
    dir('extended-multi') {
      sh "mvn clean build"
    }
  }
}
