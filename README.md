# AndroidAnimations
 Android Animations to make your output layout look more beautiful and attractive. 

<h3>Animation Sample </h3>

<img src="sample.gif" alt="animationsample" height="340" width="192"/>



Only three steps to use the animations in your android project:


1. Add repository to your build file 

       allprojects {
            repositories {
          ...
          maven { url 'https://jitpack.io' }
         }
        }
        
2. Add the dependency
      
          dependencies {
	        implementation 'com.github.sayyedrizwan:AndroidAnimations:1.2'
      	}


OR 

ADD Through <b> MAVEN </b>

ADD  Add repository to your build file


	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
	
	
Add the maven dependency


	<dependency>
	    <groupId>com.github.sayyedrizwan</groupId>
	    <artifactId>AndroidAnimations</artifactId>
	    <version>1.2</version>
	</dependency>
