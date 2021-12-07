[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=6308581&assignment_repo_type=AssignmentRepo)

As someone who struggles with health and weight on a daily basis, I decided to implement an application which would keep track of my BMI, BMR and exercise levels all in one place. For those unfamiliar, BMI is Body Mass Index, which tracks your weight to height ratio while BMR is an individual's Basal Metabolic Rate, which figures out how many calories a body burns daily. These measurements alongside recommended exercise levels can help an individual maintain and lose weight. 

HOW TO RUN THE APPLICATION:

STEP 1: Download the Github Folder "HealthTrack" and open it in your preferred IDE. Next, open three terminal windows

STEP 2: Set the directory of the first terminal window to the Classes Folder in HealthTrack. Run the command 'rmiregistry' in this terminal.

STEP 3: Set the directory of the second terminal to the src Folder in HealthTrack. Run the command "javac -d classes/ star.java".          
IMPORTANT NOTE: replace the word star with the actual star sign. The word star is used here since the README file could not register the symbol seperately as it is used to turn text italic.

STEP 4: Reset the directory of the second terminal to the Classes Folder by using 'cd Classes'. Now run the command "java -Djava.security.policy=policy.txt HealthServer". The Server should now  be running.

STEP 5: Set the directory of the third terminal to the Classes Folder in HealthTrack.

STEP 6: Type in the command 'hostname' into the third terminal. This should give you your hostname. In my case it was Macbook-Pro.local. Remember this hostname

STEP 7: Run the following command in the third terminal:  "java HealthClient hostname". For example in my case it was: "java HealthClient MacBook-Pro.local"
Your Client should now be Ready to use.

Enjoy!
# DistributedAssignment2
