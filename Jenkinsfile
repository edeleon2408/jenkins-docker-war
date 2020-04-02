// comment
pipeline {
 agent any
 stages {
    stage('Checkout-Proyecto'){     
    	 steps{
            echo 'Revisando repositorio del Proyecto'
			git poll: true, url: 'https://github.com/edeleon2408/jenkins-docker-war.git'
         }        	
    }
    stage('Clean-and-Build-Proyecto'){     
    	 steps{
            echo 'Limpiando y Construyendo Proyecto'
			bat 'mvn clean compile install'
	   }        	
    }
    stage('Check-SonarQ-Proyecto'){     
    	 steps{
            echo 'Check Codigo en SonarQubw'
			bat 'mvn sonar:sonar -Dsonar.projectKey=jenkins-docker-war -Dsonar.host.url=http://localhost:9000 -Dsonar.login=db1020ca2e1e304eca9eb7077806c1bfd48c6ee4'
	   }        	
    }
    //stage('Build-Image-Docker'){     
    //	 steps{
    //        echo 'Construyendo Imagen Docker del Proyecto'
	//		bat 'docker build -f docker/Dockerfile -t jenkins-docker-api .'
	//		//bat 'docker rm -f jenkins-docker-api'			
	//   }        	
    //}
    stage('Build-Image-Container-Docker'){     
    	 steps{
            echo 'Construyendo Imagen y Contenedor Docker del Proyecto'	
            bat """
                   cd docker
            	   docker-compose up -d	
            	"""
	   }        	
    }//fin stage
    
  }//fin stages
  
  post {
        success {
            echo 'I will success!'
            mail bcc: '', 
            body: "<b>Notificación CI</b><br><br>Estimado Usuario, El proceso CI se ha ejecutado el proceso de manera satisfactoria.<br><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}",
            cc: '', 
            charset: 'UTF-8', 
            from: '', 
            mimeType: 'text/html', 
            replyTo: '', 
            subject: "SUCCESS CI: Project name -> ${env.JOB_NAME}", 
            to: "edeleon2408@gmail.com";  
                     
        }
        failure {
        	echo 'I will success!'
            mail bcc: '', 
            body: "<b>Notificación CI</b><br><br>Estimado Usuario, El proceso CI ha fallado, por favor notificar al area administrativa del proceso.<br><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}",
            cc: '', 
            charset: 'UTF-8', 
            from: '', 
            mimeType: 'text/html', 
            replyTo: '', 
            subject: "FAILURED CI: Project name -> ${env.JOB_NAME}", 
            to: "edeleon2408@gmail.com";
        }
    }//fin post
}
