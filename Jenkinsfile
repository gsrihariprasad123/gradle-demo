node {
   

    stage 'Build'
        git url: 'https://github.com/gsrihariprasad123/gradle-demo.git'

  stage "Build/Analyse/Test"
    sh "./gradlew clean build"
    archiveUnitTestResults()
    archiveCheckstyleResults()
    
    stage "Generate AMI"
    sh "./gradlew boxfuseFuse"
    
    stage name: "Deploy to AWS", concurrency: 1
    sh "./gradlew boxfuseRun"


}
