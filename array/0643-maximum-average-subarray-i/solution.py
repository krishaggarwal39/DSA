for i in range (k , len(nums) ) :
            while k < len(nums):


                avg = sum(nums[low+1:k+1])/k

                if(avg > max_avg):
                    max_avg = avg
                
                low = low + 1 

                k = k + 1
        
        return max_avg