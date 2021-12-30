@Library("shared-library") _

pipeline {
	agent any

	stages {
	    stage('helloWorld') {
	        steps {
	            helloWorld(name: "Lukasz", dayOfWeek: "Thursday")
	        }
	    }
		stage('checkout') {
			steps {
				git url: 'https://github.com/LukaszKusmierczyk/customer-service.git', branch: 'main'
			}
		}
		stage('build') {
		    steps {
		        sh './gradlew clean build'
		    }

	    	post {
        	    always {
        	        junit 'build/test-results/test/*.xml'
        	    }
        	}
		}
		stage('create docker image') {
		    steps {
		        sh "docker build . -t customer-service:${env.BUILD_ID}"
		    }
		}
	}
}
