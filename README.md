This is the virtual-pet README.md
   
   Lucy is your pet Therapy dog.   She is still a puppy, so she is not yet making 
   visits to patients in hospitals or nursing homes.  (She will need some training!)
   
   Lucy has some attributes that tell you about her state. 
   (These include name, a description, hunger level, thirst level and activity level).
   
   Lucy has a hunger level initialized to 5, a thirst level initialized to 5, 
   and an activity level initialized to 25.
   
   - If hunger level is 50 or higher, she is hungry.
   - If thirst level is 50 or higher, she is thirsty.
   - If activity level is less than 33, she needs activity.
   - If you feed her, she will need to poop.
   - If you give her water, she will need to pee.
   - If you take her for a walk, she will not need to pee or poop anymore!
   
   Lucy has some methods that you can call that reflect her actions.  These include eating,
   drinking, walking and playing ball.
   
   - After each user interaction (even if you choose to do nothing) the tick() method 
   executes to mimic the passing of time.  This increases the hunger and thirst levels 
   by +5, and decreases the activity level by 5.
   
   - If you give food or water to Lucy, it resets her hunger and thirst levels to 0. 
   She will never overeat!  
   - However, because of the passage of time (the tick() method), 
   those levels are quickly incremented by 5 and show up as 5 rather than 0 
   immediately after feeding or watering.
   
   If you take Lucy for a walk or play ball with her, her activity level resets to 75 if it
   is < 75, otherwise, the activity level increases by +5.

   Note - if you are not taking care of Lucy, she will try to take care of her own needs!
   She will eat your shoe and pee and poop inside if none of her needs are met.
   
   If all of her needs are met, the status will let you know!
	
	
Future changes to consider:
    
	add a weight attribute - increase when eat, decrease when walk or play
	add a favorite toy attribute
	add a catchFrisbee method (return true if pet catches frisbee)
	maybe a win the prize in a frisbee competition based on a random number
	
	
	