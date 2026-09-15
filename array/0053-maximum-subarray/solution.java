else{
                current_sum = nums[i];
            }

            if ( current_sum > max_sum){
                max_sum = current_sum ;
            }
        }

    }
        return max_sum;
        
}