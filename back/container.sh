docker run --rm -v /var/run/docker.sock:/var/run/docker.sock -v '/home/clem/Programmation/Java/globelle-back/back':/home/gradle/project -w /home/gradle/project gradle:jdk23 gradle bootBuildImage
