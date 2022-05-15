# Day21_Reworked

****Welcome to the mood Ananlyzer Program****

UC1 :::: Given a Message, ability to analyse and respond Happy or Sad Mood - Create MoodAnalyser Object - Call analyseMood function with message as parameter and return Happy or Sad Mood

*TC 1.1 ::: Given “I am in Sad Mood” message Should Return SAD.*

*TC 1.1 ::: Given “I am in Happy Mood” message Should Return HAPPY.*

UC2 :::: Handle Exception if User Provides Invalid Mood - Like NULL

*TC 2.1 ::: To make this Test Case pass Handle NULL Scenario using try catch and return Happy*


UC3 :::: Inform user if entered invalid Mood. In case of NULL or Empty Mood throw Custom Exception MoodAnalysisException- Use Enum to differentiate the Mood Analysis Errors.

*TC 3.1 :: Given NULL Mood Should Throw MoodAnalysisException :- To pass this Test Case in try catch block throw MoodAnalysisException 🦖.

*TC 3.2 :: Given Empty Mood Should Throw MoodAnalysisException indicating Empty Mood :- Handle Empty Mood Scenario throw MoodAnalysisException and inform user of the EmptyMood.

*HINT: Usage Enum to EMPTY or NULL*
