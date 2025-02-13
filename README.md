# Jenkins-Docker-DSL

### Start up

pull jenkins image
`docker pull jenkins/jenkins`

create docker volume
`docker volume create jenkins_data`

run container
`docker run -d -p 8080:8080 -p 50000:50000 -v jenkins_data:/var/jenkins_home --name jenkins jenkins/jenkins`

get password
`docker exec jenkins cat /var/jenkins_home/secrets/initialAdminPassword`