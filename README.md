# name-sorter_ByFFB



-----------------------------------------------
# What it does

This program reads in a TXT file ("unsorted-names-list.txt") list of names surname and given names spaced by one " "

i.e. the text file has within it:

Marcus Lewis

Steven Smith

Alex Smith

The program will then sort the names first by last name then by first name and produces the sorted list in a new text file called "sorted-names-list.txt"

i.e. the text file has within it:

Marcus Lewis

Alex Smith

Steven Smith


-----------------------------------------------
# How to RUN

In order to run please do (1) Or if this doesn't work (2) as a manual alternative:

First please download the file and extract it.

Automatic method

1) Copy the text file "unsorted-names-list.txt" (found at name-sorter4-main\name-sorter4-main\GlobalX) into the top-most directory of the initially extracted file.
2) If you are able to run JAVA files (JARs) then please now click the file normally (name-sorter4/GlobalX/out/artifacts/name_sorter_jar/.jar). 


Manual Method

2) If you cannot run Java files then please do the following:

- Open intellij idea and open the extracted file
- In intellij open the file in the left most pane (name-sorter4-main > name-sorter4-main > GlobalX > src)
- In the top most bar go to FILE > Projcect Structure and change "Project SDK" and "Project Language Level" to JAVA version 14
- Close this window
- Right-click the file named "unsorted-names-list.txt" (found at name-sorter4-main\name-sorter4-main\GlobalX) > COPY
- Right-click the outermost/topmost folder in intelliJ (name-sorter4-main) (or place your own text file named the same) and click > PASTE
- Please then right click the name "Main" under "src" (name-sorter4-main\name-sorter4-main\GlobalX\src)
- and hit RUN.

During a RUN the program may take you to a TESTER file if Junit cant be found, this is fine just please left-click the RED text "junit" in the top most lines of code (i.e. import org.junit.Before;) then click the red light/bell that appears to the left of the line. And  hit "Add junit4 to classpath" and hit OK on the window that appears.

Optional steps if need to
- Please right-click the folder 'test' and move your mouse down to "Mark directory As" > "test Sources Root" (Green icon)
- Please right-click the folder 'src' and move your mouse down to "Mark directory As" > "Sources Root" (Blue icon)

Then run Main again.


----------------------------------
# See it running

You will see a file created called : "sorted-names-list.txt" in the outer-most directory  And Intellij's Output window will write the sorted names.

----------------------------------
# Things to upgrade
Incorporate SOLID design principles (i.e. for the SORTER): 

https://stackoverflow.com/questions/68262576/how-to-defer-behavior-of-a-sorting-function


