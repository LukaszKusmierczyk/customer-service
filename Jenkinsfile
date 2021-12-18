pipeline {
	agent any
	node { git url: 'https://github.com/LukaszKusmierczyk/customer-service.git' }
	stages {
		stage('build') {
			steps {
				sh './gradlew clean build'
			}
		}
	}
}
