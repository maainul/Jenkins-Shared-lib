def call(String dockerHubUser,String ProjectName, String ImageTag ){
  echo "Building the Docker image..."
  sh "docker build -t ${dockerHubUser}/${ProjectName}:${ImageTag} .'
  echo "Docker image built successfully!"
}
