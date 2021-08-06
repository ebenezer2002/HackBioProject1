#!/usr/local/bin/python3
# a function that calculates the hamming distance
# between my slack handle and twitter handle
def hammingDistance(str1, str2):
    i = 0
    count = 0
    while (i<len(str1)):
        if(str1[i] != str2[i]):
            count += 1
        i += 1
    return count

# defining variables
name = "Odara Rapheal"
email = "odararapheal@gmail.com"
slack_username = "@odararaffy"
biostack = "Data Science"
twitter_handle = "@i_am_i_dra"
hamming_distance = hammingDistance(slack_username, twitter_handle)

#printing the desired output
print(name + "," + email + "," + slack_username + "," + biostack + "," + twitter_handle + "," +str(hamming_distance))
input()
