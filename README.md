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
	

Add animation code to apply.

	Contect context = MainActivity.this;
	
	 Anims./*type of animation */ (context, Views);
	 
	 eg:- Anims.fadeApperance(context, rellayout);
	 
<b>Type of Animations to use<b>

	leftApperance;
	
	popup;
	
	rightApperance;
	
	bottomApperance;

	topApperance;
	
	lefttopApperance;
	
	rightbottomApperance;
	
	leftbottomApperance;
	
	righttopApperance;
	
	fadeApperance;
	
	floatUp;
	
	floatLeft;
	
	floatRight;
	
	floatBottom;







License


		Copyright 2018-2019 Wallpo Inc.

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

   	http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
	
	
	
	
	
	
	
	
<p> <font size="6"> Founder Rizwan Sayyed </font> </p>
