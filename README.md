# TDT4250

Within the tdt4250.sp.model/model/ folder you can find the ecore model and generator model. 
Whereas the java code, including interfaces, utils, implementations and examples can be found in the tdt4250.sp.model/src/tdt4250/sp/ folder. 

In the examples folder there are two interesting classes, ManualCodeExample.java creates an instance of the model to see if the derived feature totalCredits of the Semester class summarizes the credits of a single semester, as intended. The other class is RunValidationExample.java which checks if the manual written constraint hasEnoughGraduateCourses works properly. This constraint checks if a semester is part of a specialization and if it is, it checks whether or not there is atleast one course at graduate level or higher. The instance file RunValidationExample.xmi can be changed so that this constraint is either true or false, depending on the level of the course 'Advanced Software Design'.
There is also a constraint written in OCL, called semesterHasEnoughCredits, which checks if each semester in a Programme has atleast 30 credits.

CourseCode is a custom datatype which is constrained using the ExtendedMetaData annotation and a pattern with the following regex: [a-zæøåA-ZÆØÅ]+[0-9]+. This ensures that the course code follows the standard pattern, otherwise an error message is given. Lastly ENUMs were chosen as the datatype to represent the possible options for a course's level and type.

