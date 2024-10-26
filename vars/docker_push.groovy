def call(String ProjectName, String Tag, string User){
    withCredentials([usernamePassword('credentialsId':"DockerHubCred",
                    passwordVariable:"dockerHubPass",
                    usernameVariable:"dockerHubUser")]){
                    sh "docker login -u ${User} -p ${dockerHubPass}"
    }
                    sh "docker push ${User}/${ProjectName}:${Tag}"
                  
}
