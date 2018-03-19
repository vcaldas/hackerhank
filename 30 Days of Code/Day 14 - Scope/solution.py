	# Add your code here
    def computeDifference(self):
        maxDiff = 0
        
        for i in range(len(a)):     
            for j in range(i,len(a)):
                diff = abs(a[i] - a[j])
                if(maxDiff < diff):
                    maxDiff = diff
    
    
        self.maximumDifference = maxDiff