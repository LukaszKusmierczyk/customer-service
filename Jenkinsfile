pipeline {
	agent any

	stages {
		stage('checkout') {
			steps {
				git url: 'https://github.com/LukaszKusmierczyk/customer-service.git', branch: 'main'
			}
		}
		stage('build') {
		    steps {
		        sh './gradlew clean build'
		    }
		}
	}
	post {
	    always {
	        junit 'build/test-results/test/*.xml'
	    }
	}
}
