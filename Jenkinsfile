node('master')
{
  stage('checkout') {
    scm checkout
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
