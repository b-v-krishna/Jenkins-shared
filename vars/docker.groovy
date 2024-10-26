def call(String ProjectName, String Tag, String User){
  sh "docker build -t ${User}/${ProjectName}:${Tag} ."
}
