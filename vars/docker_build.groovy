def call(String dockerHubUser,String projectName, String imageTag ){
  echo "Building the Docker image..."
  sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
  echo "Docker image built successfully!"
}
