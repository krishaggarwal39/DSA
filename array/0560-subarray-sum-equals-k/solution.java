if(sum < k){
            sum+=nums[i];
        }
            i++;
        else if (sum == k){
            count++;
        }
            sum = 0;
        else