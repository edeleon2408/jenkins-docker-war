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
    }
    
  }
}
