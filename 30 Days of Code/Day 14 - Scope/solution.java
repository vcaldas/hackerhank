    
    public Difference(int[] elements){
        this.elements = elements;
    }

    public void computeDifference(){
        int maxDiff =0;
        int size = elements.length;
        
        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
                int diff = Math.abs(elements[j] - elements[i]);
                if(maxDiff < diff){
                    maxDiff = diff;
                }
            }
        }
        this.maximumDifference = maxDiff;
        
        
    }
