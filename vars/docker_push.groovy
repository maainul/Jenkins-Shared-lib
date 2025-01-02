def call(String dockerHubuser,String projectName, String imageTag ){
  echo "Pushing To Docker Hub....."
  withCredentials([usernamePassword(
    credentialsId: "docker-hub-cred",
    passwordVariable: "dockerHubPass",
    usernameVariable: 'dockerHubUser')]) {
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    // sh 'docker image tag ${ProjectName}:${ImageTag} ${dockerHubUser}/${ProjectName}:${ImageTag}'
    sh "docker push ${dockerHubuser}/${projectName}:${imageTag}"
  }
  echo "Push completed!"
}
