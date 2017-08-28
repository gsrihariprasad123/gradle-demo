node {
    def server = Artifactory.newServer url: SERVER_URL, credentialsId: CREDENTIALS
    def rtGradle = Artifactory.newGradleBuild()

    stage 'Build'
        git url: 'https://github.com/gsrihariprasad123/gradle-demo.git'

    stage 'Artifactory configuration'
        rtGradle.tool = GRADLE_TOOL // Tool name from Jenkins configuration
        rtGradle.deployer repo:'ext-release-local', server: server
        rtGradle.resolver repo:'remote-repos', server: server


}
