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

	    	post {
        	    always {
        	        junit 'build/test-results/test/*.xml'

        	        emailext attachLog: true,
        	            body: 'Please go to ${BUILD_URL} and verify the build',
        	            compressLog: true,
        	            subject: 'Job \'${JOB_NAME}\' (${BUILD_NUMBER} is waiting for input)',
        	            to: 'lkusmierczyk@gmail.com'
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

