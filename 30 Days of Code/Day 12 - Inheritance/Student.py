class Student(Person):
    #   Class Constructor
    #   
    #   Parameters:
    #   firstName - A string denoting the Person's first name.
    #   lastName - A string denoting the Person's last name.
    #   id - An integer denoting the Person's ID number.
    #   scores - An array of integers denoting the Person's test scores.
    #
    # Write your constructor here
    def __init__(self, firstName, lastName, idNum, scores):
        Person.__init__(self, firstName, lastName, idNum)
        self.scores = scores

    #   Function Name: calculate
    #   Return: A character denoting the grade.
    #
    # Write your function here
    
    def calculate(self):
        n = len(scores)
        sum = 0;
        for i in range(n):
            sum += scores[i]
        average = sum/n
        
        if(average<40):
            return 'T'
        elif(average<55):
            return 'D'
        elif(average<70):
            return 'P'
        elif(average<80):
            return 'A'
        elif(average<90):
            return 'E'
        else:
            return 'O'