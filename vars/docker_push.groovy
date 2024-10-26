def docker_push(String ProjectName, String Tag, String User){
    withCredentials([usernamePassword('credentialsId':"DockerHubCred",
                    passwordVariable:"dockerHubPass",
                    usernameVariable:"dockerHubUser")]){
                    sh "docker login -u ${User} -p ${dockerHubPass}"
    }
                    sh "docker push ${User}/${ProjectName}:${Tag}"
                  
}
